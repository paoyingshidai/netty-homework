(function(document, window, $) {

	'use strict';

	var LoginReq;
	var LoginResp;

	var $form = $('#form');

	var $userName = $form.find(':input[name="userName"]');
	var $password = $form.find(':input[name="password"]');
	var $login = $form.find(':input[name="login"]');

	var ws;

	var isConnected = false;

	protobuf.load("proto/LoginReq.proto", function(err, root) {
	    if (err) {
          throw err;
	    }
	    LoginReq = root.lookupType("com.chat.commons.obj.proto.LoginReq");
    });

	protobuf.load("proto/LoginResp.proto", function(err, root) {
	    if (err) {
          throw err;
	    }
	    LoginResp = root.lookupType("com.chat.commons.obj.proto.LoginResp");
    });

	$login.on('click', function(e) {
		alert("点击");
		if (!isConnected) {
			init_ws();
		}

		send_login_req();
	});

	function send_login_req() {
		alert("send_message");
	    var userName = $userName.val();
		var password = $password.val();

		var req = LoginReq.create();
		req.userName = userName;
	    req.password = password;

	    var payload = LoginReq.encode(req).finish();

        ws.send(payload);
	}

	function init_ws() {
		alert("init_ws");
		ws = new WebSocket("ws://localhost:8099/chat");
		ws.binaryType = 'arraybuffer';

	    ws.onopen = function(evt) {
	    	isConnected = true;

			send_login_req();
        };

        ws.onclose = function(evt) {
        	isConnected = false;
		    console.log("ws onclose: " + evt);
        };

        ws.onmessage = function(evt) {
		    var payload = evt.data;
		    var hasError = LoginResp.verify(payload);
            if (hasError) {
                throw hasError;
		    }
		    var s = new Uint8Array(payload);
            var resp = LoginResp.decode(s);

            switch (resp.resultCode) {

            case 1:
            	alert('success');
            	break;

            case 2:
            	alert('fatal');
            	break;

            default:
            	alert('unkonw result code: ' + resp.resultCode);
        		break;
            }
        };

        ws.onerror = function(evt) {
		    console.log("ws onerror: " + evt);
        };
	}

})(document, window, jQuery);