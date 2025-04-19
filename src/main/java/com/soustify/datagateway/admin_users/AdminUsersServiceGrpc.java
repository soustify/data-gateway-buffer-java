package com.soustify.datagateway.admin_users;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: admin_users.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdminUsersServiceGrpc {

  private AdminUsersServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "soustify.datagateway.admin_users.AdminUsersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.soustify.input.Input.PaginationRequest,
      com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse> getPaginateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Paginate",
      requestType = com.soustify.input.Input.PaginationRequest.class,
      responseType = com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.soustify.input.Input.PaginationRequest,
      com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse> getPaginateMethod() {
    io.grpc.MethodDescriptor<com.soustify.input.Input.PaginationRequest, com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse> getPaginateMethod;
    if ((getPaginateMethod = AdminUsersServiceGrpc.getPaginateMethod) == null) {
      synchronized (AdminUsersServiceGrpc.class) {
        if ((getPaginateMethod = AdminUsersServiceGrpc.getPaginateMethod) == null) {
          AdminUsersServiceGrpc.getPaginateMethod = getPaginateMethod =
              io.grpc.MethodDescriptor.<com.soustify.input.Input.PaginationRequest, com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Paginate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.input.Input.PaginationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminUsersServiceMethodDescriptorSupplier("Paginate"))
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
    if ((getCountMethod = AdminUsersServiceGrpc.getCountMethod) == null) {
      synchronized (AdminUsersServiceGrpc.class) {
        if ((getCountMethod = AdminUsersServiceGrpc.getCountMethod) == null) {
          AdminUsersServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.soustify.input.Input.FilteredRequest, com.soustify.output.Output.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.input.Input.FilteredRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminUsersServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest,
      com.soustify.output.Output.PersistenceDataResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest.class,
      responseType = com.soustify.output.Output.PersistenceDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest,
      com.soustify.output.Output.PersistenceDataResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest, com.soustify.output.Output.PersistenceDataResponse> getCreateMethod;
    if ((getCreateMethod = AdminUsersServiceGrpc.getCreateMethod) == null) {
      synchronized (AdminUsersServiceGrpc.class) {
        if ((getCreateMethod = AdminUsersServiceGrpc.getCreateMethod) == null) {
          AdminUsersServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest, com.soustify.output.Output.PersistenceDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.PersistenceDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminUsersServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest,
      com.soustify.output.Output.PersistenceDataResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest.class,
      responseType = com.soustify.output.Output.PersistenceDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest,
      com.soustify.output.Output.PersistenceDataResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest, com.soustify.output.Output.PersistenceDataResponse> getUpdateMethod;
    if ((getUpdateMethod = AdminUsersServiceGrpc.getUpdateMethod) == null) {
      synchronized (AdminUsersServiceGrpc.class) {
        if ((getUpdateMethod = AdminUsersServiceGrpc.getUpdateMethod) == null) {
          AdminUsersServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest, com.soustify.output.Output.PersistenceDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.PersistenceDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminUsersServiceMethodDescriptorSupplier("Update"))
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
    if ((getInactiveMethod = AdminUsersServiceGrpc.getInactiveMethod) == null) {
      synchronized (AdminUsersServiceGrpc.class) {
        if ((getInactiveMethod = AdminUsersServiceGrpc.getInactiveMethod) == null) {
          AdminUsersServiceGrpc.getInactiveMethod = getInactiveMethod =
              io.grpc.MethodDescriptor.<com.soustify.input.Input.UUIDRequest, com.soustify.output.Output.StatusDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Inactive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.input.Input.UUIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.StatusDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminUsersServiceMethodDescriptorSupplier("Inactive"))
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
    if ((getActiveMethod = AdminUsersServiceGrpc.getActiveMethod) == null) {
      synchronized (AdminUsersServiceGrpc.class) {
        if ((getActiveMethod = AdminUsersServiceGrpc.getActiveMethod) == null) {
          AdminUsersServiceGrpc.getActiveMethod = getActiveMethod =
              io.grpc.MethodDescriptor.<com.soustify.input.Input.UUIDRequest, com.soustify.output.Output.StatusDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Active"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.input.Input.UUIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.StatusDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminUsersServiceMethodDescriptorSupplier("Active"))
              .build();
        }
      }
    }
    return getActiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest,
      com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse> getFindOneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindOne",
      requestType = com.soustify.input.Input.UUIDRequest.class,
      responseType = com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest,
      com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse> getFindOneMethod() {
    io.grpc.MethodDescriptor<com.soustify.input.Input.UUIDRequest, com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse> getFindOneMethod;
    if ((getFindOneMethod = AdminUsersServiceGrpc.getFindOneMethod) == null) {
      synchronized (AdminUsersServiceGrpc.class) {
        if ((getFindOneMethod = AdminUsersServiceGrpc.getFindOneMethod) == null) {
          AdminUsersServiceGrpc.getFindOneMethod = getFindOneMethod =
              io.grpc.MethodDescriptor.<com.soustify.input.Input.UUIDRequest, com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindOne"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.input.Input.UUIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminUsersServiceMethodDescriptorSupplier("FindOne"))
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
    if ((getDeleteMethod = AdminUsersServiceGrpc.getDeleteMethod) == null) {
      synchronized (AdminUsersServiceGrpc.class) {
        if ((getDeleteMethod = AdminUsersServiceGrpc.getDeleteMethod) == null) {
          AdminUsersServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.soustify.input.Input.UUIDRequest, com.soustify.output.Output.PersistenceDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.input.Input.UUIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.PersistenceDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AdminUsersServiceMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdminUsersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdminUsersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdminUsersServiceStub>() {
        @java.lang.Override
        public AdminUsersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdminUsersServiceStub(channel, callOptions);
        }
      };
    return AdminUsersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdminUsersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdminUsersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdminUsersServiceBlockingStub>() {
        @java.lang.Override
        public AdminUsersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdminUsersServiceBlockingStub(channel, callOptions);
        }
      };
    return AdminUsersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdminUsersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdminUsersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdminUsersServiceFutureStub>() {
        @java.lang.Override
        public AdminUsersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdminUsersServiceFutureStub(channel, callOptions);
        }
      };
    return AdminUsersServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void paginate(com.soustify.input.Input.PaginationRequest request,
        io.grpc.stub.StreamObserver<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse> responseObserver) {
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
    default io.grpc.stub.StreamObserver<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest> create(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest> update(
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
        io.grpc.stub.StreamObserver<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse> responseObserver) {
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
   * Base class for the server implementation of the service AdminUsersService.
   */
  public static abstract class AdminUsersServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdminUsersServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AdminUsersService.
   */
  public static final class AdminUsersServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdminUsersServiceStub> {
    private AdminUsersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminUsersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdminUsersServiceStub(channel, callOptions);
    }

    /**
     */
    public void paginate(com.soustify.input.Input.PaginationRequest request,
        io.grpc.stub.StreamObserver<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse> responseObserver) {
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
    public io.grpc.stub.StreamObserver<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest> create(
        io.grpc.stub.StreamObserver<com.soustify.output.Output.PersistenceDataResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest> update(
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
        io.grpc.stub.StreamObserver<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse> responseObserver) {
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
   * A stub to allow clients to do synchronous rpc calls to service AdminUsersService.
   */
  public static final class AdminUsersServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdminUsersServiceBlockingStub> {
    private AdminUsersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminUsersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdminUsersServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse> paginate(
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
    public com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse findOne(com.soustify.input.Input.UUIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindOneMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AdminUsersService.
   */
  public static final class AdminUsersServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdminUsersServiceFutureStub> {
    private AdminUsersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminUsersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdminUsersServiceFutureStub(channel, callOptions);
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
    public com.google.common.util.concurrent.ListenableFuture<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse> findOne(
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
              (io.grpc.stub.StreamObserver<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.soustify.input.Input.FilteredRequest) request,
              (io.grpc.stub.StreamObserver<com.soustify.output.Output.CountResponse>) responseObserver);
          break;
        case METHODID_FIND_ONE:
          serviceImpl.findOne((com.soustify.input.Input.UUIDRequest) request,
              (io.grpc.stub.StreamObserver<com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse>) responseObserver);
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
              com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse>(
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
              com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest,
              com.soustify.output.Output.PersistenceDataResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.soustify.datagateway.admin_users.AdminUsers.AdminUsersRequest,
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
              com.soustify.datagateway.admin_users.AdminUsers.AdminUsersResponse>(
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

  private static abstract class AdminUsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdminUsersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.soustify.datagateway.admin_users.AdminUsers.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdminUsersService");
    }
  }

  private static final class AdminUsersServiceFileDescriptorSupplier
      extends AdminUsersServiceBaseDescriptorSupplier {
    AdminUsersServiceFileDescriptorSupplier() {}
  }

  private static final class AdminUsersServiceMethodDescriptorSupplier
      extends AdminUsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AdminUsersServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AdminUsersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdminUsersServiceFileDescriptorSupplier())
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
