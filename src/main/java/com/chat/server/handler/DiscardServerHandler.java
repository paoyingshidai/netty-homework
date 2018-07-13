package com.chat.server.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.commons.obj.proto.LoginReqProto;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;
import lombok.extern.slf4j.Slf4j;

@Service
@Sharable
@Slf4j
public class DiscardServerHandler extends ChannelInboundHandlerAdapter {

	@Autowired
	private UserLoginHandler userLoginHandler;

	@Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        try {

        	if (msg instanceof LoginReqProto.LoginReq) {
        	    log.info("BinaryWebSocketFrame");
        		userLoginHandler.handle(ctx, (LoginReqProto.LoginReq) msg);
        	} else {
        		log.error("unsupport type: {}" + msg);
        	}
        } finally {
            ReferenceCountUtil.release(msg);
        }
    }

    @Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
    	super.channelActive(ctx);
	}

	@Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        ctx.close();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    }

}
