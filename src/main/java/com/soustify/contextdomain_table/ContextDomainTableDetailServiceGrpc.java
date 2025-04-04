package com.soustify.contextdomain_table;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: context_domain_table_detail.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ContextDomainTableDetailServiceGrpc {

  private ContextDomainTableDetailServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "contextdomain_table.ContextDomainTableDetailService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.soustify.contextdomain_table.ContextDomainTableDetail.ContextDomainTableDetailRequest,
      com.soustify.output.Output.PersistenceDataResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.soustify.contextdomain_table.ContextDomainTableDetail.ContextDomainTableDetailRequest.class,
      responseType = com.soustify.output.Output.PersistenceDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.soustify.contextdomain_table.ContextDomainTableDetail.ContextDomainTableDetailRequest,
      com.soustify.output.Output.PersistenceDataResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.soustify.contextdomain_table.ContextDomainTableDetail.ContextDomainTableDetailRequest, com.soustify.output.Output.PersistenceDataResponse> getCreateMethod;
    if ((getCreateMethod = ContextDomainTableDetailServiceGrpc.getCreateMethod) == null) {
      synchronized (ContextDomainTableDetailServiceGrpc.class) {
        if ((getCreateMethod = ContextDomainTableDetailServiceGrpc.getCreateMethod) == null) {
          ContextDomainTableDetailServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.soustify.contextdomain_table.ContextDomainTableDetail.ContextDomainTableDetailRequest, com.soustify.output.Output.PersistenceDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.contextdomain_table.ContextDomainTableDetail.ContextDomainTableDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.PersistenceDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContextDomainTableDetailServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContextDomainTableDetailServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContextDomainTableDetailServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContextDomainTableDetailServiceStub>() {
        @java.lang.Override
        public ContextDomainTableDetailServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContextDomainTableDetailServiceStub(channel, callOptions);
        }
      };
    return ContextDomainTableDetailServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContextDomainTableDetailServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContextDomainTableDetailServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContextDomainTableDetailServiceBlockingStub>() {
        @java.lang.Override
        public ContextDomainTableDetailServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContextDomainTableDetailServiceBlockingStub(channel, callOptions);
        }
      };
    return ContextDomainTableDetailServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContextDomainTableDetailServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContextDomainTableDetailServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContextDomainTableDetailServiceFutureStub>() {
        @java.lang.Override
        public ContextDomainTableDetailServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContextDomainTableDetailServiceFutureStub(channel, callOptions);
        }
      };
    return ContextDomainTableDetailServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<com.soustify.contextdomain_table.ContextDomainTableDetail.ContextDomainTableDetailRequest> create(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ContextDomainTableDetailService.
   */
  public static abstract class ContextDomainTableDetailServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ContextDomainTableDetailServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ContextDomainTableDetailService.
   */
  public static final class ContextDomainTableDetailServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ContextDomainTableDetailServiceStub> {
    private ContextDomainTableDetailServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContextDomainTableDetailServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContextDomainTableDetailServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.soustify.contextdomain_table.ContextDomainTableDetail.ContextDomainTableDetailRequest> create(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ContextDomainTableDetailService.
   */
  public static final class ContextDomainTableDetailServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ContextDomainTableDetailServiceBlockingStub> {
    private ContextDomainTableDetailServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContextDomainTableDetailServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContextDomainTableDetailServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ContextDomainTableDetailService.
   */
  public static final class ContextDomainTableDetailServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ContextDomainTableDetailServiceFutureStub> {
    private ContextDomainTableDetailServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContextDomainTableDetailServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContextDomainTableDetailServiceFutureStub(channel, callOptions);
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
              com.soustify.contextdomain_table.ContextDomainTableDetail.ContextDomainTableDetailRequest,
              com.soustify.output.Output.PersistenceDataResponse>(
                service, METHODID_CREATE)))
        .build();
  }

  private static abstract class ContextDomainTableDetailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContextDomainTableDetailServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.soustify.contextdomain_table.ContextDomainTableDetail.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContextDomainTableDetailService");
    }
  }

  private static final class ContextDomainTableDetailServiceFileDescriptorSupplier
      extends ContextDomainTableDetailServiceBaseDescriptorSupplier {
    ContextDomainTableDetailServiceFileDescriptorSupplier() {}
  }

  private static final class ContextDomainTableDetailServiceMethodDescriptorSupplier
      extends ContextDomainTableDetailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ContextDomainTableDetailServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ContextDomainTableDetailServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContextDomainTableDetailServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
