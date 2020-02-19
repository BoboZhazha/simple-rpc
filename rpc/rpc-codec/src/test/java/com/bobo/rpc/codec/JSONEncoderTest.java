package com.bobo.rpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONEncoderTest {

    @Test
    public void encode() {

        Encoder encoder = new JSONEncoder();

        TestBean bean = new TestBean();
        bean.setName("zhang");
        bean.setAge(22);

        TestBean bean2 = new TestBean();
        bean2.setName("wan");
        bean2.setAge(88);

        byte[] bytes = encoder.encode(bean);
        byte[] bytes2 = encoder.encode(bean2);


        Decoder decoder = new JSONDecoder();

        TestBean mybean = decoder.decode(bytes, TestBean.class);
        TestBean mybean2 = decoder.decode(bytes2, TestBean.class);

        System.out.println(mybean);
        System.out.println(mybean2);
        assertNotNull(mybean);
    }
}