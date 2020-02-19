package com.bobo.rpc.codec;


/**
 * 二进制数组转成对象
 */
public interface Decoder {
    <T> T decode(byte[] bytes, Class<T> clazz);
}
