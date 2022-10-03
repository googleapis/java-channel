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
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Entity representing a Cloud Identity account that may be
 * associated with a Channel Services API partner.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.CloudIdentityCustomerAccount}
 */
public final class CloudIdentityCustomerAccount extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.CloudIdentityCustomerAccount)
    CloudIdentityCustomerAccountOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CloudIdentityCustomerAccount.newBuilder() to construct.
  private CloudIdentityCustomerAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CloudIdentityCustomerAccount() {
    customerName_ = "";
    customerCloudIdentityId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CloudIdentityCustomerAccount();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_CloudIdentityCustomerAccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_CloudIdentityCustomerAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.CloudIdentityCustomerAccount.class,
            com.google.cloud.channel.v1.CloudIdentityCustomerAccount.Builder.class);
  }

  public static final int EXISTING_FIELD_NUMBER = 1;
  private boolean existing_;
  /**
   *
   *
   * <pre>
   * Returns true if a Cloud Identity account exists for a specific domain.
   * </pre>
   *
   * <code>bool existing = 1;</code>
   *
   * @return The existing.
   */
  @java.lang.Override
  public boolean getExisting() {
    return existing_;
  }

  public static final int OWNED_FIELD_NUMBER = 2;
  private boolean owned_;
  /**
   *
   *
   * <pre>
   * Returns true if the Cloud Identity account is associated with a customer
   * of the Channel Services partner.
   * </pre>
   *
   * <code>bool owned = 2;</code>
   *
   * @return The owned.
   */
  @java.lang.Override
  public boolean getOwned() {
    return owned_;
  }

  public static final int CUSTOMER_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object customerName_;
  /**
   *
   *
   * <pre>
   * If owned = true, the name of the customer that owns the Cloud Identity
   * account.
   * Customer_name uses the format:
   * accounts/{account_id}/customers/{customer_id}
   * </pre>
   *
   * <code>string customer_name = 3;</code>
   *
   * @return The customerName.
   */
  @java.lang.Override
  public java.lang.String getCustomerName() {
    java.lang.Object ref = customerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If owned = true, the name of the customer that owns the Cloud Identity
   * account.
   * Customer_name uses the format:
   * accounts/{account_id}/customers/{customer_id}
   * </pre>
   *
   * <code>string customer_name = 3;</code>
   *
   * @return The bytes for customerName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCustomerNameBytes() {
    java.lang.Object ref = customerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      customerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOMER_CLOUD_IDENTITY_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object customerCloudIdentityId_;
  /**
   *
   *
   * <pre>
   * If existing = true, the Cloud Identity ID of the customer.
   * </pre>
   *
   * <code>string customer_cloud_identity_id = 4;</code>
   *
   * @return The customerCloudIdentityId.
   */
  @java.lang.Override
  public java.lang.String getCustomerCloudIdentityId() {
    java.lang.Object ref = customerCloudIdentityId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerCloudIdentityId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If existing = true, the Cloud Identity ID of the customer.
   * </pre>
   *
   * <code>string customer_cloud_identity_id = 4;</code>
   *
   * @return The bytes for customerCloudIdentityId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCustomerCloudIdentityIdBytes() {
    java.lang.Object ref = customerCloudIdentityId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      customerCloudIdentityId_ = b;
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
    if (existing_ != false) {
      output.writeBool(1, existing_);
    }
    if (owned_ != false) {
      output.writeBool(2, owned_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, customerName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerCloudIdentityId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, customerCloudIdentityId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (existing_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, existing_);
    }
    if (owned_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, owned_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, customerName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerCloudIdentityId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, customerCloudIdentityId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.channel.v1.CloudIdentityCustomerAccount)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.CloudIdentityCustomerAccount other =
        (com.google.cloud.channel.v1.CloudIdentityCustomerAccount) obj;

    if (getExisting() != other.getExisting()) return false;
    if (getOwned() != other.getOwned()) return false;
    if (!getCustomerName().equals(other.getCustomerName())) return false;
    if (!getCustomerCloudIdentityId().equals(other.getCustomerCloudIdentityId())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EXISTING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getExisting());
    hash = (37 * hash) + OWNED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getOwned());
    hash = (37 * hash) + CUSTOMER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerName().hashCode();
    hash = (37 * hash) + CUSTOMER_CLOUD_IDENTITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerCloudIdentityId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.CloudIdentityCustomerAccount parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.CloudIdentityCustomerAccount parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CloudIdentityCustomerAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.CloudIdentityCustomerAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CloudIdentityCustomerAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.CloudIdentityCustomerAccount parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CloudIdentityCustomerAccount parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.CloudIdentityCustomerAccount parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CloudIdentityCustomerAccount parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.CloudIdentityCustomerAccount parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CloudIdentityCustomerAccount parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.CloudIdentityCustomerAccount parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.channel.v1.CloudIdentityCustomerAccount prototype) {
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
   * Entity representing a Cloud Identity account that may be
   * associated with a Channel Services API partner.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.CloudIdentityCustomerAccount}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.CloudIdentityCustomerAccount)
      com.google.cloud.channel.v1.CloudIdentityCustomerAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_CloudIdentityCustomerAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_CloudIdentityCustomerAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.CloudIdentityCustomerAccount.class,
              com.google.cloud.channel.v1.CloudIdentityCustomerAccount.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.CloudIdentityCustomerAccount.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      existing_ = false;

      owned_ = false;

      customerName_ = "";

      customerCloudIdentityId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_CloudIdentityCustomerAccount_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CloudIdentityCustomerAccount getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.CloudIdentityCustomerAccount.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CloudIdentityCustomerAccount build() {
      com.google.cloud.channel.v1.CloudIdentityCustomerAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CloudIdentityCustomerAccount buildPartial() {
      com.google.cloud.channel.v1.CloudIdentityCustomerAccount result =
          new com.google.cloud.channel.v1.CloudIdentityCustomerAccount(this);
      result.existing_ = existing_;
      result.owned_ = owned_;
      result.customerName_ = customerName_;
      result.customerCloudIdentityId_ = customerCloudIdentityId_;
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
      if (other instanceof com.google.cloud.channel.v1.CloudIdentityCustomerAccount) {
        return mergeFrom((com.google.cloud.channel.v1.CloudIdentityCustomerAccount) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.CloudIdentityCustomerAccount other) {
      if (other == com.google.cloud.channel.v1.CloudIdentityCustomerAccount.getDefaultInstance())
        return this;
      if (other.getExisting() != false) {
        setExisting(other.getExisting());
      }
      if (other.getOwned() != false) {
        setOwned(other.getOwned());
      }
      if (!other.getCustomerName().isEmpty()) {
        customerName_ = other.customerName_;
        onChanged();
      }
      if (!other.getCustomerCloudIdentityId().isEmpty()) {
        customerCloudIdentityId_ = other.customerCloudIdentityId_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                existing_ = input.readBool();

                break;
              } // case 8
            case 16:
              {
                owned_ = input.readBool();

                break;
              } // case 16
            case 26:
              {
                customerName_ = input.readStringRequireUtf8();

                break;
              } // case 26
            case 34:
              {
                customerCloudIdentityId_ = input.readStringRequireUtf8();

                break;
              } // case 34
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private boolean existing_;
    /**
     *
     *
     * <pre>
     * Returns true if a Cloud Identity account exists for a specific domain.
     * </pre>
     *
     * <code>bool existing = 1;</code>
     *
     * @return The existing.
     */
    @java.lang.Override
    public boolean getExisting() {
      return existing_;
    }
    /**
     *
     *
     * <pre>
     * Returns true if a Cloud Identity account exists for a specific domain.
     * </pre>
     *
     * <code>bool existing = 1;</code>
     *
     * @param value The existing to set.
     * @return This builder for chaining.
     */
    public Builder setExisting(boolean value) {

      existing_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Returns true if a Cloud Identity account exists for a specific domain.
     * </pre>
     *
     * <code>bool existing = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExisting() {

      existing_ = false;
      onChanged();
      return this;
    }

    private boolean owned_;
    /**
     *
     *
     * <pre>
     * Returns true if the Cloud Identity account is associated with a customer
     * of the Channel Services partner.
     * </pre>
     *
     * <code>bool owned = 2;</code>
     *
     * @return The owned.
     */
    @java.lang.Override
    public boolean getOwned() {
      return owned_;
    }
    /**
     *
     *
     * <pre>
     * Returns true if the Cloud Identity account is associated with a customer
     * of the Channel Services partner.
     * </pre>
     *
     * <code>bool owned = 2;</code>
     *
     * @param value The owned to set.
     * @return This builder for chaining.
     */
    public Builder setOwned(boolean value) {

      owned_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Returns true if the Cloud Identity account is associated with a customer
     * of the Channel Services partner.
     * </pre>
     *
     * <code>bool owned = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOwned() {

      owned_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object customerName_ = "";
    /**
     *
     *
     * <pre>
     * If owned = true, the name of the customer that owns the Cloud Identity
     * account.
     * Customer_name uses the format:
     * accounts/{account_id}/customers/{customer_id}
     * </pre>
     *
     * <code>string customer_name = 3;</code>
     *
     * @return The customerName.
     */
    public java.lang.String getCustomerName() {
      java.lang.Object ref = customerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If owned = true, the name of the customer that owns the Cloud Identity
     * account.
     * Customer_name uses the format:
     * accounts/{account_id}/customers/{customer_id}
     * </pre>
     *
     * <code>string customer_name = 3;</code>
     *
     * @return The bytes for customerName.
     */
    public com.google.protobuf.ByteString getCustomerNameBytes() {
      java.lang.Object ref = customerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        customerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If owned = true, the name of the customer that owns the Cloud Identity
     * account.
     * Customer_name uses the format:
     * accounts/{account_id}/customers/{customer_id}
     * </pre>
     *
     * <code>string customer_name = 3;</code>
     *
     * @param value The customerName to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      customerName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If owned = true, the name of the customer that owns the Cloud Identity
     * account.
     * Customer_name uses the format:
     * accounts/{account_id}/customers/{customer_id}
     * </pre>
     *
     * <code>string customer_name = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCustomerName() {

      customerName_ = getDefaultInstance().getCustomerName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If owned = true, the name of the customer that owns the Cloud Identity
     * account.
     * Customer_name uses the format:
     * accounts/{account_id}/customers/{customer_id}
     * </pre>
     *
     * <code>string customer_name = 3;</code>
     *
     * @param value The bytes for customerName to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      customerName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object customerCloudIdentityId_ = "";
    /**
     *
     *
     * <pre>
     * If existing = true, the Cloud Identity ID of the customer.
     * </pre>
     *
     * <code>string customer_cloud_identity_id = 4;</code>
     *
     * @return The customerCloudIdentityId.
     */
    public java.lang.String getCustomerCloudIdentityId() {
      java.lang.Object ref = customerCloudIdentityId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerCloudIdentityId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If existing = true, the Cloud Identity ID of the customer.
     * </pre>
     *
     * <code>string customer_cloud_identity_id = 4;</code>
     *
     * @return The bytes for customerCloudIdentityId.
     */
    public com.google.protobuf.ByteString getCustomerCloudIdentityIdBytes() {
      java.lang.Object ref = customerCloudIdentityId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        customerCloudIdentityId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If existing = true, the Cloud Identity ID of the customer.
     * </pre>
     *
     * <code>string customer_cloud_identity_id = 4;</code>
     *
     * @param value The customerCloudIdentityId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerCloudIdentityId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      customerCloudIdentityId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If existing = true, the Cloud Identity ID of the customer.
     * </pre>
     *
     * <code>string customer_cloud_identity_id = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCustomerCloudIdentityId() {

      customerCloudIdentityId_ = getDefaultInstance().getCustomerCloudIdentityId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If existing = true, the Cloud Identity ID of the customer.
     * </pre>
     *
     * <code>string customer_cloud_identity_id = 4;</code>
     *
     * @param value The bytes for customerCloudIdentityId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerCloudIdentityIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      customerCloudIdentityId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.CloudIdentityCustomerAccount)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.CloudIdentityCustomerAccount)
  private static final com.google.cloud.channel.v1.CloudIdentityCustomerAccount DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.CloudIdentityCustomerAccount();
  }

  public static com.google.cloud.channel.v1.CloudIdentityCustomerAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudIdentityCustomerAccount> PARSER =
      new com.google.protobuf.AbstractParser<CloudIdentityCustomerAccount>() {
        @java.lang.Override
        public CloudIdentityCustomerAccount parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<CloudIdentityCustomerAccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudIdentityCustomerAccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.CloudIdentityCustomerAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
