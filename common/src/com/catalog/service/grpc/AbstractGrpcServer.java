package com.catalog.service.grpc;

import io.grpc.Server;

public abstract class AbstractGrpcServer {

    public abstract int getPort();
    public Server server;

}
