// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: students.proto

package com.wkk.server.service.domain.grpc.student;

/**
 * Protobuf type {@code student.Students}
 */
public  final class Students extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:student.Students)
    StudentsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Students.newBuilder() to construct.
  private Students(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Students() {
    student_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Students(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              student_ = new java.util.ArrayList<Student>();
              mutable_bitField0_ |= 0x00000001;
            }
            student_.add(
                input.readMessage(Student.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        student_ = java.util.Collections.unmodifiableList(student_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return StudentsOuterClass.internal_static_student_Students_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return StudentsOuterClass.internal_static_student_Students_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Students.class, Builder.class);
  }

  public static final int STUDENT_FIELD_NUMBER = 1;
  private java.util.List<Student> student_;
  /**
   * <code>repeated .student.Student student = 1;</code>
   */
  public java.util.List<Student> getStudentList() {
    return student_;
  }
  /**
   * <code>repeated .student.Student student = 1;</code>
   */
  public java.util.List<? extends StudentOrBuilder>
      getStudentOrBuilderList() {
    return student_;
  }
  /**
   * <code>repeated .student.Student student = 1;</code>
   */
  public int getStudentCount() {
    return student_.size();
  }
  /**
   * <code>repeated .student.Student student = 1;</code>
   */
  public Student getStudent(int index) {
    return student_.get(index);
  }
  /**
   * <code>repeated .student.Student student = 1;</code>
   */
  public StudentOrBuilder getStudentOrBuilder(
      int index) {
    return student_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < student_.size(); i++) {
      output.writeMessage(1, student_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < student_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, student_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Students)) {
      return super.equals(obj);
    }
    Students other = (Students) obj;

    boolean result = true;
    result = result && getStudentList()
        .equals(other.getStudentList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStudentCount() > 0) {
      hash = (37 * hash) + STUDENT_FIELD_NUMBER;
      hash = (53 * hash) + getStudentList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Students parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Students parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Students parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Students parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Students parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Students parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Students parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Students parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Students parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Students parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Students parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Students parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Students prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code student.Students}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:student.Students)
      StudentsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return StudentsOuterClass.internal_static_student_Students_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return StudentsOuterClass.internal_static_student_Students_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Students.class, Builder.class);
    }

    // Construct using com.wkk.server.service.domain.grpc.student.Students.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getStudentFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (studentBuilder_ == null) {
        student_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        studentBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return StudentsOuterClass.internal_static_student_Students_descriptor;
    }

    public Students getDefaultInstanceForType() {
      return Students.getDefaultInstance();
    }

    public Students build() {
      Students result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public Students buildPartial() {
      Students result = new Students(this);
      int from_bitField0_ = bitField0_;
      if (studentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          student_ = java.util.Collections.unmodifiableList(student_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.student_ = student_;
      } else {
        result.student_ = studentBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Students) {
        return mergeFrom((Students)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Students other) {
      if (other == Students.getDefaultInstance()) return this;
      if (studentBuilder_ == null) {
        if (!other.student_.isEmpty()) {
          if (student_.isEmpty()) {
            student_ = other.student_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStudentIsMutable();
            student_.addAll(other.student_);
          }
          onChanged();
        }
      } else {
        if (!other.student_.isEmpty()) {
          if (studentBuilder_.isEmpty()) {
            studentBuilder_.dispose();
            studentBuilder_ = null;
            student_ = other.student_;
            bitField0_ = (bitField0_ & ~0x00000001);
            studentBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStudentFieldBuilder() : null;
          } else {
            studentBuilder_.addAllMessages(other.student_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Students parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Students) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<Student> student_ =
      java.util.Collections.emptyList();
    private void ensureStudentIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        student_ = new java.util.ArrayList<Student>(student_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        Student, Student.Builder, StudentOrBuilder> studentBuilder_;

    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public java.util.List<Student> getStudentList() {
      if (studentBuilder_ == null) {
        return java.util.Collections.unmodifiableList(student_);
      } else {
        return studentBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public int getStudentCount() {
      if (studentBuilder_ == null) {
        return student_.size();
      } else {
        return studentBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public Student getStudent(int index) {
      if (studentBuilder_ == null) {
        return student_.get(index);
      } else {
        return studentBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public Builder setStudent(
        int index, Student value) {
      if (studentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentIsMutable();
        student_.set(index, value);
        onChanged();
      } else {
        studentBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public Builder setStudent(
        int index, Student.Builder builderForValue) {
      if (studentBuilder_ == null) {
        ensureStudentIsMutable();
        student_.set(index, builderForValue.build());
        onChanged();
      } else {
        studentBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public Builder addStudent(Student value) {
      if (studentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentIsMutable();
        student_.add(value);
        onChanged();
      } else {
        studentBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public Builder addStudent(
        int index, Student value) {
      if (studentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentIsMutable();
        student_.add(index, value);
        onChanged();
      } else {
        studentBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public Builder addStudent(
        Student.Builder builderForValue) {
      if (studentBuilder_ == null) {
        ensureStudentIsMutable();
        student_.add(builderForValue.build());
        onChanged();
      } else {
        studentBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public Builder addStudent(
        int index, Student.Builder builderForValue) {
      if (studentBuilder_ == null) {
        ensureStudentIsMutable();
        student_.add(index, builderForValue.build());
        onChanged();
      } else {
        studentBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public Builder addAllStudent(
        Iterable<? extends Student> values) {
      if (studentBuilder_ == null) {
        ensureStudentIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, student_);
        onChanged();
      } else {
        studentBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public Builder clearStudent() {
      if (studentBuilder_ == null) {
        student_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        studentBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public Builder removeStudent(int index) {
      if (studentBuilder_ == null) {
        ensureStudentIsMutable();
        student_.remove(index);
        onChanged();
      } else {
        studentBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public Student.Builder getStudentBuilder(
        int index) {
      return getStudentFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public StudentOrBuilder getStudentOrBuilder(
        int index) {
      if (studentBuilder_ == null) {
        return student_.get(index);  } else {
        return studentBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public java.util.List<? extends StudentOrBuilder>
         getStudentOrBuilderList() {
      if (studentBuilder_ != null) {
        return studentBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(student_);
      }
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public Student.Builder addStudentBuilder() {
      return getStudentFieldBuilder().addBuilder(
          Student.getDefaultInstance());
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public Student.Builder addStudentBuilder(
        int index) {
      return getStudentFieldBuilder().addBuilder(
          index, Student.getDefaultInstance());
    }
    /**
     * <code>repeated .student.Student student = 1;</code>
     */
    public java.util.List<Student.Builder>
         getStudentBuilderList() {
      return getStudentFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        Student, Student.Builder, StudentOrBuilder>
        getStudentFieldBuilder() {
      if (studentBuilder_ == null) {
        studentBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            Student, Student.Builder, StudentOrBuilder>(
                student_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        student_ = null;
      }
      return studentBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:student.Students)
  }

  // @@protoc_insertion_point(class_scope:student.Students)
  private static final Students DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Students();
  }

  public static Students getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Students>
      PARSER = new com.google.protobuf.AbstractParser<Students>() {
    public Students parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Students(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Students> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Students> getParserForType() {
    return PARSER;
  }

  public Students getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

