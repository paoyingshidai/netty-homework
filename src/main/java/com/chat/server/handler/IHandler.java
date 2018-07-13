package com.chat.server.handler;

import io.netty.channel.ChannelHandlerContext;

public interface IHandler<T> {
	
	void handle(ChannelHandlerContext ctx, T t);

}
