package com.zhang.rpc.server;

import com.bobo.rpc.codec.Decoder;
import com.bobo.rpc.codec.Encoder;
import com.bobo.rpc.codec.JSONDecoder;
import com.bobo.rpc.codec.JSONEncoder;
import com.zhang.rpc.transport.HTTPTransportServer;
import com.zhang.rpc.transport.TransportServer;
import lombok.Data;

@Data
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HTTPTransportServer.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port = 3000;
}
