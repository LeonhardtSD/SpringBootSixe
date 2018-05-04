package com.gaozhaoxi.springbootsix.controller;

import com.gaozhaoxi.springbootsix.Message.RequestMessage;
import com.gaozhaoxi.springbootsix.Message.ResponseMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Leon
 */
@Controller
public class WebsocketController {
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public ResponseMessage say(RequestMessage message){
        System.out.print(message.getName());
        return new ResponseMessage("welcome,"+message.getName()+" !");
    }
}
