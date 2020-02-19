package com.bobo.rpc.codec;

/**
 * 序列化, 将对象转成byte数组
 */
public interface Encoder {

    byte[] encode(Object obj);
}
