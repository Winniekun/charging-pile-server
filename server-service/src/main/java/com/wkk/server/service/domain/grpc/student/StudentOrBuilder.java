// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: students.proto

package com.wkk.server.service.domain.grpc.student;

public interface StudentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:student.Student)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string no = 2;</code>
   */
  String getNo();
  /**
   * <code>string no = 2;</code>
   */
  com.google.protobuf.ByteString
      getNoBytes();

  /**
   * <code>string name = 3;</code>
   */
  String getName();
  /**
   * <code>string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 age = 4;</code>
   */
  int getAge();

  /**
   * <code>int32 score = 5;</code>
   */
  int getScore();
}
