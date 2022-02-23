package com.wkk.server.service.domain.grpc.student;

import io.grpc.stub.ClientCalls;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * RecommendAPI define API to access recommend service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: students.proto")
public final class StudentsAPIGrpc {

  private StudentsAPIGrpc() {}

  public static final String SERVICE_NAME = "student.StudentsAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.wkk.server.service.domain.grpc.student.Students> getGetAllStudentsInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllStudentsInfo",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.wkk.server.service.domain.grpc.student.Students.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.wkk.server.service.domain.grpc.student.Students> getGetAllStudentsInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.wkk.server.service.domain.grpc.student.Students> getGetAllStudentsInfoMethod;
    if ((getGetAllStudentsInfoMethod = StudentsAPIGrpc.getGetAllStudentsInfoMethod) == null) {
      synchronized (StudentsAPIGrpc.class) {
        if ((getGetAllStudentsInfoMethod = StudentsAPIGrpc.getGetAllStudentsInfoMethod) == null) {
          StudentsAPIGrpc.getGetAllStudentsInfoMethod = getGetAllStudentsInfoMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.wkk.server.service.domain.grpc.student.Students>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "student.StudentsAPI", "GetAllStudentsInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wkk.server.service.domain.grpc.student.Students.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentsAPIMethodDescriptorSupplier("GetAllStudentsInfo"))
                  .build();
          }
        }
     }
     return getGetAllStudentsInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wkk.server.service.domain.grpc.student.StudentsRequest,
      com.wkk.server.service.domain.grpc.student.Students> getGetStudentsInfoByConditionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentsInfoByCondition",
      requestType = com.wkk.server.service.domain.grpc.student.StudentsRequest.class,
      responseType = com.wkk.server.service.domain.grpc.student.Students.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wkk.server.service.domain.grpc.student.StudentsRequest,
      com.wkk.server.service.domain.grpc.student.Students> getGetStudentsInfoByConditionMethod() {
    io.grpc.MethodDescriptor<com.wkk.server.service.domain.grpc.student.StudentsRequest, com.wkk.server.service.domain.grpc.student.Students> getGetStudentsInfoByConditionMethod;
    if ((getGetStudentsInfoByConditionMethod = StudentsAPIGrpc.getGetStudentsInfoByConditionMethod) == null) {
      synchronized (StudentsAPIGrpc.class) {
        if ((getGetStudentsInfoByConditionMethod = StudentsAPIGrpc.getGetStudentsInfoByConditionMethod) == null) {
          StudentsAPIGrpc.getGetStudentsInfoByConditionMethod = getGetStudentsInfoByConditionMethod = 
              io.grpc.MethodDescriptor.<com.wkk.server.service.domain.grpc.student.StudentsRequest, com.wkk.server.service.domain.grpc.student.Students>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "student.StudentsAPI", "GetStudentsInfoByCondition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wkk.server.service.domain.grpc.student.StudentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wkk.server.service.domain.grpc.student.Students.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentsAPIMethodDescriptorSupplier("GetStudentsInfoByCondition"))
                  .build();
          }
        }
     }
     return getGetStudentsInfoByConditionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wkk.server.service.domain.grpc.student.StudentId,
      com.wkk.server.service.domain.grpc.student.Student> getGetStudentInfoByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentInfoById",
      requestType = com.wkk.server.service.domain.grpc.student.StudentId.class,
      responseType = com.wkk.server.service.domain.grpc.student.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wkk.server.service.domain.grpc.student.StudentId,
      com.wkk.server.service.domain.grpc.student.Student> getGetStudentInfoByIdMethod() {
    io.grpc.MethodDescriptor<com.wkk.server.service.domain.grpc.student.StudentId, com.wkk.server.service.domain.grpc.student.Student> getGetStudentInfoByIdMethod;
    if ((getGetStudentInfoByIdMethod = StudentsAPIGrpc.getGetStudentInfoByIdMethod) == null) {
      synchronized (StudentsAPIGrpc.class) {
        if ((getGetStudentInfoByIdMethod = StudentsAPIGrpc.getGetStudentInfoByIdMethod) == null) {
          StudentsAPIGrpc.getGetStudentInfoByIdMethod = getGetStudentInfoByIdMethod = 
              io.grpc.MethodDescriptor.<com.wkk.server.service.domain.grpc.student.StudentId, com.wkk.server.service.domain.grpc.student.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "student.StudentsAPI", "GetStudentInfoById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wkk.server.service.domain.grpc.student.StudentId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wkk.server.service.domain.grpc.student.Student.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentsAPIMethodDescriptorSupplier("GetStudentInfoById"))
                  .build();
          }
        }
     }
     return getGetStudentInfoByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentsAPIStub newStub(io.grpc.Channel channel) {
    return new StudentsAPIStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentsAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StudentsAPIBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentsAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StudentsAPIFutureStub(channel);
  }

  /**
   * <pre>
   * RecommendAPI define API to access recommend service
   * </pre>
   */
  public static abstract class StudentsAPIImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllStudentsInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.wkk.server.service.domain.grpc.student.Students> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllStudentsInfoMethod(), responseObserver);
    }

