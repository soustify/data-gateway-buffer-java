package com.soustify.example_two;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: example_two.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExampleTwoServiceGrpc {

  private ExampleTwoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "example_two.ExampleTwoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.soustify.example_two.ExampleTwo.ExampleTwoRequest,
      com.soustify.example_two.ExampleTwo.ExampleTwoResponse> getCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Call",
      requestType = com.soustify.example_two.ExampleTwo.ExampleTwoRequest.class,
      responseType = com.soustify.example_two.ExampleTwo.ExampleTwoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.soustify.example_two.ExampleTwo.ExampleTwoRequest,
      com.soustify.example_two.ExampleTwo.ExampleTwoResponse> getCallMethod() {
    io.grpc.MethodDescriptor<com.soustify.example_two.ExampleTwo.ExampleTwoRequest, com.soustify.example_two.ExampleTwo.ExampleTwoResponse> getCallMethod;
    if ((getCallMethod = ExampleTwoServiceGrpc.getCallMethod) == null) {
      synchronized (ExampleTwoServiceGrpc.class) {
        if ((getCallMethod = ExampleTwoServiceGrpc.getCallMethod) == null) {
          ExampleTwoServiceGrpc.getCallMethod = getCallMethod =
              io.grpc.MethodDescriptor.<com.soustify.example_two.ExampleTwo.ExampleTwoRequest, com.soustify.example_two.ExampleTwo.ExampleTwoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Call"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.example_two.ExampleTwo.ExampleTwoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.example_two.ExampleTwo.ExampleTwoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExampleTwoServiceMethodDescriptorSupplier("Call"))
              .build();
        }
      }
    }
    return getCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExampleTwoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleTwoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleTwoServiceStub>() {
        @java.lang.Override
        public ExampleTwoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleTwoServiceStub(channel, callOptions);
        }
      };
    return ExampleTwoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExampleTwoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleTwoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleTwoServiceBlockingStub>() {
        @java.lang.Override
        public ExampleTwoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleTwoServiceBlockingStub(channel, callOptions);
        }
      };
    return ExampleTwoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExampleTwoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleTwoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleTwoServiceFutureStub>() {
        @java.lang.Override
        public ExampleTwoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleTwoServiceFutureStub(channel, callOptions);
        }
      };
    return ExampleTwoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void call(com.soustify.example_two.ExampleTwo.ExampleTwoRequest request,
        io.grpc.stub.StreamObserver<com.soustify.example_two.ExampleTwo.ExampleTwoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExampleTwoService.
   */
  public static abstract class ExampleTwoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ExampleTwoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ExampleTwoService.
   */
  public static final class ExampleTwoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ExampleTwoServiceStub> {
    private ExampleTwoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleTwoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleTwoServiceStub(channel, callOptions);
    }

    /**
     */
    public void call(com.soustify.example_two.ExampleTwo.ExampleTwoRequest request,
        io.grpc.stub.StreamObserver<com.soustify.example_two.ExampleTwo.ExampleTwoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExampleTwoService.
   */
  public static final class ExampleTwoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ExampleTwoServiceBlockingStub> {
    private ExampleTwoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleTwoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleTwoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.soustify.example_two.ExampleTwo.ExampleTwoResponse call(com.soustify.example_two.ExampleTwo.ExampleTwoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExampleTwoService.
   */
  public static final class ExampleTwoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ExampleTwoServiceFutureStub> {
    private ExampleTwoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleTwoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleTwoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.soustify.example_two.ExampleTwo.ExampleTwoResponse> call(
        com.soustify.example_two.ExampleTwo.ExampleTwoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALL:
          serviceImpl.call((com.soustify.example_two.ExampleTwo.ExampleTwoRequest) request,
              (io.grpc.stub.StreamObserver<com.soustify.example_two.ExampleTwo.ExampleTwoResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCallMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.soustify.example_two.ExampleTwo.ExampleTwoRequest,
              com.soustify.example_two.ExampleTwo.ExampleTwoResponse>(
                service, METHODID_CALL)))
        .build();
  }

  private static abstract class ExampleTwoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExampleTwoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.soustify.example_two.ExampleTwo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExampleTwoService");
    }
  }

  private static final class ExampleTwoServiceFileDescriptorSupplier
      extends ExampleTwoServiceBaseDescriptorSupplier {
    ExampleTwoServiceFileDescriptorSupplier() {}
  }

  private static final class ExampleTwoServiceMethodDescriptorSupplier
      extends ExampleTwoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ExampleTwoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ExampleTwoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExampleTwoServiceFileDescriptorSupplier())
              .addMethod(getCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
