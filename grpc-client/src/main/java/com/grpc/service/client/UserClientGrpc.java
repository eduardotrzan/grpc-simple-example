package com.grpc.service.client;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.0)",
    comments = "Source: user.proto")
public final class UserClientGrpc {

  private UserClientGrpc() {}

  public static final String SERVICE_NAME = "UserClient";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.service.client.User.LoginRequest,
      com.grpc.service.client.User.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.grpc.service.client.User.LoginRequest.class,
      responseType = com.grpc.service.client.User.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.service.client.User.LoginRequest,
      com.grpc.service.client.User.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.grpc.service.client.User.LoginRequest, com.grpc.service.client.User.LoginResponse> getLoginMethod;
    if ((getLoginMethod = UserClientGrpc.getLoginMethod) == null) {
      synchronized (UserClientGrpc.class) {
        if ((getLoginMethod = UserClientGrpc.getLoginMethod) == null) {
          UserClientGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<com.grpc.service.client.User.LoginRequest, com.grpc.service.client.User.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.service.client.User.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.service.client.User.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserClientMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.service.client.User.LogoutRequest,
      com.grpc.service.client.User.LoginResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = com.grpc.service.client.User.LogoutRequest.class,
      responseType = com.grpc.service.client.User.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.service.client.User.LogoutRequest,
      com.grpc.service.client.User.LoginResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.grpc.service.client.User.LogoutRequest, com.grpc.service.client.User.LoginResponse> getLogoutMethod;
    if ((getLogoutMethod = UserClientGrpc.getLogoutMethod) == null) {
      synchronized (UserClientGrpc.class) {
        if ((getLogoutMethod = UserClientGrpc.getLogoutMethod) == null) {
          UserClientGrpc.getLogoutMethod = getLogoutMethod =
              io.grpc.MethodDescriptor.<com.grpc.service.client.User.LogoutRequest, com.grpc.service.client.User.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.service.client.User.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.service.client.User.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserClientMethodDescriptorSupplier("logout"))
              .build();
        }
      }
    }
    return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserClientStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserClientStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserClientStub>() {
        @java.lang.Override
        public UserClientStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserClientStub(channel, callOptions);
        }
      };
    return UserClientStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserClientBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserClientBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserClientBlockingStub>() {
        @java.lang.Override
        public UserClientBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserClientBlockingStub(channel, callOptions);
        }
      };
    return UserClientBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserClientFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserClientFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserClientFutureStub>() {
        @java.lang.Override
        public UserClientFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserClientFutureStub(channel, callOptions);
        }
      };
    return UserClientFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserClientImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(com.grpc.service.client.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.grpc.service.client.User.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(com.grpc.service.client.User.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.grpc.service.client.User.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.service.client.User.LoginRequest,
                com.grpc.service.client.User.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.service.client.User.LogoutRequest,
                com.grpc.service.client.User.LoginResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class UserClientStub extends io.grpc.stub.AbstractAsyncStub<UserClientStub> {
    private UserClientStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserClientStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserClientStub(channel, callOptions);
    }

    /**
     */
    public void login(com.grpc.service.client.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.grpc.service.client.User.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.grpc.service.client.User.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.grpc.service.client.User.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserClientBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserClientBlockingStub> {
    private UserClientBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserClientBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserClientBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.service.client.User.LoginResponse login(com.grpc.service.client.User.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.service.client.User.LoginResponse logout(com.grpc.service.client.User.LogoutRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserClientFutureStub extends io.grpc.stub.AbstractFutureStub<UserClientFutureStub> {
    private UserClientFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserClientFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserClientFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.service.client.User.LoginResponse> login(
        com.grpc.service.client.User.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.service.client.User.LoginResponse> logout(
        com.grpc.service.client.User.LogoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserClientImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserClientImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.grpc.service.client.User.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.service.client.User.LoginResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.grpc.service.client.User.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.service.client.User.LoginResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserClientBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.service.client.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserClient");
    }
  }

  private static final class UserClientFileDescriptorSupplier
      extends UserClientBaseDescriptorSupplier {
    UserClientFileDescriptorSupplier() {}
  }

  private static final class UserClientMethodDescriptorSupplier
      extends UserClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserClientMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserClientGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserClientFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
