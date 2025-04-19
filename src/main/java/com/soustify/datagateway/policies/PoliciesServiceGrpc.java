package com.soustify.datagateway.policies;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: policies.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PoliciesServiceGrpc {

  private PoliciesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "soustify.datagateway.policies.PoliciesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.soustify.input.Input.PaginationRequest,
      com.soustify.datagateway.policies.Policies.PoliciesResponse> getPaginateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Paginate",
      requestType = com.soustify.input.Input.PaginationRequest.class,
      responseType = com.soustify.datagateway.policies.Policies.PoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.soustify.input.Input.PaginationRequest,
      com.soustify.datagateway.policies.Policies.PoliciesResponse> getPaginateMethod() {
    io.grpc.MethodDescriptor<com.soustify.input.Input.PaginationRequest, com.soustify.datagateway.policies.Policies.PoliciesResponse> getPaginateMethod;
    if ((getPaginateMethod = PoliciesServiceGrpc.getPaginateMethod) == null) {
      synchronized (PoliciesServiceGrpc.class) {
        if ((getPaginateMethod = PoliciesServiceGrpc.getPaginateMethod) == null) {
          PoliciesServiceGrpc.getPaginateMethod = getPaginateMethod =
              io.grpc.MethodDescriptor.<com.soustify.input.Input.PaginationRequest, com.soustify.datagateway.policies.Policies.PoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Paginate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.input.Input.PaginationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.datagateway.policies.Policies.PoliciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PoliciesServiceMethodDescriptorSupplier("Paginate"))
              .build();
        }
      }
    }
    return getPaginateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.soustify.input.Input.FilteredRequest,
      com.soustify.output.Output.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Count",
      requestType = com.soustify.input.Input.FilteredRequest.class,
      responseType = com.soustify.output.Output.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.soustify.input.Input.FilteredRequest,
      com.soustify.output.Output.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.soustify.input.Input.FilteredRequest, com.soustify.output.Output.CountResponse> getCountMethod;
    if ((getCountMethod = PoliciesServiceGrpc.getCountMethod) == null) {
      synchronized (PoliciesServiceGrpc.class) {
        if ((getCountMethod = PoliciesServiceGrpc.getCountMethod) == null) {
          PoliciesServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.soustify.input.Input.FilteredRequest, com.soustify.output.Output.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.input.Input.FilteredRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PoliciesServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.soustify.datagateway.policies.Policies.PoliciesRequest,
      com.soustify.output.Output.PersistenceDataResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.soustify.datagateway.policies.Policies.PoliciesRequest.class,
      responseType = com.soustify.output.Output.PersistenceDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.soustify.datagateway.policies.Policies.PoliciesRequest,
      com.soustify.output.Output.PersistenceDataResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.soustify.datagateway.policies.Policies.PoliciesRequest, com.soustify.output.Output.PersistenceDataResponse> getCreateMethod;
    if ((getCreateMethod = PoliciesServiceGrpc.getCreateMethod) == null) {
      synchronized (PoliciesServiceGrpc.class) {
        if ((getCreateMethod = PoliciesServiceGrpc.getCreateMethod) == null) {
          PoliciesServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.soustify.datagateway.policies.Policies.PoliciesRequest, com.soustify.output.Output.PersistenceDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.datagateway.policies.Policies.PoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.PersistenceDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PoliciesServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.soustify.datagateway.policies.Policies.PoliciesRequest,
      com.soustify.output.Output.PersistenceDataResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.soustify.datagateway.policies.Policies.PoliciesRequest.class,
      responseType = com.soustify.output.Output.PersistenceDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.soustify.datagateway.policies.Policies.PoliciesRequest,
      com.soustify.output.Output.PersistenceDataResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.soustify.datagateway.policies.Policies.PoliciesRequest, com.soustify.output.Output.PersistenceDataResponse> getUpdateMethod;
    if ((getUpdateMethod = PoliciesServiceGrpc.getUpdateMethod) == null) {
      synchronized (PoliciesServiceGrpc.class) {
        if ((getUpdateMethod = PoliciesServiceGrpc.getUpdateMethod) == null) {
          PoliciesServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.soustify.datagateway.policies.Policies.PoliciesRequest, com.soustify.output.Output.PersistenceDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.datagateway.policies.Policies.PoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.PersistenceDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PoliciesServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest,
      com.soustify.output.Output.StatusDataResponse> getInactiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Inactive",
      requestType = com.soustify.input.Input.UUIDRequest.class,
      responseType = com.soustify.output.Output.StatusDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest,
      com.soustify.output.Output.StatusDataResponse> getInactiveMethod() {
    io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest, com.soustify.output.Output.StatusDataResponse> getInactiveMethod;
    if ((getInactiveMethod = PoliciesServiceGrpc.getInactiveMethod) == null) {
      synchronized (PoliciesServiceGrpc.class) {
        if ((getInactiveMethod = PoliciesServiceGrpc.getInactiveMethod) == null) {
          PoliciesServiceGrpc.getInactiveMethod = getInactiveMethod =
              io.grpc.MethodDescriptor.<com.soustify.input.Input.UUIDRequest, com.soustify.output.Output.StatusDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Inactive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.input.Input.UUIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.StatusDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PoliciesServiceMethodDescriptorSupplier("Inactive"))
              .build();
        }
      }
    }
    return getInactiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest,
      com.soustify.output.Output.StatusDataResponse> getActiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Active",
      requestType = com.soustify.input.Input.UUIDRequest.class,
      responseType = com.soustify.output.Output.StatusDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest,
      com.soustify.output.Output.StatusDataResponse> getActiveMethod() {
    io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest, com.soustify.output.Output.StatusDataResponse> getActiveMethod;
    if ((getActiveMethod = PoliciesServiceGrpc.getActiveMethod) == null) {
      synchronized (PoliciesServiceGrpc.class) {
        if ((getActiveMethod = PoliciesServiceGrpc.getActiveMethod) == null) {
          PoliciesServiceGrpc.getActiveMethod = getActiveMethod =
              io.grpc.MethodDescriptor.<com.soustify.input.Input.UUIDRequest, com.soustify.output.Output.StatusDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Active"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.input.Input.UUIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.StatusDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PoliciesServiceMethodDescriptorSupplier("Active"))
              .build();
        }
      }
    }
    return getActiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest,
      com.soustify.datagateway.policies.Policies.PoliciesResponse> getFindOneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindOne",
      requestType = com.soustify.input.Input.UUIDRequest.class,
      responseType = com.soustify.datagateway.policies.Policies.PoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest,
      com.soustify.datagateway.policies.Policies.PoliciesResponse> getFindOneMethod() {
    io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest, com.soustify.datagateway.policies.Policies.PoliciesResponse> getFindOneMethod;
    if ((getFindOneMethod = PoliciesServiceGrpc.getFindOneMethod) == null) {
      synchronized (PoliciesServiceGrpc.class) {
        if ((getFindOneMethod = PoliciesServiceGrpc.getFindOneMethod) == null) {
          PoliciesServiceGrpc.getFindOneMethod = getFindOneMethod =
              io.grpc.MethodDescriptor.<com.soustify.input.Input.UUIDRequest, com.soustify.datagateway.policies.Policies.PoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindOne"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.input.Input.UUIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.datagateway.policies.Policies.PoliciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PoliciesServiceMethodDescriptorSupplier("FindOne"))
              .build();
        }
      }
    }
    return getFindOneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest,
      com.soustify.output.Output.PersistenceDataResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.soustify.input.Input.UUIDRequest.class,
      responseType = com.soustify.output.Output.PersistenceDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest,
      com.soustify.output.Output.PersistenceDataResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest, com.soustify.output.Output.PersistenceDataResponse> getDeleteMethod;
    if ((getDeleteMethod = PoliciesServiceGrpc.getDeleteMethod) == null) {
      synchronized (PoliciesServiceGrpc.class) {
        if ((getDeleteMethod = PoliciesServiceGrpc.getDeleteMethod) == null) {
          PoliciesServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.soustify.input.Input.UUIDRequest, com.soustify.output.Output.PersistenceDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.input.Input.UUIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.PersistenceDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PoliciesServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PoliciesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PoliciesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PoliciesServiceStub>() {
        @java.lang.Override
        public PoliciesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PoliciesServiceStub(channel, callOptions);
        }
      };
    return PoliciesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PoliciesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PoliciesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PoliciesServiceBlockingStub>() {
        @java.lang.Override
        public PoliciesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PoliciesServiceBlockingStub(channel, callOptions);
        }
      };
    return PoliciesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PoliciesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PoliciesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PoliciesServiceFutureStub>() {
        @java.lang.Override
        public PoliciesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PoliciesServiceFutureStub(channel, callOptions);
        }
      };
    return PoliciesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void paginate(com.soustify.input.Input.PaginationRequest request,
        io.grpc.stub.StreamObserver<com.soustify.datagateway.policies.Policies.PoliciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPaginateMethod(), responseObserver);
    }

    /**
     */
    default void count(com.soustify.input.Input.FilteredRequest request,
        io.grpc.stub.StreamObserver<com.soustify.output.Output.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.soustify.datagateway.policies.Policies.PoliciesRequest> create(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.soustify.datagateway.policies.Policies.PoliciesRequest> update(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.soustify.input.Input.UUIDRequest> inactive(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.StatusDataResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getInactiveMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.soustify.input.Input.UUIDRequest> active(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.StatusDataResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getActiveMethod(), responseObserver);
    }

    /**
     */
    default void findOne(com.soustify.input.Input.UUIDRequest request,
        io.grpc.stub.StreamObserver<com.soustify.datagateway.policies.Policies.PoliciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindOneMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.soustify.input.Input.UUIDRequest> delete(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getDeleteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PoliciesService.
   */
  public static abstract class PoliciesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PoliciesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PoliciesService.
   */
  public static final class PoliciesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PoliciesServiceStub> {
    private PoliciesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PoliciesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PoliciesServiceStub(channel, callOptions);
    }

    /**
     */
    public void paginate(com.soustify.input.Input.PaginationRequest request,
        io.grpc.stub.StreamObserver<com.soustify.datagateway.policies.Policies.PoliciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getPaginateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void count(com.soustify.input.Input.FilteredRequest request,
        io.grpc.stub.StreamObserver<com.soustify.output.Output.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.soustify.datagateway.policies.Policies.PoliciesRequest> create(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.soustify.datagateway.policies.Policies.PoliciesRequest> update(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.soustify.input.Input.UUIDRequest> inactive(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.StatusDataResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getInactiveMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.soustify.input.Input.UUIDRequest> active(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.StatusDataResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getActiveMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void findOne(com.soustify.input.Input.UUIDRequest request,
        io.grpc.stub.StreamObserver<com.soustify.datagateway.policies.Policies.PoliciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindOneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.soustify.input.Input.UUIDRequest> delete(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PoliciesService.
   */
  public static final class PoliciesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PoliciesServiceBlockingStub> {
    private PoliciesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PoliciesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PoliciesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.soustify.datagateway.policies.Policies.PoliciesResponse> paginate(
        com.soustify.input.Input.PaginationRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getPaginateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.soustify.output.Output.CountResponse count(com.soustify.input.Input.FilteredRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.soustify.datagateway.policies.Policies.PoliciesResponse findOne(com.soustify.input.Input.UUIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindOneMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PoliciesService.
   */
  public static final class PoliciesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PoliciesServiceFutureStub> {
    private PoliciesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PoliciesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PoliciesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.soustify.output.Output.CountResponse> count(
        com.soustify.input.Input.FilteredRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.soustify.datagateway.policies.Policies.PoliciesResponse> findOne(
        com.soustify.input.Input.UUIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindOneMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PAGINATE = 0;
  private static final int METHODID_COUNT = 1;
  private static final int METHODID_FIND_ONE = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_UPDATE = 4;
  private static final int METHODID_INACTIVE = 5;
  private static final int METHODID_ACTIVE = 6;
  private static final int METHODID_DELETE = 7;

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
        case METHODID_PAGINATE:
          serviceImpl.paginate((com.soustify.input.Input.PaginationRequest) request,
              (io.grpc.stub.StreamObserver<com.soustify.datagateway.policies.Policies.PoliciesResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.soustify.input.Input.FilteredRequest) request,
              (io.grpc.stub.StreamObserver<com.soustify.output.Output.CountResponse>) responseObserver);
          break;
        case METHODID_FIND_ONE:
          serviceImpl.findOne((com.soustify.input.Input.UUIDRequest) request,
              (io.grpc.stub.StreamObserver<com.soustify.datagateway.policies.Policies.PoliciesResponse>) responseObserver);
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
        case METHODID_UPDATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.update(
              (io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse>) responseObserver);
        case METHODID_INACTIVE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.inactive(
              (io.grpc.stub.StreamObserver<com.soustify.output.Output.StatusDataResponse>) responseObserver);
        case METHODID_ACTIVE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.active(
              (io.grpc.stub.StreamObserver<com.soustify.output.Output.StatusDataResponse>) responseObserver);
        case METHODID_DELETE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.delete(
              (io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPaginateMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.soustify.input.Input.PaginationRequest,
              com.soustify.datagateway.policies.Policies.PoliciesResponse>(
                service, METHODID_PAGINATE)))
        .addMethod(
          getCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.soustify.input.Input.FilteredRequest,
              com.soustify.output.Output.CountResponse>(
                service, METHODID_COUNT)))
        .addMethod(
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.soustify.datagateway.policies.Policies.PoliciesRequest,
              com.soustify.output.Output.PersistenceDataResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.soustify.datagateway.policies.Policies.PoliciesRequest,
              com.soustify.output.Output.PersistenceDataResponse>(
                service, METHODID_UPDATE)))
        .addMethod(
          getInactiveMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.soustify.input.Input.UUIDRequest,
              com.soustify.output.Output.StatusDataResponse>(
                service, METHODID_INACTIVE)))
        .addMethod(
          getActiveMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.soustify.input.Input.UUIDRequest,
              com.soustify.output.Output.StatusDataResponse>(
                service, METHODID_ACTIVE)))
        .addMethod(
          getFindOneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.soustify.input.Input.UUIDRequest,
              com.soustify.datagateway.policies.Policies.PoliciesResponse>(
                service, METHODID_FIND_ONE)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.soustify.input.Input.UUIDRequest,
              com.soustify.output.Output.PersistenceDataResponse>(
                service, METHODID_DELETE)))
        .build();
  }

  private static abstract class PoliciesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PoliciesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.soustify.datagateway.policies.Policies.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PoliciesService");
    }
  }

  private static final class PoliciesServiceFileDescriptorSupplier
      extends PoliciesServiceBaseDescriptorSupplier {
    PoliciesServiceFileDescriptorSupplier() {}
  }

  private static final class PoliciesServiceMethodDescriptorSupplier
      extends PoliciesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PoliciesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PoliciesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PoliciesServiceFileDescriptorSupplier())
              .addMethod(getPaginateMethod())
              .addMethod(getCountMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getInactiveMethod())
              .addMethod(getActiveMethod())
              .addMethod(getFindOneMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
