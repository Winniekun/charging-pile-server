// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: students.proto

package com.wkk.server.service.domain.grpc.student;

/**
 * Protobuf type {@code student.StudentsRequest}
 */
public  final class StudentsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:student.StudentsRequest)
    StudentsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StudentsRequest.newBuilder() to construct.
  private StudentsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StudentsRequest() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StudentsRequest(
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
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (userId_ != null) {
              subBuilder = userId_.toBuilder();
            }
            userId_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(userId_);
              userId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (name_ != null) {
              subBuilder = name_.toBuilder();
            }
            name_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(name_);
              name_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            com.google.protobuf.UInt32Value.Builder subBuilder = null;
            if (age_ != null) {
              subBuilder = age_.toBuilder();
            }
            age_ = input.readMessage(com.google.protobuf.UInt32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(age_);
              age_ = subBuilder.buildPartial();
            }

            break;
          }
          case 42: {
            com.google.protobuf.UInt32Value.Builder subBuilder = null;
            if (score_ != null) {
              subBuilder = score_.toBuilder();
            }
            score_ = input.readMessage(com.google.protobuf.UInt32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(score_);
              score_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return StudentsOuterClass.internal_static_student_StudentsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return StudentsOuterClass.internal_static_student_StudentsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            StudentsRequest.class, Builder.class);
  }

  public static final int USERID_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue userId_;
  /**
   * <code>.google.protobuf.StringValue userId = 1;</code>
   */
  public boolean hasUserId() {
    return userId_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue userId = 1;</code>
   */
  public com.google.protobuf.StringValue getUserId() {
    return userId_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : userId_;
  }
  /**
   * <code>.google.protobuf.StringValue userId = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getUserIdOrBuilder() {
    return getUserId();
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue name_;
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  public boolean hasName() {
    return name_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  public com.google.protobuf.StringValue getName() {
    return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
  }
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
    return getName();
  }

  public static final int AGE_FIELD_NUMBER = 4;
  private com.google.protobuf.UInt32Value age_;
  /**
   * <code>.google.protobuf.UInt32Value age = 4;</code>
   */
  public boolean hasAge() {
    return age_ != null;
  }
  /**
   * <code>.google.protobuf.UInt32Value age = 4;</code>
   */
  public com.google.protobuf.UInt32Value getAge() {
    return age_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : age_;
  }
  /**
   * <code>.google.protobuf.UInt32Value age = 4;</code>
   */
  public com.google.protobuf.UInt32ValueOrBuilder getAgeOrBuilder() {
    return getAge();
  }

  public static final int SCORE_FIELD_NUMBER = 5;
  private com.google.protobuf.UInt32Value score_;
  /**
   * <code>.google.protobuf.UInt32Value score = 5;</code>
   */
  public boolean hasScore() {
    return score_ != null;
  }
  /**
   * <code>.google.protobuf.UInt32Value score = 5;</code>
   */
  public com.google.protobuf.UInt32Value getScore() {
    return score_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : score_;
  }
  /**
   * <code>.google.protobuf.UInt32Value score = 5;</code>
   */
  public com.google.protobuf.UInt32ValueOrBuilder getScoreOrBuilder() {
    return getScore();
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
    if (userId_ != null) {
      output.writeMessage(1, getUserId());
    }
    if (name_ != null) {
      output.writeMessage(3, getName());
    }
    if (age_ != null) {
      output.writeMessage(4, getAge());
    }
    if (score_ != null) {
      output.writeMessage(5, getScore());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUserId());
    }
    if (name_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getName());
    }
    if (age_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAge());
    }
    if (score_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getScore());
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
    if (!(obj instanceof StudentsRequest)) {
      return super.equals(obj);
    }
    StudentsRequest other = (StudentsRequest) obj;

    boolean result = true;
    result = result && (hasUserId() == other.hasUserId());
    if (hasUserId()) {
      result = result && getUserId()
          .equals(other.getUserId());
    }
    result = result && (hasName() == other.hasName());
    if (hasName()) {
      result = result && getName()
          .equals(other.getName());
    }
    result = result && (hasAge() == other.hasAge());
    if (hasAge()) {
      result = result && getAge()
          .equals(other.getAge());
    }
    result = result && (hasScore() == other.hasScore());
    if (hasScore()) {
      result = result && getScore()
          .equals(other.getScore());
    }
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
    if (hasUserId()) {
      hash = (37 * hash) + USERID_FIELD_NUMBER;
      hash = (53 * hash) + getUserId().hashCode();
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasAge()) {
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAge().hashCode();
    }
    if (hasScore()) {
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static StudentsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StudentsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StudentsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StudentsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StudentsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static StudentsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static StudentsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static StudentsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static StudentsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static StudentsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static StudentsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static StudentsRequest parseFrom(
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
  public static Builder newBuilder(StudentsRequest prototype) {
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
   * Protobuf type {@code student.StudentsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:student.StudentsRequest)
      StudentsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return StudentsOuterClass.internal_static_student_StudentsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return StudentsOuterClass.internal_static_student_StudentsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              StudentsRequest.class, Builder.class);
    }

    // Construct using com.wkk.server.service.domain.grpc.student.StudentsRequest.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      if (userIdBuilder_ == null) {
        userId_ = null;
      } else {
        userId_ = null;
        userIdBuilder_ = null;
      }
      if (nameBuilder_ == null) {
        name_ = null;
      } else {
        name_ = null;
        nameBuilder_ = null;
      }
      if (ageBuilder_ == null) {
        age_ = null;
      } else {
        age_ = null;
        ageBuilder_ = null;
      }
      if (scoreBuilder_ == null) {
        score_ = null;
      } else {
        score_ = null;
        scoreBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return StudentsOuterClass.internal_static_student_StudentsRequest_descriptor;
    }

    public StudentsRequest getDefaultInstanceForType() {
      return StudentsRequest.getDefaultInstance();
    }

    public StudentsRequest build() {
      StudentsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public StudentsRequest buildPartial() {
      StudentsRequest result = new StudentsRequest(this);
      if (userIdBuilder_ == null) {
        result.userId_ = userId_;
      } else {
        result.userId_ = userIdBuilder_.build();
      }
      if (nameBuilder_ == null) {
        result.name_ = name_;
      } else {
        result.name_ = nameBuilder_.build();
      }
      if (ageBuilder_ == null) {
        result.age_ = age_;
      } else {
        result.age_ = ageBuilder_.build();
      }
      if (scoreBuilder_ == null) {
        result.score_ = score_;
      } else {
        result.score_ = scoreBuilder_.build();
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
      if (other instanceof StudentsRequest) {
        return mergeFrom((StudentsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(StudentsRequest other) {
      if (other == StudentsRequest.getDefaultInstance()) return this;
      if (other.hasUserId()) {
        mergeUserId(other.getUserId());
      }
      if (other.hasName()) {
        mergeName(other.getName());
      }
      if (other.hasAge()) {
        mergeAge(other.getAge());
      }
      if (other.hasScore()) {
        mergeScore(other.getScore());
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
      StudentsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (StudentsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue userId_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> userIdBuilder_;
    /**
     * <code>.google.protobuf.StringValue userId = 1;</code>
     */
    public boolean hasUserId() {
      return userIdBuilder_ != null || userId_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue userId = 1;</code>
     */
    public com.google.protobuf.StringValue getUserId() {
      if (userIdBuilder_ == null) {
        return userId_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : userId_;
      } else {
        return userIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue userId = 1;</code>
     */
    public Builder setUserId(com.google.protobuf.StringValue value) {
      if (userIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userId_ = value;
        onChanged();
      } else {
        userIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue userId = 1;</code>
     */
    public Builder setUserId(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (userIdBuilder_ == null) {
        userId_ = builderForValue.build();
        onChanged();
      } else {
        userIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue userId = 1;</code>
     */
    public Builder mergeUserId(com.google.protobuf.StringValue value) {
      if (userIdBuilder_ == null) {
        if (userId_ != null) {
          userId_ =
            com.google.protobuf.StringValue.newBuilder(userId_).mergeFrom(value).buildPartial();
        } else {
          userId_ = value;
        }
        onChanged();
      } else {
        userIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue userId = 1;</code>
     */
    public Builder clearUserId() {
      if (userIdBuilder_ == null) {
        userId_ = null;
        onChanged();
      } else {
        userId_ = null;
        userIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue userId = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getUserIdBuilder() {
      
      onChanged();
      return getUserIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue userId = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getUserIdOrBuilder() {
      if (userIdBuilder_ != null) {
        return userIdBuilder_.getMessageOrBuilder();
      } else {
        return userId_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : userId_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue userId = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getUserIdFieldBuilder() {
      if (userIdBuilder_ == null) {
        userIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getUserId(),
                getParentForChildren(),
                isClean());
        userId_ = null;
      }
      return userIdBuilder_;
    }

    private com.google.protobuf.StringValue name_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> nameBuilder_;
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public boolean hasName() {
      return nameBuilder_ != null || name_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public com.google.protobuf.StringValue getName() {
      if (nameBuilder_ == null) {
        return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
      } else {
        return nameBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder setName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
        onChanged();
      } else {
        nameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder setName(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (nameBuilder_ == null) {
        name_ = builderForValue.build();
        onChanged();
      } else {
        nameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder mergeName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (name_ != null) {
          name_ =
            com.google.protobuf.StringValue.newBuilder(name_).mergeFrom(value).buildPartial();
        } else {
          name_ = value;
        }
        onChanged();
      } else {
        nameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder clearName() {
      if (nameBuilder_ == null) {
        name_ = null;
        onChanged();
      } else {
        name_ = null;
        nameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getNameBuilder() {
      
      onChanged();
      return getNameFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
      if (nameBuilder_ != null) {
        return nameBuilder_.getMessageOrBuilder();
      } else {
        return name_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : name_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getNameFieldBuilder() {
      if (nameBuilder_ == null) {
        nameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getName(),
                getParentForChildren(),
                isClean());
        name_ = null;
      }
      return nameBuilder_;
    }

    private com.google.protobuf.UInt32Value age_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> ageBuilder_;
    /**
     * <code>.google.protobuf.UInt32Value age = 4;</code>
     */
    public boolean hasAge() {
      return ageBuilder_ != null || age_ != null;
    }
    /**
     * <code>.google.protobuf.UInt32Value age = 4;</code>
     */
    public com.google.protobuf.UInt32Value getAge() {
      if (ageBuilder_ == null) {
        return age_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : age_;
      } else {
        return ageBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.UInt32Value age = 4;</code>
     */
    public Builder setAge(com.google.protobuf.UInt32Value value) {
      if (ageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        age_ = value;
        onChanged();
      } else {
        ageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.UInt32Value age = 4;</code>
     */
    public Builder setAge(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      if (ageBuilder_ == null) {
        age_ = builderForValue.build();
        onChanged();
      } else {
        ageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.UInt32Value age = 4;</code>
     */
    public Builder mergeAge(com.google.protobuf.UInt32Value value) {
      if (ageBuilder_ == null) {
        if (age_ != null) {
          age_ =
            com.google.protobuf.UInt32Value.newBuilder(age_).mergeFrom(value).buildPartial();
        } else {
          age_ = value;
        }
        onChanged();
      } else {
        ageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.UInt32Value age = 4;</code>
     */
    public Builder clearAge() {
      if (ageBuilder_ == null) {
        age_ = null;
        onChanged();
      } else {
        age_ = null;
        ageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.UInt32Value age = 4;</code>
     */
    public com.google.protobuf.UInt32Value.Builder getAgeBuilder() {
      
      onChanged();
      return getAgeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.UInt32Value age = 4;</code>
     */
    public com.google.protobuf.UInt32ValueOrBuilder getAgeOrBuilder() {
      if (ageBuilder_ != null) {
        return ageBuilder_.getMessageOrBuilder();
      } else {
        return age_ == null ?
            com.google.protobuf.UInt32Value.getDefaultInstance() : age_;
      }
    }
    /**
     * <code>.google.protobuf.UInt32Value age = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> 
        getAgeFieldBuilder() {
      if (ageBuilder_ == null) {
        ageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder>(
                getAge(),
                getParentForChildren(),
                isClean());
        age_ = null;
      }
      return ageBuilder_;
    }

    private com.google.protobuf.UInt32Value score_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> scoreBuilder_;
    /**
     * <code>.google.protobuf.UInt32Value score = 5;</code>
     */
    public boolean hasScore() {
      return scoreBuilder_ != null || score_ != null;
    }
    /**
     * <code>.google.protobuf.UInt32Value score = 5;</code>
     */
    public com.google.protobuf.UInt32Value getScore() {
      if (scoreBuilder_ == null) {
        return score_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : score_;
      } else {
        return scoreBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.UInt32Value score = 5;</code>
     */
    public Builder setScore(com.google.protobuf.UInt32Value value) {
      if (scoreBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        score_ = value;
        onChanged();
      } else {
        scoreBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.UInt32Value score = 5;</code>
     */
    public Builder setScore(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      if (scoreBuilder_ == null) {
        score_ = builderForValue.build();
        onChanged();
      } else {
        scoreBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.UInt32Value score = 5;</code>
     */
    public Builder mergeScore(com.google.protobuf.UInt32Value value) {
      if (scoreBuilder_ == null) {
        if (score_ != null) {
          score_ =
            com.google.protobuf.UInt32Value.newBuilder(score_).mergeFrom(value).buildPartial();
        } else {
          score_ = value;
        }
        onChanged();
      } else {
        scoreBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.UInt32Value score = 5;</code>
     */
    public Builder clearScore() {
      if (scoreBuilder_ == null) {
        score_ = null;
        onChanged();
      } else {
        score_ = null;
        scoreBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.UInt32Value score = 5;</code>
     */
    public com.google.protobuf.UInt32Value.Builder getScoreBuilder() {
      
      onChanged();
      return getScoreFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.UInt32Value score = 5;</code>
     */
    public com.google.protobuf.UInt32ValueOrBuilder getScoreOrBuilder() {
      if (scoreBuilder_ != null) {
        return scoreBuilder_.getMessageOrBuilder();
      } else {
        return score_ == null ?
            com.google.protobuf.UInt32Value.getDefaultInstance() : score_;
      }
    }
    /**
     * <code>.google.protobuf.UInt32Value score = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> 
        getScoreFieldBuilder() {
      if (scoreBuilder_ == null) {
        scoreBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder>(
                getScore(),
                getParentForChildren(),
                isClean());
        score_ = null;
      }
      return scoreBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:student.StudentsRequest)
  }

  // @@protoc_insertion_point(class_scope:student.StudentsRequest)
  private static final StudentsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new StudentsRequest();
  }

  public static StudentsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StudentsRequest>
      PARSER = new com.google.protobuf.AbstractParser<StudentsRequest>() {
    public StudentsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StudentsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StudentsRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<StudentsRequest> getParserForType() {
    return PARSER;
  }

  public StudentsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

