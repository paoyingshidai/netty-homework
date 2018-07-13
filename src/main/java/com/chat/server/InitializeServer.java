package com.chat.server;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.chat.commons.obj.proto.LoginReqProto;
import com.chat.server.handler.DiscardServerHandler;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketServerCompressionHandler;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import lombok.extern.slf4j.Slf4j;

//@Component
@Slf4j
public class InitializeServer implements ApplicationContextAware {

    private int port = 8888;

    private int ws_port = 8099;

    @Override
    public void setApplicationContext(ApplicationContext arg0) throws BeansException {

    }

    @PostConstruct
    private void initChatServer() {

        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        log.info("初始化Server");
        try {
//
//            ServerBootstrap rawTcpBootstrap = new ServerBootstrap();
//            rawTcpBootstrap.group(bossGroup, workerGroup)
//                .channel(NioServerSocketChannel.class)
//                .childHandler(new ChannelInitializer<SocketChannel>() {
//
//                    @Override
//                    public void initChannel(SocketChannel ch) throws Exception {
//
//                        ch.pipeline().addLast(
//                                new ProtobufVarint32FrameDecoder(),
//                                new ProtobufVarint32LengthFieldPrepender(),
//                                new ProtobufDecoder(LoginReqProto.LoginReq.getDefaultInstance()),
//                                new ProtobufEncoder(),
//                                new DiscardServerHandler());
//                    }
//                })
//                .option(ChannelOption.SO_BACKLOG, 128)
//                .option(ChannelOption.SO_SNDBUF, 64 * 1024)
//                .option(ChannelOption.SO_RCVBUF, 64 * 1024)
//                .option(ChannelOption.TCP_NODELAY, true)
//                .childOption(ChannelOption.TCP_NODELAY, true)
//                .childOption(ChannelOption.SO_KEEPALIVE, true);
//
//            rawTcpBootstrap.bind(port).sync();
//
//            log.info("raw tcp server already start");

            ServerBootstrap wsBootstrap = new ServerBootstrap();
            wsBootstrap.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<SocketChannel>() {

                    @Override
                    public void initChannel(SocketChannel ch) throws Exception {

                        ch.pipeline().addLast(
                                 new HttpServerCodec(),
                                 new HttpObjectAggregator(1024 * 64),
                                 new WebSocketServerCompressionHandler(),
                                 new WebSocketServerProtocolHandler("/chat", null, true),
                                 new MessageToMessageDecoder<WebSocketFrame>() {

                                    @Override
                                    protected void decode(ChannelHandlerContext ctx,
                                            WebSocketFrame msg, List<Object> objs)
                                                    throws Exception {

                                        if (msg instanceof BinaryWebSocketFrame) {
                                            ByteBuf buf = ((BinaryWebSocketFrame) msg).content();
                                            objs.add(buf);
                                            log.info("BinaryWebSocketFrame");
                                            buf.retain();
                                        }
                                    }

                                 },
                                 new ProtobufDecoder(LoginReqProto.LoginReq.getDefaultInstance()),
                                 new ProtobufVarint32LengthFieldPrepender(),

                                 new MessageToMessageEncoder<MessageLiteOrBuilder>() {

                                    @Override
                                    protected void encode(ChannelHandlerContext ctx,
                                            MessageLiteOrBuilder msg, List<Object> out)
                                                    throws Exception {

                                        if (msg instanceof MessageLite) {
                                            ByteBuf bf = Unpooled.wrappedBuffer(((MessageLite) msg).toByteArray());
                                            out.add(new BinaryWebSocketFrame(bf));
                                            return;
                                        }
                                        if (msg instanceof MessageLite.Builder) {
                                            ByteBuf bf = Unpooled.wrappedBuffer(((MessageLite.Builder) msg).build().toByteArray());
                                            out.add(new BinaryWebSocketFrame(bf));
                                        }
                                    }
                                 },
                                 new DiscardServerHandler());
                    }
                })
                .option(ChannelOption.SO_BACKLOG, 128)
                .childOption(ChannelOption.SO_KEEPALIVE, true);

            wsBootstrap.bind(8022).sync();

            log.info("websocket server already start");

        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

}
