package com.soustify.category;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: category.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CategoryServiceGrpc {

  private CategoryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "category.CategoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.soustify.input.Input.PaginationRequest,
      com.soustify.category.Category.CategoriesResponse> getPaginateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Paginate",
      requestType = com.soustify.input.Input.PaginationRequest.class,
      responseType = com.soustify.category.Category.CategoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.soustify.input.Input.PaginationRequest,
      com.soustify.category.Category.CategoriesResponse> getPaginateMethod() {
    io.grpc.MethodDescriptor<com.soustify.input.Input.PaginationRequest, com.soustify.category.Category.CategoriesResponse> getPaginateMethod;
    if ((getPaginateMethod = CategoryServiceGrpc.getPaginateMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getPaginateMethod = CategoryServiceGrpc.getPaginateMethod) == null) {
          CategoryServiceGrpc.getPaginateMethod = getPaginateMethod =
              io.grpc.MethodDescriptor.<com.soustify.input.Input.PaginationRequest, com.soustify.category.Category.CategoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Paginate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.input.Input.PaginationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.category.Category.CategoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("Paginate"))
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
    if ((getCountMethod = CategoryServiceGrpc.getCountMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getCountMethod = CategoryServiceGrpc.getCountMethod) == null) {
          CategoryServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.soustify.input.Input.FilteredRequest, com.soustify.output.Output.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.input.Input.FilteredRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.output.Output.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("Count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.soustify.category.Category.CategoriesRequest,
      com.soustify.category.Category.CategoriesResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.soustify.category.Category.CategoriesRequest.class,
      responseType = com.soustify.category.Category.CategoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.soustify.category.Category.CategoriesRequest,
      com.soustify.category.Category.CategoriesResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.soustify.category.Category.CategoriesRequest, com.soustify.category.Category.CategoriesResponse> getCreateMethod;
    if ((getCreateMethod = CategoryServiceGrpc.getCreateMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getCreateMethod = CategoryServiceGrpc.getCreateMethod) == null) {
          CategoryServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.soustify.category.Category.CategoriesRequest, com.soustify.category.Category.CategoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.category.Category.CategoriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.category.Category.CategoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.soustify.category.Category.CategoriesRequest,
      com.soustify.category.Category.CategoriesResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.soustify.category.Category.CategoriesRequest.class,
      responseType = com.soustify.category.Category.CategoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.soustify.category.Category.CategoriesRequest,
      com.soustify.category.Category.CategoriesResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.soustify.category.Category.CategoriesRequest, com.soustify.category.Category.CategoriesResponse> getUpdateMethod;
    if ((getUpdateMethod = CategoryServiceGrpc.getUpdateMethod) == null) {
      synchronized (CategoryServiceGrpc.class) {
        if ((getUpdateMethod = CategoryServiceGrpc.getUpdateMethod) == null) {
          CategoryServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.soustify.category.Category.CategoriesRequest, com.soustify.category.Category.CategoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.category.Category.CategoriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.soustify.category.Category.CategoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CategoryServiceMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CategoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryServiceStub>() {
        @java.lang.Override
        public CategoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryServiceStub(channel, callOptions);
        }
      };
    return CategoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CategoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryServiceBlockingStub>() {
        @java.lang.Override
        public CategoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryServiceBlockingStub(channel, callOptions);
        }
      };
    return CategoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CategoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CategoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CategoryServiceFutureStub>() {
        @java.lang.Override
        public CategoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CategoryServiceFutureStub(channel, callOptions);
        }
      };
    return CategoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void paginate(com.soustify.input.Input.PaginationRequest request,
        io.grpc.stub.StreamObserver<com.soustify.category.Category.CategoriesResponse> responseObserver) {
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
    default void create(com.soustify.category.Category.CategoriesRequest request,
        io.grpc.stub.StreamObserver<com.soustify.category.Category.CategoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    default void update(com.soustify.category.Category.CategoriesRequest request,
        io.grpc.stub.StreamObserver<com.soustify.category.Category.CategoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CategoryService.
   */
  public static abstract class CategoryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CategoryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CategoryService.
   */
  public static final class CategoryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CategoryServiceStub> {
    private CategoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void paginate(com.soustify.input.Input.PaginationRequest request,
        io.grpc.stub.StreamObserver<com.soustify.category.Category.CategoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
    public void create(com.soustify.category.Category.CategoriesRequest request,
        io.grpc.stub.StreamObserver<com.soustify.category.Category.CategoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.soustify.category.Category.CategoriesRequest request,
        io.grpc.stub.StreamObserver<com.soustify.category.Category.CategoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CategoryService.
   */
  public static final class CategoryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CategoryServiceBlockingStub> {
    private CategoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.soustify.category.Category.CategoriesResponse paginate(com.soustify.input.Input.PaginationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
    public com.soustify.category.Category.CategoriesResponse create(com.soustify.category.Category.CategoriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.soustify.category.Category.CategoriesResponse update(com.soustify.category.Category.CategoriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CategoryService.
   */
  public static final class CategoryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CategoryServiceFutureStub> {
    private CategoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CategoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.soustify.category.Category.CategoriesResponse> paginate(
        com.soustify.input.Input.PaginationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPaginateMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.soustify.category.Category.CategoriesResponse> create(
        com.soustify.category.Category.CategoriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.soustify.category.Category.CategoriesResponse> update(
        com.soustify.category.Category.CategoriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PAGINATE = 0;
  private static final int METHODID_COUNT = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;

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
              (io.grpc.stub.StreamObserver<com.soustify.category.Category.CategoriesResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.soustify.input.Input.FilteredRequest) request,
              (io.grpc.stub.StreamObserver<com.soustify.output.Output.CountResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.soustify.category.Category.CategoriesRequest) request,
              (io.grpc.stub.StreamObserver<com.soustify.category.Category.CategoriesResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.soustify.category.Category.CategoriesRequest) request,
              (io.grpc.stub.StreamObserver<com.soustify.category.Category.CategoriesResponse>) responseObserver);
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
          getPaginateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.soustify.input.Input.PaginationRequest,
              com.soustify.category.Category.CategoriesResponse>(
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
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.soustify.category.Category.CategoriesRequest,
              com.soustify.category.Category.CategoriesResponse>(
                service, METHODID_CREATE)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.soustify.category.Category.CategoriesRequest,
              com.soustify.category.Category.CategoriesResponse>(
                service, METHODID_UPDATE)))
        .build();
  }

  private static abstract class CategoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CategoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.soustify.category.Category.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CategoryService");
    }
  }

  private static final class CategoryServiceFileDescriptorSupplier
      extends CategoryServiceBaseDescriptorSupplier {
    CategoryServiceFileDescriptorSupplier() {}
  }

  private static final class CategoryServiceMethodDescriptorSupplier
      extends CategoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CategoryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CategoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CategoryServiceFileDescriptorSupplier())
              .addMethod(getPaginateMethod())
              .addMethod(getCountMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
