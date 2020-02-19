package com.bobo.rpc.common.utils;

import com.sun.org.apache.regexp.internal.REUtil;
import com.sun.xml.internal.bind.v2.model.runtime.RuntimeReferencePropertyInfo;

public class TestClass {


    private String a() {
        return "a";
    }

    public String b() {
        System.out.println("我被调用了");
        return "b";
    }

    protected String c() {
        return "c";
    }

    // public String d() {
    //     return "d";
    // }
}
