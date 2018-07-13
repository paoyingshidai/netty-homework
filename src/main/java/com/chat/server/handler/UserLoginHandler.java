package com.chat.server.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.commons.code.LoginResultCode;
import com.chat.commons.obj.proto.LoginReqProto;
import com.chat.commons.obj.proto.LoginRespProto.LoginResp;
import com.chat.service.IUserService;

import io.netty.channel.ChannelHandlerContext;

@Service
public class UserLoginHandler implements IHandler<LoginReqProto.LoginReq> {
	
	@Autowired
	private IUserService userService;
	
	@Override
	public void handle(ChannelHandlerContext ctx, LoginReqProto.LoginReq req) {
		 String userName = req.getUserName();
		 String password = req.getPassword();
		 
		 if (userService.login(userName, password)) {
			 
			 LoginResp resp = LoginResp.newBuilder()
					 	.setResultCode(LoginResultCode.SUCCESS)
					 	.build();
			 
			 ctx.writeAndFlush(resp);
			 
		 } else {
			 LoginResp resp = LoginResp.newBuilder()
					 	.setResultCode(LoginResultCode.FATAL)
					 	.build();
			 
			 ctx.writeAndFlush(resp);
		 }
	}

}
