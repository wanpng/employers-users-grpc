// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/employer_service.grpc.proto

package com.wanpng.employer.grpc.service;

/**
 * Protobuf type {@code protos.service.UpdateCompanyProfileRequest}
 */
public final class UpdateCompanyProfileRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.service.UpdateCompanyProfileRequest)
    UpdateCompanyProfileRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateCompanyProfileRequest.newBuilder() to construct.
  private UpdateCompanyProfileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateCompanyProfileRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateCompanyProfileRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateCompanyProfileRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            com.wanpng.employer.grpc.domain.CompanyProfileGrpc.Builder subBuilder = null;
            if (employerProfile_ != null) {
              subBuilder = employerProfile_.toBuilder();
            }
            employerProfile_ = input.readMessage(com.wanpng.employer.grpc.domain.CompanyProfileGrpc.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(employerProfile_);
              employerProfile_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
    return com.wanpng.employer.grpc.service.EmployerUsersProtos.internal_static_protos_service_UpdateCompanyProfileRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanpng.employer.grpc.service.EmployerUsersProtos.internal_static_protos_service_UpdateCompanyProfileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest.class, com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest.Builder.class);
  }

  public static final int EMPLOYER_PROFILE_FIELD_NUMBER = 1;
  private com.wanpng.employer.grpc.domain.CompanyProfileGrpc employerProfile_;
  /**
   * <code>.protos.domain.CompanyProfileGrpc employer_profile = 1;</code>
   * @return Whether the employerProfile field is set.
   */
  @java.lang.Override
  public boolean hasEmployerProfile() {
    return employerProfile_ != null;
  }
  /**
   * <code>.protos.domain.CompanyProfileGrpc employer_profile = 1;</code>
   * @return The employerProfile.
   */
  @java.lang.Override
  public com.wanpng.employer.grpc.domain.CompanyProfileGrpc getEmployerProfile() {
    return employerProfile_ == null ? com.wanpng.employer.grpc.domain.CompanyProfileGrpc.getDefaultInstance() : employerProfile_;
  }
  /**
   * <code>.protos.domain.CompanyProfileGrpc employer_profile = 1;</code>
   */
  @java.lang.Override
  public com.wanpng.employer.grpc.domain.CompanyProfileGrpcOrBuilder getEmployerProfileOrBuilder() {
    return getEmployerProfile();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (employerProfile_ != null) {
      output.writeMessage(1, getEmployerProfile());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (employerProfile_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEmployerProfile());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest)) {
      return super.equals(obj);
    }
    com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest other = (com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest) obj;

    if (hasEmployerProfile() != other.hasEmployerProfile()) return false;
    if (hasEmployerProfile()) {
      if (!getEmployerProfile()
          .equals(other.getEmployerProfile())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasEmployerProfile()) {
      hash = (37 * hash) + EMPLOYER_PROFILE_FIELD_NUMBER;
      hash = (53 * hash) + getEmployerProfile().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code protos.service.UpdateCompanyProfileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.service.UpdateCompanyProfileRequest)
      com.wanpng.employer.grpc.service.UpdateCompanyProfileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanpng.employer.grpc.service.EmployerUsersProtos.internal_static_protos_service_UpdateCompanyProfileRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanpng.employer.grpc.service.EmployerUsersProtos.internal_static_protos_service_UpdateCompanyProfileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest.class, com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest.Builder.class);
    }

    // Construct using com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (employerProfileBuilder_ == null) {
        employerProfile_ = null;
      } else {
        employerProfile_ = null;
        employerProfileBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanpng.employer.grpc.service.EmployerUsersProtos.internal_static_protos_service_UpdateCompanyProfileRequest_descriptor;
    }

    @java.lang.Override
    public com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest getDefaultInstanceForType() {
      return com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest build() {
      com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest buildPartial() {
      com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest result = new com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest(this);
      if (employerProfileBuilder_ == null) {
        result.employerProfile_ = employerProfile_;
      } else {
        result.employerProfile_ = employerProfileBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest) {
        return mergeFrom((com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest other) {
      if (other == com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest.getDefaultInstance()) return this;
      if (other.hasEmployerProfile()) {
        mergeEmployerProfile(other.getEmployerProfile());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.wanpng.employer.grpc.domain.CompanyProfileGrpc employerProfile_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wanpng.employer.grpc.domain.CompanyProfileGrpc, com.wanpng.employer.grpc.domain.CompanyProfileGrpc.Builder, com.wanpng.employer.grpc.domain.CompanyProfileGrpcOrBuilder> employerProfileBuilder_;
    /**
     * <code>.protos.domain.CompanyProfileGrpc employer_profile = 1;</code>
     * @return Whether the employerProfile field is set.
     */
    public boolean hasEmployerProfile() {
      return employerProfileBuilder_ != null || employerProfile_ != null;
    }
    /**
     * <code>.protos.domain.CompanyProfileGrpc employer_profile = 1;</code>
     * @return The employerProfile.
     */
    public com.wanpng.employer.grpc.domain.CompanyProfileGrpc getEmployerProfile() {
      if (employerProfileBuilder_ == null) {
        return employerProfile_ == null ? com.wanpng.employer.grpc.domain.CompanyProfileGrpc.getDefaultInstance() : employerProfile_;
      } else {
        return employerProfileBuilder_.getMessage();
      }
    }
    /**
     * <code>.protos.domain.CompanyProfileGrpc employer_profile = 1;</code>
     */
    public Builder setEmployerProfile(com.wanpng.employer.grpc.domain.CompanyProfileGrpc value) {
      if (employerProfileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        employerProfile_ = value;
        onChanged();
      } else {
        employerProfileBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.protos.domain.CompanyProfileGrpc employer_profile = 1;</code>
     */
    public Builder setEmployerProfile(
        com.wanpng.employer.grpc.domain.CompanyProfileGrpc.Builder builderForValue) {
      if (employerProfileBuilder_ == null) {
        employerProfile_ = builderForValue.build();
        onChanged();
      } else {
        employerProfileBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.protos.domain.CompanyProfileGrpc employer_profile = 1;</code>
     */
    public Builder mergeEmployerProfile(com.wanpng.employer.grpc.domain.CompanyProfileGrpc value) {
      if (employerProfileBuilder_ == null) {
        if (employerProfile_ != null) {
          employerProfile_ =
            com.wanpng.employer.grpc.domain.CompanyProfileGrpc.newBuilder(employerProfile_).mergeFrom(value).buildPartial();
        } else {
          employerProfile_ = value;
        }
        onChanged();
      } else {
        employerProfileBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.protos.domain.CompanyProfileGrpc employer_profile = 1;</code>
     */
    public Builder clearEmployerProfile() {
      if (employerProfileBuilder_ == null) {
        employerProfile_ = null;
        onChanged();
      } else {
        employerProfile_ = null;
        employerProfileBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.protos.domain.CompanyProfileGrpc employer_profile = 1;</code>
     */
    public com.wanpng.employer.grpc.domain.CompanyProfileGrpc.Builder getEmployerProfileBuilder() {
      
      onChanged();
      return getEmployerProfileFieldBuilder().getBuilder();
    }
    /**
     * <code>.protos.domain.CompanyProfileGrpc employer_profile = 1;</code>
     */
    public com.wanpng.employer.grpc.domain.CompanyProfileGrpcOrBuilder getEmployerProfileOrBuilder() {
      if (employerProfileBuilder_ != null) {
        return employerProfileBuilder_.getMessageOrBuilder();
      } else {
        return employerProfile_ == null ?
            com.wanpng.employer.grpc.domain.CompanyProfileGrpc.getDefaultInstance() : employerProfile_;
      }
    }
    /**
     * <code>.protos.domain.CompanyProfileGrpc employer_profile = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wanpng.employer.grpc.domain.CompanyProfileGrpc, com.wanpng.employer.grpc.domain.CompanyProfileGrpc.Builder, com.wanpng.employer.grpc.domain.CompanyProfileGrpcOrBuilder> 
        getEmployerProfileFieldBuilder() {
      if (employerProfileBuilder_ == null) {
        employerProfileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.wanpng.employer.grpc.domain.CompanyProfileGrpc, com.wanpng.employer.grpc.domain.CompanyProfileGrpc.Builder, com.wanpng.employer.grpc.domain.CompanyProfileGrpcOrBuilder>(
                getEmployerProfile(),
                getParentForChildren(),
                isClean());
        employerProfile_ = null;
      }
      return employerProfileBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:protos.service.UpdateCompanyProfileRequest)
  }

  // @@protoc_insertion_point(class_scope:protos.service.UpdateCompanyProfileRequest)
  private static final com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest();
  }

  public static com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCompanyProfileRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCompanyProfileRequest>() {
    @java.lang.Override
    public UpdateCompanyProfileRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateCompanyProfileRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateCompanyProfileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCompanyProfileRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wanpng.employer.grpc.service.UpdateCompanyProfileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

