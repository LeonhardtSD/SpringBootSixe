package com.gaozhaoxi.springbootsix.Message;

/**
 * @author Leon
 */
public class ResponseMessage {
    private String responseMessage;

    public ResponseMessage(String responseMessage){
        this.responseMessage=responseMessage;
    }
    public String getResponseMessage(){
        return responseMessage;
    }
}
