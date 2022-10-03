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
// source: google/cloud/channel/v1/products.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Represents the marketing information for a Product, SKU or Offer.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.MarketingInfo}
 */
public final class MarketingInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.MarketingInfo)
    MarketingInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MarketingInfo.newBuilder() to construct.
  private MarketingInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MarketingInfo() {
    displayName_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MarketingInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ProductsProto
        .internal_static_google_cloud_channel_v1_MarketingInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ProductsProto
        .internal_static_google_cloud_channel_v1_MarketingInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.MarketingInfo.class,
            com.google.cloud.channel.v1.MarketingInfo.Builder.class);
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object displayName_;
  /**
   *
   *
   * <pre>
   * Human readable name.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Human readable name.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object description_;
  /**
   *
   *
   * <pre>
   * Human readable description. Description can contain HTML.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Human readable description. Description can contain HTML.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEFAULT_LOGO_FIELD_NUMBER = 3;
  private com.google.cloud.channel.v1.Media defaultLogo_;
  /**
   *
   *
   * <pre>
   * Default logo.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Media default_logo = 3;</code>
   *
   * @return Whether the defaultLogo field is set.
   */
  @java.lang.Override
  public boolean hasDefaultLogo() {
    return defaultLogo_ != null;
  }
  /**
   *
   *
   * <pre>
   * Default logo.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Media default_logo = 3;</code>
   *
   * @return The defaultLogo.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.Media getDefaultLogo() {
    return defaultLogo_ == null
        ? com.google.cloud.channel.v1.Media.getDefaultInstance()
        : defaultLogo_;
  }
  /**
   *
   *
   * <pre>
   * Default logo.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Media default_logo = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.MediaOrBuilder getDefaultLogoOrBuilder() {
    return getDefaultLogo();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, displayName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (defaultLogo_ != null) {
      output.writeMessage(3, getDefaultLogo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, displayName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (defaultLogo_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getDefaultLogo());
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
    if (!(obj instanceof com.google.cloud.channel.v1.MarketingInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.MarketingInfo other =
        (com.google.cloud.channel.v1.MarketingInfo) obj;

    if (!getDisplayName().equals(other.getDisplayName())) return false;
    if (!getDescription().equals(other.getDescription())) return false;
    if (hasDefaultLogo() != other.hasDefaultLogo()) return false;
    if (hasDefaultLogo()) {
      if (!getDefaultLogo().equals(other.getDefaultLogo())) return false;
    }
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
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (hasDefaultLogo()) {
      hash = (37 * hash) + DEFAULT_LOGO_FIELD_NUMBER;
      hash = (53 * hash) + getDefaultLogo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.MarketingInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.MarketingInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.MarketingInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.MarketingInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.MarketingInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.MarketingInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.MarketingInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.MarketingInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.MarketingInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.MarketingInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.MarketingInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.MarketingInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.MarketingInfo prototype) {
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
   * Represents the marketing information for a Product, SKU or Offer.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.MarketingInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.MarketingInfo)
      com.google.cloud.channel.v1.MarketingInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ProductsProto
          .internal_static_google_cloud_channel_v1_MarketingInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ProductsProto
          .internal_static_google_cloud_channel_v1_MarketingInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.MarketingInfo.class,
              com.google.cloud.channel.v1.MarketingInfo.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.MarketingInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      displayName_ = "";

      description_ = "";

      if (defaultLogoBuilder_ == null) {
        defaultLogo_ = null;
      } else {
        defaultLogo_ = null;
        defaultLogoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ProductsProto
          .internal_static_google_cloud_channel_v1_MarketingInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.MarketingInfo getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.MarketingInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.MarketingInfo build() {
      com.google.cloud.channel.v1.MarketingInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.MarketingInfo buildPartial() {
      com.google.cloud.channel.v1.MarketingInfo result =
          new com.google.cloud.channel.v1.MarketingInfo(this);
      result.displayName_ = displayName_;
      result.description_ = description_;
      if (defaultLogoBuilder_ == null) {
        result.defaultLogo_ = defaultLogo_;
      } else {
        result.defaultLogo_ = defaultLogoBuilder_.build();
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
      if (other instanceof com.google.cloud.channel.v1.MarketingInfo) {
        return mergeFrom((com.google.cloud.channel.v1.MarketingInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.MarketingInfo other) {
      if (other == com.google.cloud.channel.v1.MarketingInfo.getDefaultInstance()) return this;
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.hasDefaultLogo()) {
        mergeDefaultLogo(other.getDefaultLogo());
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
            case 10:
              {
                displayName_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                description_ = input.readStringRequireUtf8();

                break;
              } // case 18
            case 26:
              {
                input.readMessage(getDefaultLogoFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 26
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

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * Human readable name.
     * </pre>
     *
     * <code>string display_name = 1;</code>
     *
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Human readable name.
     * </pre>
     *
     * <code>string display_name = 1;</code>
     *
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Human readable name.
     * </pre>
     *
     * <code>string display_name = 1;</code>
     *
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Human readable name.
     * </pre>
     *
     * <code>string display_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {

      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Human readable name.
     * </pre>
     *
     * <code>string display_name = 1;</code>
     *
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      displayName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     *
     *
     * <pre>
     * Human readable description. Description can contain HTML.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Human readable description. Description can contain HTML.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Human readable description. Description can contain HTML.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      description_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Human readable description. Description can contain HTML.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDescription() {

      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Human readable description. Description can contain HTML.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      description_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.channel.v1.Media defaultLogo_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.Media,
            com.google.cloud.channel.v1.Media.Builder,
            com.google.cloud.channel.v1.MediaOrBuilder>
        defaultLogoBuilder_;
    /**
     *
     *
     * <pre>
     * Default logo.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Media default_logo = 3;</code>
     *
     * @return Whether the defaultLogo field is set.
     */
    public boolean hasDefaultLogo() {
      return defaultLogoBuilder_ != null || defaultLogo_ != null;
    }
    /**
     *
     *
     * <pre>
     * Default logo.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Media default_logo = 3;</code>
     *
     * @return The defaultLogo.
     */
    public com.google.cloud.channel.v1.Media getDefaultLogo() {
      if (defaultLogoBuilder_ == null) {
        return defaultLogo_ == null
            ? com.google.cloud.channel.v1.Media.getDefaultInstance()
            : defaultLogo_;
      } else {
        return defaultLogoBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Default logo.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Media default_logo = 3;</code>
     */
    public Builder setDefaultLogo(com.google.cloud.channel.v1.Media value) {
      if (defaultLogoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        defaultLogo_ = value;
        onChanged();
      } else {
        defaultLogoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Default logo.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Media default_logo = 3;</code>
     */
    public Builder setDefaultLogo(com.google.cloud.channel.v1.Media.Builder builderForValue) {
      if (defaultLogoBuilder_ == null) {
        defaultLogo_ = builderForValue.build();
        onChanged();
      } else {
        defaultLogoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Default logo.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Media default_logo = 3;</code>
     */
    public Builder mergeDefaultLogo(com.google.cloud.channel.v1.Media value) {
      if (defaultLogoBuilder_ == null) {
        if (defaultLogo_ != null) {
          defaultLogo_ =
              com.google.cloud.channel.v1.Media.newBuilder(defaultLogo_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          defaultLogo_ = value;
        }
        onChanged();
      } else {
        defaultLogoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Default logo.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Media default_logo = 3;</code>
     */
    public Builder clearDefaultLogo() {
      if (defaultLogoBuilder_ == null) {
        defaultLogo_ = null;
        onChanged();
      } else {
        defaultLogo_ = null;
        defaultLogoBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Default logo.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Media default_logo = 3;</code>
     */
    public com.google.cloud.channel.v1.Media.Builder getDefaultLogoBuilder() {

      onChanged();
      return getDefaultLogoFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Default logo.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Media default_logo = 3;</code>
     */
    public com.google.cloud.channel.v1.MediaOrBuilder getDefaultLogoOrBuilder() {
      if (defaultLogoBuilder_ != null) {
        return defaultLogoBuilder_.getMessageOrBuilder();
      } else {
        return defaultLogo_ == null
            ? com.google.cloud.channel.v1.Media.getDefaultInstance()
            : defaultLogo_;
      }
    }
    /**
     *
     *
     * <pre>
     * Default logo.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.Media default_logo = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.Media,
            com.google.cloud.channel.v1.Media.Builder,
            com.google.cloud.channel.v1.MediaOrBuilder>
        getDefaultLogoFieldBuilder() {
      if (defaultLogoBuilder_ == null) {
        defaultLogoBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.channel.v1.Media,
                com.google.cloud.channel.v1.Media.Builder,
                com.google.cloud.channel.v1.MediaOrBuilder>(
                getDefaultLogo(), getParentForChildren(), isClean());
        defaultLogo_ = null;
      }
      return defaultLogoBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.MarketingInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.MarketingInfo)
  private static final com.google.cloud.channel.v1.MarketingInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.MarketingInfo();
  }

  public static com.google.cloud.channel.v1.MarketingInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MarketingInfo> PARSER =
      new com.google.protobuf.AbstractParser<MarketingInfo>() {
        @java.lang.Override
        public MarketingInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<MarketingInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MarketingInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.MarketingInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
