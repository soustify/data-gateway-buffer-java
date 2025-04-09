package com.soustify.contextdomain_transaction;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: context_domain_transaction.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ContextDomainTransactionServiceGrpc {

  private ContextDomainTransactionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "contextdomain_transaction.ContextDomainTransactionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionRequest,
      com.soustify.output.Output.PersistenceDataResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionRequest.class,
      responseType = com.soustify.output.Output.PersistenceDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionRequest,
      com.soustify.output.Output.PersistenceDataResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionRequest, com.soustify.output.Output.PersistenceDataResponse> getCreateMethod;
    if ((getCreateMethod = ContextDomainTransactionServiceGrpc.getCreateMethod) == null) {
      synchronized (ContextDomainTransactionServiceGrpc.class) {
        if ((getCreateMethod = ContextDomainTransactionServiceGrpc.getCreateMethod) == null) {
          ContextDomainTransactionServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionRequest, com.soustify.output.Output.PersistenceDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.PersistenceDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContextDomainTransactionServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest,
      com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionResponse> getFindOneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindOne",
      requestType = com.soustify.input.Input.UUIDRequest.class,
      responseType = com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest,
      com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionResponse> getFindOneMethod() {
    io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest, com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionResponse> getFindOneMethod;
    if ((getFindOneMethod = ContextDomainTransactionServiceGrpc.getFindOneMethod) == null) {
      synchronized (ContextDomainTransactionServiceGrpc.class) {
        if ((getFindOneMethod = ContextDomainTransactionServiceGrpc.getFindOneMethod) == null) {
          ContextDomainTransactionServiceGrpc.getFindOneMethod = getFindOneMethod =
              io.grpc.MethodDescriptor.<com.soustify.input.Input.UUIDRequest, com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindOne"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.input.Input.UUIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContextDomainTransactionServiceMethodDescriptorSupplier("FindOne"))
              .build();
        }
      }
    }
    return getFindOneMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContextDomainTransactionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContextDomainTransactionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContextDomainTransactionServiceStub>() {
        @java.lang.Override
        public ContextDomainTransactionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContextDomainTransactionServiceStub(channel, callOptions);
        }
      };
    return ContextDomainTransactionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContextDomainTransactionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContextDomainTransactionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContextDomainTransactionServiceBlockingStub>() {
        @java.lang.Override
        public ContextDomainTransactionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContextDomainTransactionServiceBlockingStub(channel, callOptions);
        }
      };
    return ContextDomainTransactionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContextDomainTransactionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContextDomainTransactionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContextDomainTransactionServiceFutureStub>() {
        @java.lang.Override
        public ContextDomainTransactionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContextDomainTransactionServiceFutureStub(channel, callOptions);
        }
      };
    return ContextDomainTransactionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionRequest> create(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    default void findOne(com.soustify.input.Input.UUIDRequest request,
        io.grpc.stub.StreamObserver<com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindOneMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ContextDomainTransactionService.
   */
  public static abstract class ContextDomainTransactionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ContextDomainTransactionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ContextDomainTransactionService.
   */
  public static final class ContextDomainTransactionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ContextDomainTransactionServiceStub> {
    private ContextDomainTransactionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContextDomainTransactionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContextDomainTransactionServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionRequest> create(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void findOne(com.soustify.input.Input.UUIDRequest request,
        io.grpc.stub.StreamObserver<com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindOneMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ContextDomainTransactionService.
   */
  public static final class ContextDomainTransactionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ContextDomainTransactionServiceBlockingStub> {
    private ContextDomainTransactionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContextDomainTransactionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContextDomainTransactionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionResponse findOne(com.soustify.input.Input.UUIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindOneMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ContextDomainTransactionService.
   */
  public static final class ContextDomainTransactionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ContextDomainTransactionServiceFutureStub> {
    private ContextDomainTransactionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContextDomainTransactionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContextDomainTransactionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionResponse> findOne(
        com.soustify.input.Input.UUIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindOneMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_ONE = 0;
  private static final int METHODID_CREATE = 1;

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
        case METHODID_FIND_ONE:
          serviceImpl.findOne((com.soustify.input.Input.UUIDRequest) request,
              (io.grpc.stub.StreamObserver<com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionResponse>) responseObserver);
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
              com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionRequest,
              com.soustify.output.Output.PersistenceDataResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getFindOneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.soustify.input.Input.UUIDRequest,
              com.soustify.contextdomain_transaction.ContextDomainTransaction.ContextDomainTransactionResponse>(
                service, METHODID_FIND_ONE)))
        .build();
  }

  private static abstract class ContextDomainTransactionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContextDomainTransactionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.soustify.contextdomain_transaction.ContextDomainTransaction.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContextDomainTransactionService");
    }
  }

  private static final class ContextDomainTransactionServiceFileDescriptorSupplier
      extends ContextDomainTransactionServiceBaseDescriptorSupplier {
    ContextDomainTransactionServiceFileDescriptorSupplier() {}
  }

  private static final class ContextDomainTransactionServiceMethodDescriptorSupplier
      extends ContextDomainTransactionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ContextDomainTransactionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ContextDomainTransactionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContextDomainTransactionServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getFindOneMethod())
              .build();
        }
      }
    }
    return result;
  }
}
