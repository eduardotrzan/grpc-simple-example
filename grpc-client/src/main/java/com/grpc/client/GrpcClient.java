package com.grpc.client;

import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import com.grpc.service.client.User;
import com.grpc.service.client.UserClientGrpc;

@Slf4j
public class GrpcClient {

    public static void main(String[] args) {
        var channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        UserClientGrpc.UserClientBlockingStub userClientBlockingStub = UserClientGrpc.newBlockingStub(channel);

        User.LoginRequest request = User.LoginRequest.newBuilder().setUsername("Hello").setPassword("Hello").build();
        User.LoginResponse response = userClientBlockingStub.login(request);

        log.info("response: {}", response);
    }

}
