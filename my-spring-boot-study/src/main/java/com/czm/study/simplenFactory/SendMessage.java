package com.czm.study.simplenFactory;

/**
 * Created by CHENZHANMEI on 2017/6/23 0023.
 * 简单工厂模式
 * 定义一个统一的接口,由不同的实例是实现
 */
public interface SendMessage {
    /**
     * 定义一个统一发送接口
     *
     * @return
     */
    String send();
}
