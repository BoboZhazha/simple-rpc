package com.bobo.rpc;


import lombok.Data;

@Data
public class Response {
    /**
     * 0是成功, 非0是失败
     */
    private int code = 0;
    private String message = "ok";
    private Object data;



}

