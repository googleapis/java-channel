/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/entitlements.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Service provisioned for an entitlement.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.ProvisionedService}
 */
public final class ProvisionedService extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.ProvisionedService)
    ProvisionedServiceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProvisionedService.newBuilder() to construct.
  private ProvisionedService(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProvisionedService() {
    provisioningId_ = "";
    productId_ = "";
    skuId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProvisionedService();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ProvisionedService(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              provisioningId_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              productId_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              skuId_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.EntitlementsProto
        .internal_static_google_cloud_channel_v1_ProvisionedService_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.EntitlementsProto
        .internal_static_google_cloud_channel_v1_ProvisionedService_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.ProvisionedService.class,
            com.google.cloud.channel.v1.ProvisionedService.Builder.class);
  }

  public static final int PROVISIONING_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object provisioningId_;
  /**
   *
   *
   * <pre>
   * Output only. Provisioning ID of the entitlement. For Google Workspace, this would be the
   * underlying Subscription ID.
   * </pre>
   *
   * <code>string provisioning_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The provisioningId.
   */
  @java.lang.Override
  public java.lang.String getProvisioningId() {
    java.lang.Object ref = provisioningId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      provisioningId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Provisioning ID of the entitlement. For Google Workspace, this would be the
   * underlying Subscription ID.
   * </pre>
   *
   * <code>string provisioning_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for provisioningId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProvisioningIdBytes() {
    java.lang.Object ref = provisioningId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      provisioningId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object productId_;
  /**
   *
   *
   * <pre>
   * Output only. The product pertaining to the provisioning resource as specified in the
   * Offer.
   * </pre>
   *
   * <code>string product_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The productId.
   */
  @java.lang.Override
  public java.lang.String getProductId() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The product pertaining to the provisioning resource as specified in the
   * Offer.
   * </pre>
   *
   * <code>string product_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for productId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProductIdBytes() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      productId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SKU_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object skuId_;
  /**
   *
   *
   * <pre>
   * Output only. The SKU pertaining to the provisioning resource as specified in the Offer.
   * </pre>
   *
   * <code>string sku_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The skuId.
   */
  @java.lang.Override
  public java.lang.String getSkuId() {
    java.lang.Object ref = skuId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skuId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The SKU pertaining to the provisioning resource as specified in the Offer.
   * </pre>
   *
   * <code>string sku_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for skuId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSkuIdBytes() {
    java.lang.Object ref = skuId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      skuId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(provisioningId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, provisioningId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, productId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skuId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, skuId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(provisioningId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, provisioningId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, productId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skuId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, skuId_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.ProvisionedService)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.ProvisionedService other =
        (com.google.cloud.channel.v1.ProvisionedService) obj;

    if (!getProvisioningId().equals(other.getProvisioningId())) return false;
    if (!getProductId().equals(other.getProductId())) return false;
    if (!getSkuId().equals(other.getSkuId())) return false;
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
    hash = (37 * hash) + PROVISIONING_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProvisioningId().hashCode();
    hash = (37 * hash) + PRODUCT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProductId().hashCode();
    hash = (37 * hash) + SKU_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSkuId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.ProvisionedService parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ProvisionedService parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ProvisionedService parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ProvisionedService parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ProvisionedService parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ProvisionedService parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ProvisionedService parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ProvisionedService parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ProvisionedService parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ProvisionedService parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ProvisionedService parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ProvisionedService parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.channel.v1.ProvisionedService prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Service provisioned for an entitlement.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.ProvisionedService}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.ProvisionedService)
      com.google.cloud.channel.v1.ProvisionedServiceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.EntitlementsProto
          .internal_static_google_cloud_channel_v1_ProvisionedService_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.EntitlementsProto
          .internal_static_google_cloud_channel_v1_ProvisionedService_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.ProvisionedService.class,
              com.google.cloud.channel.v1.ProvisionedService.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.ProvisionedService.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      provisioningId_ = "";

      productId_ = "";

      skuId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.EntitlementsProto
          .internal_static_google_cloud_channel_v1_ProvisionedService_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ProvisionedService getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.ProvisionedService.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ProvisionedService build() {
      com.google.cloud.channel.v1.ProvisionedService result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ProvisionedService buildPartial() {
      com.google.cloud.channel.v1.ProvisionedService result =
          new com.google.cloud.channel.v1.ProvisionedService(this);
      result.provisioningId_ = provisioningId_;
      result.productId_ = productId_;
      result.skuId_ = skuId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.channel.v1.ProvisionedService) {
        return mergeFrom((com.google.cloud.channel.v1.ProvisionedService) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.ProvisionedService other) {
      if (other == com.google.cloud.channel.v1.ProvisionedService.getDefaultInstance()) return this;
      if (!other.getProvisioningId().isEmpty()) {
        provisioningId_ = other.provisioningId_;
        onChanged();
      }
      if (!other.getProductId().isEmpty()) {
        productId_ = other.productId_;
        onChanged();
      }
      if (!other.getSkuId().isEmpty()) {
        skuId_ = other.skuId_;
        onChanged();
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
      com.google.cloud.channel.v1.ProvisionedService parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.channel.v1.ProvisionedService) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object provisioningId_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Provisioning ID of the entitlement. For Google Workspace, this would be the
     * underlying Subscription ID.
     * </pre>
     *
     * <code>string provisioning_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The provisioningId.
     */
    public java.lang.String getProvisioningId() {
      java.lang.Object ref = provisioningId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        provisioningId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Provisioning ID of the entitlement. For Google Workspace, this would be the
     * underlying Subscription ID.
     * </pre>
     *
     * <code>string provisioning_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for provisioningId.
     */
    public com.google.protobuf.ByteString getProvisioningIdBytes() {
      java.lang.Object ref = provisioningId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        provisioningId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Provisioning ID of the entitlement. For Google Workspace, this would be the
     * underlying Subscription ID.
     * </pre>
     *
     * <code>string provisioning_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The provisioningId to set.
     * @return This builder for chaining.
     */
    public Builder setProvisioningId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      provisioningId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Provisioning ID of the entitlement. For Google Workspace, this would be the
     * underlying Subscription ID.
     * </pre>
     *
     * <code>string provisioning_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProvisioningId() {

      provisioningId_ = getDefaultInstance().getProvisioningId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Provisioning ID of the entitlement. For Google Workspace, this would be the
     * underlying Subscription ID.
     * </pre>
     *
     * <code>string provisioning_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for provisioningId to set.
     * @return This builder for chaining.
     */
    public Builder setProvisioningIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      provisioningId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object productId_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The product pertaining to the provisioning resource as specified in the
     * Offer.
     * </pre>
     *
     * <code>string product_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The productId.
     */
    public java.lang.String getProductId() {
      java.lang.Object ref = productId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The product pertaining to the provisioning resource as specified in the
     * Offer.
     * </pre>
     *
     * <code>string product_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for productId.
     */
    public com.google.protobuf.ByteString getProductIdBytes() {
      java.lang.Object ref = productId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        productId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The product pertaining to the provisioning resource as specified in the
     * Offer.
     * </pre>
     *
     * <code>string product_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The productId to set.
     * @return This builder for chaining.
     */
    public Builder setProductId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      productId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The product pertaining to the provisioning resource as specified in the
     * Offer.
     * </pre>
     *
     * <code>string product_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProductId() {

      productId_ = getDefaultInstance().getProductId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The product pertaining to the provisioning resource as specified in the
     * Offer.
     * </pre>
     *
     * <code>string product_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for productId to set.
     * @return This builder for chaining.
     */
    public Builder setProductIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      productId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object skuId_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The SKU pertaining to the provisioning resource as specified in the Offer.
     * </pre>
     *
     * <code>string sku_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The skuId.
     */
    public java.lang.String getSkuId() {
      java.lang.Object ref = skuId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skuId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The SKU pertaining to the provisioning resource as specified in the Offer.
     * </pre>
     *
     * <code>string sku_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for skuId.
     */
    public com.google.protobuf.ByteString getSkuIdBytes() {
      java.lang.Object ref = skuId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        skuId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The SKU pertaining to the provisioning resource as specified in the Offer.
     * </pre>
     *
     * <code>string sku_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The skuId to set.
     * @return This builder for chaining.
     */
    public Builder setSkuId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      skuId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The SKU pertaining to the provisioning resource as specified in the Offer.
     * </pre>
     *
     * <code>string sku_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSkuId() {

      skuId_ = getDefaultInstance().getSkuId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The SKU pertaining to the provisioning resource as specified in the Offer.
     * </pre>
     *
     * <code>string sku_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for skuId to set.
     * @return This builder for chaining.
     */
    public Builder setSkuIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      skuId_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.ProvisionedService)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.ProvisionedService)
  private static final com.google.cloud.channel.v1.ProvisionedService DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.ProvisionedService();
  }

  public static com.google.cloud.channel.v1.ProvisionedService getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProvisionedService> PARSER =
      new com.google.protobuf.AbstractParser<ProvisionedService>() {
        @java.lang.Override
        public ProvisionedService parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ProvisionedService(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ProvisionedService> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProvisionedService> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.ProvisionedService getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
