import static io.grpc.MethodDescriptor.generateFullMethodName;

@SuppressWarnings("all")
/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.1)",
    comments = "Source: fileRequest.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FMServiceGrpc {

  private FMServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "FMService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<FileRequest.FMRequest,
      FileRequest.ReadResponse> getFileManagerReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FileManagerRead",
      requestType = FileRequest.FMRequest.class,
      responseType = FileRequest.ReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<FileRequest.FMRequest,
      FileRequest.ReadResponse> getFileManagerReadMethod() {
    io.grpc.MethodDescriptor<FileRequest.FMRequest, FileRequest.ReadResponse> getFileManagerReadMethod;
    if ((getFileManagerReadMethod = FMServiceGrpc.getFileManagerReadMethod) == null) {
      synchronized (FMServiceGrpc.class) {
        if ((getFileManagerReadMethod = FMServiceGrpc.getFileManagerReadMethod) == null) {
          FMServiceGrpc.getFileManagerReadMethod = getFileManagerReadMethod =
              io.grpc.MethodDescriptor.<FileRequest.FMRequest, FileRequest.ReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FileManagerRead"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FileRequest.FMRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FileRequest.ReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FMServiceMethodDescriptorSupplier("FileManagerRead"))
              .build();
        }
      }
    }
    return getFileManagerReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<FileRequest.FMRequest,
      FileRequest.WriteResponse> getFileManagerWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FileManagerWrite",
      requestType = FileRequest.FMRequest.class,
      responseType = FileRequest.WriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<FileRequest.FMRequest,
      FileRequest.WriteResponse> getFileManagerWriteMethod() {
    io.grpc.MethodDescriptor<FileRequest.FMRequest, FileRequest.WriteResponse> getFileManagerWriteMethod;
    if ((getFileManagerWriteMethod = FMServiceGrpc.getFileManagerWriteMethod) == null) {
      synchronized (FMServiceGrpc.class) {
        if ((getFileManagerWriteMethod = FMServiceGrpc.getFileManagerWriteMethod) == null) {
          FMServiceGrpc.getFileManagerWriteMethod = getFileManagerWriteMethod =
              io.grpc.MethodDescriptor.<FileRequest.FMRequest, FileRequest.WriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FileManagerWrite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FileRequest.FMRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FileRequest.WriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FMServiceMethodDescriptorSupplier("FileManagerWrite"))
              .build();
        }
      }
    }
    return getFileManagerWriteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FMServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FMServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FMServiceStub>() {
        @java.lang.Override
        public FMServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FMServiceStub(channel, callOptions);
        }
      };
    return FMServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FMServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FMServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FMServiceBlockingStub>() {
        @java.lang.Override
        public FMServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FMServiceBlockingStub(channel, callOptions);
        }
      };
    return FMServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FMServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FMServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FMServiceFutureStub>() {
        @java.lang.Override
        public FMServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FMServiceFutureStub(channel, callOptions);
        }
      };
    return FMServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void fileManagerRead(FileRequest.FMRequest request,
        io.grpc.stub.StreamObserver<FileRequest.ReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFileManagerReadMethod(), responseObserver);
    }

    /**
     */
    default void fileManagerWrite(FileRequest.FMRequest request,
        io.grpc.stub.StreamObserver<FileRequest.WriteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFileManagerWriteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FMService.
   */
  public static abstract class FMServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FMServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FMService.
   */
  public static final class FMServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FMServiceStub> {
    private FMServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FMServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FMServiceStub(channel, callOptions);
    }

    /**
     */
    public void fileManagerRead(FileRequest.FMRequest request,
        io.grpc.stub.StreamObserver<FileRequest.ReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFileManagerReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fileManagerWrite(FileRequest.FMRequest request,
        io.grpc.stub.StreamObserver<FileRequest.WriteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFileManagerWriteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FMService.
   */
  public static final class FMServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FMServiceBlockingStub> {
    private FMServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FMServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FMServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public FileRequest.ReadResponse fileManagerRead(FileRequest.FMRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFileManagerReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public FileRequest.WriteResponse fileManagerWrite(FileRequest.FMRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFileManagerWriteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FMService.
   */
  public static final class FMServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FMServiceFutureStub> {
    private FMServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FMServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FMServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<FileRequest.ReadResponse> fileManagerRead(
        FileRequest.FMRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFileManagerReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<FileRequest.WriteResponse> fileManagerWrite(
        FileRequest.FMRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFileManagerWriteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FILE_MANAGER_READ = 0;
  private static final int METHODID_FILE_MANAGER_WRITE = 1;

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
        case METHODID_FILE_MANAGER_READ:
          serviceImpl.fileManagerRead((FileRequest.FMRequest) request,
              (io.grpc.stub.StreamObserver<FileRequest.ReadResponse>) responseObserver);
          break;
        case METHODID_FILE_MANAGER_WRITE:
          serviceImpl.fileManagerWrite((FileRequest.FMRequest) request,
              (io.grpc.stub.StreamObserver<FileRequest.WriteResponse>) responseObserver);
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
          getFileManagerReadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              FileRequest.FMRequest,
              FileRequest.ReadResponse>(
                service, METHODID_FILE_MANAGER_READ)))
        .addMethod(
          getFileManagerWriteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              FileRequest.FMRequest,
              FileRequest.WriteResponse>(
                service, METHODID_FILE_MANAGER_WRITE)))
        .build();
  }

  private static abstract class FMServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FMServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return FileRequest.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FMService");
    }
  }

  private static final class FMServiceFileDescriptorSupplier
      extends FMServiceBaseDescriptorSupplier {
    FMServiceFileDescriptorSupplier() {}
  }

  private static final class FMServiceMethodDescriptorSupplier
      extends FMServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FMServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FMServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FMServiceFileDescriptorSupplier())
              .addMethod(getFileManagerReadMethod())
              .addMethod(getFileManagerWriteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
