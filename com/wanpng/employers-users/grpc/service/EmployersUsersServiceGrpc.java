package com.wanpng.employers-users.grpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: protos/service/employers_users_service.grpc.proto")
public final class EmployersUsersServiceGrpc {

  private EmployersUsersServiceGrpc() {}

  public static final String SERVICE_NAME = "protos.service.EmployersUsersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wanpng.employers-users.grpc.service.UpdateCompanyProfileRequest,
      com.wanpng.employers-users.grpc.service.UpdateCompanyProfileResponse> getUpdateCompanyProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCompanyProfile",
      requestType = com.wanpng.employers-users.grpc.service.UpdateCompanyProfileRequest.class,
      responseType = com.wanpng.employers-users.grpc.service.UpdateCompanyProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wanpng.employers-users.grpc.service.UpdateCompanyProfileRequest,
      com.wanpng.employers-users.grpc.service.UpdateCompanyProfileResponse> getUpdateCompanyProfileMethod() {
    io.grpc.MethodDescriptor<com.wanpng.employers-users.grpc.service.UpdateCompanyProfileRequest, com.wanpng.employers-users.grpc.service.UpdateCompanyProfileResponse> getUpdateCompanyProfileMethod;
    if ((getUpdateCompanyProfileMethod = EmployersUsersServiceGrpc.getUpdateCompanyProfileMethod) == null) {
      synchronized (EmployersUsersServiceGrpc.class) {
        if ((getUpdateCompanyProfileMethod = EmployersUsersServiceGrpc.getUpdateCompanyProfileMethod) == null) {
          EmployersUsersServiceGrpc.getUpdateCompanyProfileMethod = getUpdateCompanyProfileMethod =
              io.grpc.MethodDescriptor.<com.wanpng.employers-users.grpc.service.UpdateCompanyProfileRequest, com.wanpng.employers-users.grpc.service.UpdateCompanyProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCompanyProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.employers-users.grpc.service.UpdateCompanyProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wanpng.employers-users.grpc.service.UpdateCompanyProfileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployersUsersServiceMethodDescriptorSupplier("UpdateCompanyProfile"))
              .build();
        }
      }
    }
    return getUpdateCompanyProfileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployersUsersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployersUsersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployersUsersServiceStub>() {
        @java.lang.Override
        public EmployersUsersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployersUsersServiceStub(channel, callOptions);
        }
      };
    return EmployersUsersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployersUsersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployersUsersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployersUsersServiceBlockingStub>() {
        @java.lang.Override
        public EmployersUsersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployersUsersServiceBlockingStub(channel, callOptions);
        }
      };
    return EmployersUsersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployersUsersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployersUsersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployersUsersServiceFutureStub>() {
        @java.lang.Override
        public EmployersUsersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployersUsersServiceFutureStub(channel, callOptions);
        }
      };
    return EmployersUsersServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EmployersUsersServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void updateCompanyProfile(com.wanpng.employers-users.grpc.service.UpdateCompanyProfileRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.employers-users.grpc.service.UpdateCompanyProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCompanyProfileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateCompanyProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wanpng.employers-users.grpc.service.UpdateCompanyProfileRequest,
                com.wanpng.employers-users.grpc.service.UpdateCompanyProfileResponse>(
                  this, METHODID_UPDATE_COMPANY_PROFILE)))
          .build();
    }
  }

  /**
   */
  public static final class EmployersUsersServiceStub extends io.grpc.stub.AbstractAsyncStub<EmployersUsersServiceStub> {
    private EmployersUsersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployersUsersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployersUsersServiceStub(channel, callOptions);
    }

    /**
     */
    public void updateCompanyProfile(com.wanpng.employers-users.grpc.service.UpdateCompanyProfileRequest request,
        io.grpc.stub.StreamObserver<com.wanpng.employers-users.grpc.service.UpdateCompanyProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCompanyProfileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmployersUsersServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EmployersUsersServiceBlockingStub> {
    private EmployersUsersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployersUsersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployersUsersServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wanpng.employers-users.grpc.service.UpdateCompanyProfileResponse updateCompanyProfile(com.wanpng.employers-users.grpc.service.UpdateCompanyProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCompanyProfileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployersUsersServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EmployersUsersServiceFutureStub> {
    private EmployersUsersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployersUsersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployersUsersServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanpng.employers-users.grpc.service.UpdateCompanyProfileResponse> updateCompanyProfile(
        com.wanpng.employers-users.grpc.service.UpdateCompanyProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCompanyProfileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_COMPANY_PROFILE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployersUsersServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployersUsersServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_COMPANY_PROFILE:
          serviceImpl.updateCompanyProfile((com.wanpng.employers-users.grpc.service.UpdateCompanyProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.wanpng.employers-users.grpc.service.UpdateCompanyProfileResponse>) responseObserver);
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

  private static abstract class EmployersUsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployersUsersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wanpng.employers-users.grpc.service.EmployersUsersServiceProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployersUsersService");
    }
  }

  private static final class EmployersUsersServiceFileDescriptorSupplier
      extends EmployersUsersServiceBaseDescriptorSupplier {
    EmployersUsersServiceFileDescriptorSupplier() {}
  }

  private static final class EmployersUsersServiceMethodDescriptorSupplier
      extends EmployersUsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployersUsersServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployersUsersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployersUsersServiceFileDescriptorSupplier())
              .addMethod(getUpdateCompanyProfileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
