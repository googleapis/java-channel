// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

/**
 * <pre>
 * Request message for [CloudChannelService.UpdateCustomerRepricingConfig][google.cloud.channel.v1.CloudChannelService.UpdateCustomerRepricingConfig].
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest}
 */
public final class UpdateCustomerRepricingConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest)
    UpdateCustomerRepricingConfigRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateCustomerRepricingConfigRequest.newBuilder() to construct.
  private UpdateCustomerRepricingConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateCustomerRepricingConfigRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateCustomerRepricingConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateCustomerRepricingConfigRequest(
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
            com.google.cloud.channel.v1.CustomerRepricingConfig.Builder subBuilder = null;
            if (customerRepricingConfig_ != null) {
              subBuilder = customerRepricingConfig_.toBuilder();
            }
            customerRepricingConfig_ = input.readMessage(com.google.cloud.channel.v1.CustomerRepricingConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(customerRepricingConfig_);
              customerRepricingConfig_ = subBuilder.buildPartial();
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
    return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_UpdateCustomerRepricingConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_UpdateCustomerRepricingConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest.class, com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest.Builder.class);
  }

  public static final int CUSTOMER_REPRICING_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.channel.v1.CustomerRepricingConfig customerRepricingConfig_;
  /**
   * <pre>
   * Required. The CustomerRepricingConfig object to update.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the customerRepricingConfig field is set.
   */
  @java.lang.Override
  public boolean hasCustomerRepricingConfig() {
    return customerRepricingConfig_ != null;
  }
  /**
   * <pre>
   * Required. The CustomerRepricingConfig object to update.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerRepricingConfig.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.CustomerRepricingConfig getCustomerRepricingConfig() {
    return customerRepricingConfig_ == null ? com.google.cloud.channel.v1.CustomerRepricingConfig.getDefaultInstance() : customerRepricingConfig_;
  }
  /**
   * <pre>
   * Required. The CustomerRepricingConfig object to update.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.CustomerRepricingConfigOrBuilder getCustomerRepricingConfigOrBuilder() {
    return getCustomerRepricingConfig();
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
    if (customerRepricingConfig_ != null) {
      output.writeMessage(1, getCustomerRepricingConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (customerRepricingConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCustomerRepricingConfig());
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
    if (!(obj instanceof com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest other = (com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest) obj;

    if (hasCustomerRepricingConfig() != other.hasCustomerRepricingConfig()) return false;
    if (hasCustomerRepricingConfig()) {
      if (!getCustomerRepricingConfig()
          .equals(other.getCustomerRepricingConfig())) return false;
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
    if (hasCustomerRepricingConfig()) {
      hash = (37 * hash) + CUSTOMER_REPRICING_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getCustomerRepricingConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest prototype) {
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
   * <pre>
   * Request message for [CloudChannelService.UpdateCustomerRepricingConfig][google.cloud.channel.v1.CloudChannelService.UpdateCustomerRepricingConfig].
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest)
      com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_UpdateCustomerRepricingConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_UpdateCustomerRepricingConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest.class, com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest.newBuilder()
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
      if (customerRepricingConfigBuilder_ == null) {
        customerRepricingConfig_ = null;
      } else {
        customerRepricingConfig_ = null;
        customerRepricingConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto.internal_static_google_cloud_channel_v1_UpdateCustomerRepricingConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest build() {
      com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest buildPartial() {
      com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest result = new com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest(this);
      if (customerRepricingConfigBuilder_ == null) {
        result.customerRepricingConfig_ = customerRepricingConfig_;
      } else {
        result.customerRepricingConfig_ = customerRepricingConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest) {
        return mergeFrom((com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest other) {
      if (other == com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest.getDefaultInstance()) return this;
      if (other.hasCustomerRepricingConfig()) {
        mergeCustomerRepricingConfig(other.getCustomerRepricingConfig());
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
      com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.channel.v1.CustomerRepricingConfig customerRepricingConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.channel.v1.CustomerRepricingConfig, com.google.cloud.channel.v1.CustomerRepricingConfig.Builder, com.google.cloud.channel.v1.CustomerRepricingConfigOrBuilder> customerRepricingConfigBuilder_;
    /**
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the customerRepricingConfig field is set.
     */
    public boolean hasCustomerRepricingConfig() {
      return customerRepricingConfigBuilder_ != null || customerRepricingConfig_ != null;
    }
    /**
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The customerRepricingConfig.
     */
    public com.google.cloud.channel.v1.CustomerRepricingConfig getCustomerRepricingConfig() {
      if (customerRepricingConfigBuilder_ == null) {
        return customerRepricingConfig_ == null ? com.google.cloud.channel.v1.CustomerRepricingConfig.getDefaultInstance() : customerRepricingConfig_;
      } else {
        return customerRepricingConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCustomerRepricingConfig(com.google.cloud.channel.v1.CustomerRepricingConfig value) {
      if (customerRepricingConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customerRepricingConfig_ = value;
        onChanged();
      } else {
        customerRepricingConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCustomerRepricingConfig(
        com.google.cloud.channel.v1.CustomerRepricingConfig.Builder builderForValue) {
      if (customerRepricingConfigBuilder_ == null) {
        customerRepricingConfig_ = builderForValue.build();
        onChanged();
      } else {
        customerRepricingConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeCustomerRepricingConfig(com.google.cloud.channel.v1.CustomerRepricingConfig value) {
      if (customerRepricingConfigBuilder_ == null) {
        if (customerRepricingConfig_ != null) {
          customerRepricingConfig_ =
            com.google.cloud.channel.v1.CustomerRepricingConfig.newBuilder(customerRepricingConfig_).mergeFrom(value).buildPartial();
        } else {
          customerRepricingConfig_ = value;
        }
        onChanged();
      } else {
        customerRepricingConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearCustomerRepricingConfig() {
      if (customerRepricingConfigBuilder_ == null) {
        customerRepricingConfig_ = null;
        onChanged();
      } else {
        customerRepricingConfig_ = null;
        customerRepricingConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.channel.v1.CustomerRepricingConfig.Builder getCustomerRepricingConfigBuilder() {
      
      onChanged();
      return getCustomerRepricingConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.channel.v1.CustomerRepricingConfigOrBuilder getCustomerRepricingConfigOrBuilder() {
      if (customerRepricingConfigBuilder_ != null) {
        return customerRepricingConfigBuilder_.getMessageOrBuilder();
      } else {
        return customerRepricingConfig_ == null ?
            com.google.cloud.channel.v1.CustomerRepricingConfig.getDefaultInstance() : customerRepricingConfig_;
      }
    }
    /**
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.channel.v1.CustomerRepricingConfig, com.google.cloud.channel.v1.CustomerRepricingConfig.Builder, com.google.cloud.channel.v1.CustomerRepricingConfigOrBuilder> 
        getCustomerRepricingConfigFieldBuilder() {
      if (customerRepricingConfigBuilder_ == null) {
        customerRepricingConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.CustomerRepricingConfig, com.google.cloud.channel.v1.CustomerRepricingConfig.Builder, com.google.cloud.channel.v1.CustomerRepricingConfigOrBuilder>(
                getCustomerRepricingConfig(),
                getParentForChildren(),
                isClean());
        customerRepricingConfig_ = null;
      }
      return customerRepricingConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest)
  private static final com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest();
  }

  public static com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCustomerRepricingConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCustomerRepricingConfigRequest>() {
    @java.lang.Override
    public UpdateCustomerRepricingConfigRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateCustomerRepricingConfigRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateCustomerRepricingConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCustomerRepricingConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

