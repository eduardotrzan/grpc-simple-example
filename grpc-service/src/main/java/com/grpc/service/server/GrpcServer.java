package com.grpc.service.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

import com.grpc.service.client.impl.UserGrpcService;

public class GrpcServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(9090)
                .addService(new UserGrpcService())
                .build();
        server.start().awaitTermination();
    }
}
