// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: students.proto

package com.wkk.server.service.domain.grpc.student;

public interface StudentsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:student.StudentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.StringValue userId = 1;</code>
   */
  boolean hasUserId();
  /**
   * <code>.google.protobuf.StringValue userId = 1;</code>
   */
  com.google.protobuf.StringValue getUserId();
  /**
   * <code>.google.protobuf.StringValue userId = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getUserIdOrBuilder();

  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  boolean hasName();
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <code>.google.protobuf.UInt32Value age = 4;</code>
   */
  boolean hasAge();
  /**
   * <code>.google.protobuf.UInt32Value age = 4;</code>
   */
  com.google.protobuf.UInt32Value getAge();
  /**
   * <code>.google.protobuf.UInt32Value age = 4;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getAgeOrBuilder();

  /**
   * <code>.google.protobuf.UInt32Value score = 5;</code>
   */
  boolean hasScore();
  /**
   * <code>.google.protobuf.UInt32Value score = 5;</code>
   */
  com.google.protobuf.UInt32Value getScore();
  /**
   * <code>.google.protobuf.UInt32Value score = 5;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getScoreOrBuilder();
}
