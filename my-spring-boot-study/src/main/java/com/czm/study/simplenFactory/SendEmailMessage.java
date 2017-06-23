package com.czm.study.simplenFactory;

/**
 * Created by CHENZHANMEI on 2017/6/23 0023.
 */
public class SendEmailMessage implements SendMessage {


    @Override
    public String send() {
        return "sendEmailMessage ....................";
    }
}