    /**
     */
    public void getStudentsInfoByCondition(com.wkk.server.service.domain.grpc.student.StudentsRequest request,
        io.grpc.stub.StreamObserver<com.wkk.server.service.domain.grpc.student.Students> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentsInfoByConditionMethod(), responseObserver);
    }

    /**
     */
    public void getStudentInfoById(com.wkk.server.service.domain.grpc.student.StudentId request,
        io.grpc.stub.StreamObserver<com.wkk.server.service.domain.grpc.student.Student> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentInfoByIdMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllStudentsInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.wkk.server.service.domain.grpc.student.Students>(
                  this, METHODID_GET_ALL_STUDENTS_INFO)))
          .addMethod(
            getGetStudentsInfoByConditionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.wkk.server.service.domain.grpc.student.StudentsRequest,
                com.wkk.server.service.domain.grpc.student.Students>(
                  this, METHODID_GET_STUDENTS_INFO_BY_CONDITION)))
          .addMethod(
            getGetStudentInfoByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.wkk.server.service.domain.grpc.student.StudentId,
                com.wkk.server.service.domain.grpc.student.Student>(
                  this, METHODID_GET_STUDENT_INFO_BY_ID)))
          .build();
    }
  }

  /**
   * <pre>
   * RecommendAPI define API to access recommend service
   * </pre>
   */
  public static final class StudentsAPIStub extends io.grpc.stub.AbstractStub<StudentsAPIStub> {
    private StudentsAPIStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentsAPIStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StudentsAPIStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentsAPIStub(channel, callOptions);
    }

    /**
     */
    public void getAllStudentsInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.wkk.server.service.domain.grpc.student.Students> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllStudentsInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentsInfoByCondition(com.wkk.server.service.domain.grpc.student.StudentsRequest request,
        io.grpc.stub.StreamObserver<com.wkk.server.service.domain.grpc.student.Students> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentsInfoByConditionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentInfoById(com.wkk.server.service.domain.grpc.student.StudentId request,
        io.grpc.stub.StreamObserver<com.wkk.server.service.domain.grpc.student.Student> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentInfoByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RecommendAPI define API to access recommend service
   * </pre>
   */
  public static final class StudentsAPIBlockingStub extends io.grpc.stub.AbstractStub<StudentsAPIBlockingStub> {
    private StudentsAPIBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentsAPIBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StudentsAPIBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentsAPIBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wkk.server.service.domain.grpc.student.Students getAllStudentsInfo(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllStudentsInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wkk.server.service.domain.grpc.student.Students getStudentsInfoByCondition(com.wkk.server.service.domain.grpc.student.StudentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStudentsInfoByConditionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wkk.server.service.domain.grpc.student.Student getStudentInfoById(com.wkk.server.service.domain.grpc.student.StudentId request) {
      return blockingUnaryCall(
          getChannel(), getGetStudentInfoByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RecommendAPI define API to access recommend service
   * </pre>
   */
  public static final class StudentsAPIFutureStub extends io.grpc.stub.AbstractStub<StudentsAPIFutureStub> {
    private StudentsAPIFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentsAPIFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StudentsAPIFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentsAPIFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wkk.server.service.domain.grpc.student.Students> getAllStudentsInfo(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllStudentsInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wkk.server.service.domain.grpc.student.Students> getStudentsInfoByCondition(
        com.wkk.server.service.domain.grpc.student.StudentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStudentsInfoByConditionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wkk.server.service.domain.grpc.student.Student> getStudentInfoById(
        com.wkk.server.service.domain.grpc.student.StudentId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStudentInfoByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_STUDENTS_INFO = 0;
  private static final int METHODID_GET_STUDENTS_INFO_BY_CONDITION = 1;
  private static final int METHODID_GET_STUDENT_INFO_BY_ID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentsAPIImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentsAPIImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_STUDENTS_INFO:
          serviceImpl.getAllStudentsInfo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.wkk.server.service.domain.grpc.student.Students>) responseObserver);
          break;
        case METHODID_GET_STUDENTS_INFO_BY_CONDITION:
          serviceImpl.getStudentsInfoByCondition((com.wkk.server.service.domain.grpc.student.StudentsRequest) request,
              (io.grpc.stub.StreamObserver<com.wkk.server.service.domain.grpc.student.Students>) responseObserver);
          break;
        case METHODID_GET_STUDENT_INFO_BY_ID:
          serviceImpl.getStudentInfoById((com.wkk.server.service.domain.grpc.student.StudentId) request,
              (io.grpc.stub.StreamObserver<com.wkk.server.service.domain.grpc.student.Student>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StudentsAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentsAPIBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wkk.server.service.domain.grpc.student.StudentsOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentsAPI");
    }
  }

  private static final class StudentsAPIFileDescriptorSupplier
      extends StudentsAPIBaseDescriptorSupplier {
    StudentsAPIFileDescriptorSupplier() {}
  }

  private static final class StudentsAPIMethodDescriptorSupplier
      extends StudentsAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentsAPIMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StudentsAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentsAPIFileDescriptorSupplier())
              .addMethod(getGetAllStudentsInfoMethod())
              .addMethod(getGetStudentsInfoByConditionMethod())
              .addMethod(getGetStudentInfoByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
