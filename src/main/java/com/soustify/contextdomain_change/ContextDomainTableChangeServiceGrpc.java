package com.soustify.contextdomain_change;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: context_domain_table_change.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ContextDomainTableChangeServiceGrpc {

  private ContextDomainTableChangeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "contextdomain_change.ContextDomainTableChangeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.soustify.contextdomain_change.ContextDomainTableChange.ContextDomainTableChangeRequest,
      com.soustify.output.Output.PersistenceDataResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.soustify.contextdomain_change.ContextDomainTableChange.ContextDomainTableChangeRequest.class,
      responseType = com.soustify.output.Output.PersistenceDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.soustify.contextdomain_change.ContextDomainTableChange.ContextDomainTableChangeRequest,
      com.soustify.output.Output.PersistenceDataResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.soustify.contextdomain_change.ContextDomainTableChange.ContextDomainTableChangeRequest, com.soustify.output.Output.PersistenceDataResponse> getCreateMethod;
    if ((getCreateMethod = ContextDomainTableChangeServiceGrpc.getCreateMethod) == null) {
      synchronized (ContextDomainTableChangeServiceGrpc.class) {
        if ((getCreateMethod = ContextDomainTableChangeServiceGrpc.getCreateMethod) == null) {
          ContextDomainTableChangeServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.soustify.contextdomain_change.ContextDomainTableChange.ContextDomainTableChangeRequest, com.soustify.output.Output.PersistenceDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.contextdomain_change.ContextDomainTableChange.ContextDomainTableChangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.PersistenceDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContextDomainTableChangeServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContextDomainTableChangeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContextDomainTableChangeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContextDomainTableChangeServiceStub>() {
        @java.lang.Override
        public ContextDomainTableChangeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContextDomainTableChangeServiceStub(channel, callOptions);
        }
      };
    return ContextDomainTableChangeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContextDomainTableChangeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContextDomainTableChangeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContextDomainTableChangeServiceBlockingStub>() {
        @java.lang.Override
        public ContextDomainTableChangeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContextDomainTableChangeServiceBlockingStub(channel, callOptions);
        }
      };
    return ContextDomainTableChangeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContextDomainTableChangeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContextDomainTableChangeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContextDomainTableChangeServiceFutureStub>() {
        @java.lang.Override
        public ContextDomainTableChangeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContextDomainTableChangeServiceFutureStub(channel, callOptions);
        }
      };
    return ContextDomainTableChangeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<com.soustify.contextdomain_change.ContextDomainTableChange.ContextDomainTableChangeRequest> create(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ContextDomainTableChangeService.
   */
  public static abstract class ContextDomainTableChangeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ContextDomainTableChangeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ContextDomainTableChangeService.
   */
  public static final class ContextDomainTableChangeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ContextDomainTableChangeServiceStub> {
    private ContextDomainTableChangeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContextDomainTableChangeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContextDomainTableChangeServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.soustify.contextdomain_change.ContextDomainTableChange.ContextDomainTableChangeRequest> create(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ContextDomainTableChangeService.
   */
  public static final class ContextDomainTableChangeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ContextDomainTableChangeServiceBlockingStub> {
    private ContextDomainTableChangeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContextDomainTableChangeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContextDomainTableChangeServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ContextDomainTableChangeService.
   */
  public static final class ContextDomainTableChangeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ContextDomainTableChangeServiceFutureStub> {
    private ContextDomainTableChangeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContextDomainTableChangeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContextDomainTableChangeServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CREATE = 0;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.create(
              (io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.soustify.contextdomain_change.ContextDomainTableChange.ContextDomainTableChangeRequest,
              com.soustify.output.Output.PersistenceDataResponse>(
                service, METHODID_CREATE)))
        .build();
  }

  private static abstract class ContextDomainTableChangeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContextDomainTableChangeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.soustify.contextdomain_change.ContextDomainTableChange.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContextDomainTableChangeService");
    }
  }

  private static final class ContextDomainTableChangeServiceFileDescriptorSupplier
      extends ContextDomainTableChangeServiceBaseDescriptorSupplier {
    ContextDomainTableChangeServiceFileDescriptorSupplier() {}
  }

  private static final class ContextDomainTableChangeServiceMethodDescriptorSupplier
      extends ContextDomainTableChangeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ContextDomainTableChangeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ContextDomainTableChangeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContextDomainTableChangeServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
