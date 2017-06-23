package com.czm.study.simplenFactory;

/**
 * Created by CHENZHANMEI on 2017/6/23 0023.
 */
public class SimplenFactoryTest {

    /**
     * 简单工厂模式
     *
     * @param args
     */

    public static void main(String[] args) {

        //使用统一的接口去实现  使用是只需要调用具体的实体类就行
        send("sms");
        send("email");

    }

    public static void send(String type) {
        if (type.equals("email")) {
            SendMessage sendEmail = new SendEmailMessage();
            System.out.println(sendEmail.send());
        } else if ("sms".equals(type)) {
            SendMessage sendSMS = new SendSmsMessage();
            System.out.println(sendSMS.send());
        }


    }


}
