package com.bobo.rpc;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Peer {
    private String host;
    private int port;
}
