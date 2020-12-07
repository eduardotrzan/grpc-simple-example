package com.grpc.service.client.impl;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import com.grpc.service.client.User;
import com.grpc.service.client.UserClientGrpc;

@Slf4j
public class UserGrpcService extends UserClientGrpc.UserClientImplBase {

    @Override
    public void login(User.LoginRequest request, StreamObserver<User.LoginResponse> responseObserver) {
        log.info("request username={} and password={}",
                request.getUsername(), request.getPassword());

        var responseBuilder = User.LoginResponse.newBuilder();
        if (request.getUsername().equals(request.getPassword())) {
            responseBuilder
                    .setResponseMessage("Valid")
                    .setResponseCode(0);
        } else {
            responseBuilder
                    .setResponseMessage("Invalid")
                    .setResponseCode(1);
        }

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void logout(User.LogoutRequest request, StreamObserver<User.LoginResponse> responseObserver) {
        log.info("request request={}",
                request);
    }
}
