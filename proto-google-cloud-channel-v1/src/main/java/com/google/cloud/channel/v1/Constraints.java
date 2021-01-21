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
// source: google/cloud/channel/v1/offers.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Represents the constraints for buying the Offer.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.Constraints}
 */
public final class Constraints extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.Constraints)
    ConstraintsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Constraints.newBuilder() to construct.
  private Constraints(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Constraints() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Constraints();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Constraints(
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
              com.google.cloud.channel.v1.CustomerConstraints.Builder subBuilder = null;
              if (customerConstraints_ != null) {
                subBuilder = customerConstraints_.toBuilder();
              }
              customerConstraints_ =
                  input.readMessage(
                      com.google.cloud.channel.v1.CustomerConstraints.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(customerConstraints_);
                customerConstraints_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.channel.v1.OffersProto
        .internal_static_google_cloud_channel_v1_Constraints_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.OffersProto
        .internal_static_google_cloud_channel_v1_Constraints_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.Constraints.class,
            com.google.cloud.channel.v1.Constraints.Builder.class);
  }

  public static final int CUSTOMER_CONSTRAINTS_FIELD_NUMBER = 1;
  private com.google.cloud.channel.v1.CustomerConstraints customerConstraints_;
  /**
   *
   *
   * <pre>
   * Represents constraints required to purchase the Offer for a customer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CustomerConstraints customer_constraints = 1;</code>
   *
   * @return Whether the customerConstraints field is set.
   */
  @java.lang.Override
  public boolean hasCustomerConstraints() {
    return customerConstraints_ != null;
  }
  /**
   *
   *
   * <pre>
   * Represents constraints required to purchase the Offer for a customer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CustomerConstraints customer_constraints = 1;</code>
   *
   * @return The customerConstraints.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.CustomerConstraints getCustomerConstraints() {
    return customerConstraints_ == null
        ? com.google.cloud.channel.v1.CustomerConstraints.getDefaultInstance()
        : customerConstraints_;
  }
  /**
   *
   *
   * <pre>
   * Represents constraints required to purchase the Offer for a customer.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CustomerConstraints customer_constraints = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.CustomerConstraintsOrBuilder
      getCustomerConstraintsOrBuilder() {
    return getCustomerConstraints();
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
    if (customerConstraints_ != null) {
      output.writeMessage(1, getCustomerConstraints());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (customerConstraints_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCustomerConstraints());
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
    if (!(obj instanceof com.google.cloud.channel.v1.Constraints)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.Constraints other = (com.google.cloud.channel.v1.Constraints) obj;

    if (hasCustomerConstraints() != other.hasCustomerConstraints()) return false;
    if (hasCustomerConstraints()) {
      if (!getCustomerConstraints().equals(other.getCustomerConstraints())) return false;
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
    if (hasCustomerConstraints()) {
      hash = (37 * hash) + CUSTOMER_CONSTRAINTS_FIELD_NUMBER;
      hash = (53 * hash) + getCustomerConstraints().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.Constraints parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.Constraints parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.Constraints parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.Constraints parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.Constraints parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.Constraints parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.Constraints parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.Constraints parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.Constraints parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.Constraints parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.Constraints parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.Constraints parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.Constraints prototype) {
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
   * Represents the constraints for buying the Offer.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.Constraints}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.Constraints)
      com.google.cloud.channel.v1.ConstraintsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.OffersProto
          .internal_static_google_cloud_channel_v1_Constraints_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.OffersProto
          .internal_static_google_cloud_channel_v1_Constraints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.Constraints.class,
              com.google.cloud.channel.v1.Constraints.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.Constraints.newBuilder()
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
      if (customerConstraintsBuilder_ == null) {
        customerConstraints_ = null;
      } else {
        customerConstraints_ = null;
        customerConstraintsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.OffersProto
          .internal_static_google_cloud_channel_v1_Constraints_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.Constraints getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.Constraints.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.Constraints build() {
      com.google.cloud.channel.v1.Constraints result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.Constraints buildPartial() {
      com.google.cloud.channel.v1.Constraints result =
          new com.google.cloud.channel.v1.Constraints(this);
      if (customerConstraintsBuilder_ == null) {
        result.customerConstraints_ = customerConstraints_;
      } else {
        result.customerConstraints_ = customerConstraintsBuilder_.build();
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
      if (other instanceof com.google.cloud.channel.v1.Constraints) {
        return mergeFrom((com.google.cloud.channel.v1.Constraints) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.Constraints other) {
      if (other == com.google.cloud.channel.v1.Constraints.getDefaultInstance()) return this;
      if (other.hasCustomerConstraints()) {
        mergeCustomerConstraints(other.getCustomerConstraints());
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
      com.google.cloud.channel.v1.Constraints parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.channel.v1.Constraints) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.channel.v1.CustomerConstraints customerConstraints_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.CustomerConstraints,
            com.google.cloud.channel.v1.CustomerConstraints.Builder,
            com.google.cloud.channel.v1.CustomerConstraintsOrBuilder>
        customerConstraintsBuilder_;
    /**
     *
     *
     * <pre>
     * Represents constraints required to purchase the Offer for a customer.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerConstraints customer_constraints = 1;</code>
     *
     * @return Whether the customerConstraints field is set.
     */
    public boolean hasCustomerConstraints() {
      return customerConstraintsBuilder_ != null || customerConstraints_ != null;
    }
    /**
     *
     *
     * <pre>
     * Represents constraints required to purchase the Offer for a customer.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerConstraints customer_constraints = 1;</code>
     *
     * @return The customerConstraints.
     */
    public com.google.cloud.channel.v1.CustomerConstraints getCustomerConstraints() {
      if (customerConstraintsBuilder_ == null) {
        return customerConstraints_ == null
            ? com.google.cloud.channel.v1.CustomerConstraints.getDefaultInstance()
            : customerConstraints_;
      } else {
        return customerConstraintsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Represents constraints required to purchase the Offer for a customer.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerConstraints customer_constraints = 1;</code>
     */
    public Builder setCustomerConstraints(com.google.cloud.channel.v1.CustomerConstraints value) {
      if (customerConstraintsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customerConstraints_ = value;
        onChanged();
      } else {
        customerConstraintsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents constraints required to purchase the Offer for a customer.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerConstraints customer_constraints = 1;</code>
     */
    public Builder setCustomerConstraints(
        com.google.cloud.channel.v1.CustomerConstraints.Builder builderForValue) {
      if (customerConstraintsBuilder_ == null) {
        customerConstraints_ = builderForValue.build();
        onChanged();
      } else {
        customerConstraintsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents constraints required to purchase the Offer for a customer.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerConstraints customer_constraints = 1;</code>
     */
    public Builder mergeCustomerConstraints(com.google.cloud.channel.v1.CustomerConstraints value) {
      if (customerConstraintsBuilder_ == null) {
        if (customerConstraints_ != null) {
          customerConstraints_ =
              com.google.cloud.channel.v1.CustomerConstraints.newBuilder(customerConstraints_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          customerConstraints_ = value;
        }
        onChanged();
      } else {
        customerConstraintsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents constraints required to purchase the Offer for a customer.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerConstraints customer_constraints = 1;</code>
     */
    public Builder clearCustomerConstraints() {
      if (customerConstraintsBuilder_ == null) {
        customerConstraints_ = null;
        onChanged();
      } else {
        customerConstraints_ = null;
        customerConstraintsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents constraints required to purchase the Offer for a customer.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerConstraints customer_constraints = 1;</code>
     */
    public com.google.cloud.channel.v1.CustomerConstraints.Builder getCustomerConstraintsBuilder() {

      onChanged();
      return getCustomerConstraintsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Represents constraints required to purchase the Offer for a customer.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerConstraints customer_constraints = 1;</code>
     */
    public com.google.cloud.channel.v1.CustomerConstraintsOrBuilder
        getCustomerConstraintsOrBuilder() {
      if (customerConstraintsBuilder_ != null) {
        return customerConstraintsBuilder_.getMessageOrBuilder();
      } else {
        return customerConstraints_ == null
            ? com.google.cloud.channel.v1.CustomerConstraints.getDefaultInstance()
            : customerConstraints_;
      }
    }
    /**
     *
     *
     * <pre>
     * Represents constraints required to purchase the Offer for a customer.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.CustomerConstraints customer_constraints = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.CustomerConstraints,
            com.google.cloud.channel.v1.CustomerConstraints.Builder,
            com.google.cloud.channel.v1.CustomerConstraintsOrBuilder>
        getCustomerConstraintsFieldBuilder() {
      if (customerConstraintsBuilder_ == null) {
        customerConstraintsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.channel.v1.CustomerConstraints,
                com.google.cloud.channel.v1.CustomerConstraints.Builder,
                com.google.cloud.channel.v1.CustomerConstraintsOrBuilder>(
                getCustomerConstraints(), getParentForChildren(), isClean());
        customerConstraints_ = null;
      }
      return customerConstraintsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.Constraints)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.Constraints)
  private static final com.google.cloud.channel.v1.Constraints DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.Constraints();
  }

  public static com.google.cloud.channel.v1.Constraints getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Constraints> PARSER =
      new com.google.protobuf.AbstractParser<Constraints>() {
        @java.lang.Override
        public Constraints parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Constraints(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Constraints> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Constraints> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.Constraints getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
