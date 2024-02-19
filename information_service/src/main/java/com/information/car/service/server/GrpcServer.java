package com.information.car.service.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GrpcServer {

    @Value("${grpc.server.port:9090}")
    private int port;

//    private Server
}
