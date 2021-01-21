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
// source: google/cloud/channel/v1/operations.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Provides contextual information about a [google.longrunning.Operation][google.longrunning.Operation].
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.OperationMetadata}
 */
public final class OperationMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.OperationMetadata)
    OperationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OperationMetadata.newBuilder() to construct.
  private OperationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OperationMetadata() {
    operationType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OperationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private OperationMetadata(
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
          case 8:
            {
              int rawValue = input.readEnum();

              operationType_ = rawValue;
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
    return com.google.cloud.channel.v1.OperationsProto
        .internal_static_google_cloud_channel_v1_OperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.OperationsProto
        .internal_static_google_cloud_channel_v1_OperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.OperationMetadata.class,
            com.google.cloud.channel.v1.OperationMetadata.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * RPCs that return a Long Running Operation.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.channel.v1.OperationMetadata.OperationType}
   */
  public enum OperationType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value. This state doesn't show unless an error occurs.
     * </pre>
     *
     * <code>OPERATION_TYPE_UNSPECIFIED = 0;</code>
     */
    OPERATION_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by CreateEntitlement.
     * </pre>
     *
     * <code>CREATE_ENTITLEMENT = 1;</code>
     */
    CREATE_ENTITLEMENT(1),
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by ChangeRenewalSettings.
     * </pre>
     *
     * <code>CHANGE_RENEWAL_SETTINGS = 3;</code>
     */
    CHANGE_RENEWAL_SETTINGS(3),
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by StartPaidService.
     * </pre>
     *
     * <code>START_PAID_SERVICE = 5;</code>
     */
    START_PAID_SERVICE(5),
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by ActivateEntitlement.
     * </pre>
     *
     * <code>ACTIVATE_ENTITLEMENT = 7;</code>
     */
    ACTIVATE_ENTITLEMENT(7),
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by SuspendEntitlement.
     * </pre>
     *
     * <code>SUSPEND_ENTITLEMENT = 8;</code>
     */
    SUSPEND_ENTITLEMENT(8),
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by CancelEntitlement.
     * </pre>
     *
     * <code>CANCEL_ENTITLEMENT = 9;</code>
     */
    CANCEL_ENTITLEMENT(9),
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by TransferEntitlements.
     * </pre>
     *
     * <code>TRANSFER_ENTITLEMENTS = 10;</code>
     */
    TRANSFER_ENTITLEMENTS(10),
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by TransferEntitlementsToGoogle.
     * </pre>
     *
     * <code>TRANSFER_ENTITLEMENTS_TO_GOOGLE = 11;</code>
     */
    TRANSFER_ENTITLEMENTS_TO_GOOGLE(11),
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by ChangeOffer.
     * </pre>
     *
     * <code>CHANGE_OFFER = 14;</code>
     */
    CHANGE_OFFER(14),
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by ChangeParameters.
     * </pre>
     *
     * <code>CHANGE_PARAMETERS = 15;</code>
     */
    CHANGE_PARAMETERS(15),
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by ProvisionCloudIdentity.
     * </pre>
     *
     * <code>PROVISION_CLOUD_IDENTITY = 16;</code>
     */
    PROVISION_CLOUD_IDENTITY(16),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value. This state doesn't show unless an error occurs.
     * </pre>
     *
     * <code>OPERATION_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int OPERATION_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by CreateEntitlement.
     * </pre>
     *
     * <code>CREATE_ENTITLEMENT = 1;</code>
     */
    public static final int CREATE_ENTITLEMENT_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by ChangeRenewalSettings.
     * </pre>
     *
     * <code>CHANGE_RENEWAL_SETTINGS = 3;</code>
     */
    public static final int CHANGE_RENEWAL_SETTINGS_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by StartPaidService.
     * </pre>
     *
     * <code>START_PAID_SERVICE = 5;</code>
     */
    public static final int START_PAID_SERVICE_VALUE = 5;
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by ActivateEntitlement.
     * </pre>
     *
     * <code>ACTIVATE_ENTITLEMENT = 7;</code>
     */
    public static final int ACTIVATE_ENTITLEMENT_VALUE = 7;
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by SuspendEntitlement.
     * </pre>
     *
     * <code>SUSPEND_ENTITLEMENT = 8;</code>
     */
    public static final int SUSPEND_ENTITLEMENT_VALUE = 8;
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by CancelEntitlement.
     * </pre>
     *
     * <code>CANCEL_ENTITLEMENT = 9;</code>
     */
    public static final int CANCEL_ENTITLEMENT_VALUE = 9;
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by TransferEntitlements.
     * </pre>
     *
     * <code>TRANSFER_ENTITLEMENTS = 10;</code>
     */
    public static final int TRANSFER_ENTITLEMENTS_VALUE = 10;
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by TransferEntitlementsToGoogle.
     * </pre>
     *
     * <code>TRANSFER_ENTITLEMENTS_TO_GOOGLE = 11;</code>
     */
    public static final int TRANSFER_ENTITLEMENTS_TO_GOOGLE_VALUE = 11;
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by ChangeOffer.
     * </pre>
     *
     * <code>CHANGE_OFFER = 14;</code>
     */
    public static final int CHANGE_OFFER_VALUE = 14;
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by ChangeParameters.
     * </pre>
     *
     * <code>CHANGE_PARAMETERS = 15;</code>
     */
    public static final int CHANGE_PARAMETERS_VALUE = 15;
    /**
     *
     *
     * <pre>
     * Long Running Operation was triggered by ProvisionCloudIdentity.
     * </pre>
     *
     * <code>PROVISION_CLOUD_IDENTITY = 16;</code>
     */
    public static final int PROVISION_CLOUD_IDENTITY_VALUE = 16;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OperationType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OperationType forNumber(int value) {
      switch (value) {
        case 0:
          return OPERATION_TYPE_UNSPECIFIED;
        case 1:
          return CREATE_ENTITLEMENT;
        case 3:
          return CHANGE_RENEWAL_SETTINGS;
        case 5:
          return START_PAID_SERVICE;
        case 7:
          return ACTIVATE_ENTITLEMENT;
        case 8:
          return SUSPEND_ENTITLEMENT;
        case 9:
          return CANCEL_ENTITLEMENT;
        case 10:
          return TRANSFER_ENTITLEMENTS;
        case 11:
          return TRANSFER_ENTITLEMENTS_TO_GOOGLE;
        case 14:
          return CHANGE_OFFER;
        case 15:
          return CHANGE_PARAMETERS;
        case 16:
          return PROVISION_CLOUD_IDENTITY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OperationType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<OperationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OperationType>() {
          public OperationType findValueByNumber(int number) {
            return OperationType.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.channel.v1.OperationMetadata.getDescriptor().getEnumTypes().get(0);
    }

    private static final OperationType[] VALUES = values();

    public static OperationType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private OperationType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.channel.v1.OperationMetadata.OperationType)
  }

  public static final int OPERATION_TYPE_FIELD_NUMBER = 1;
  private int operationType_;
  /**
   *
   *
   * <pre>
   * The RPC that initiated this Long Running Operation.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.OperationMetadata.OperationType operation_type = 1;</code>
   *
   * @return The enum numeric value on the wire for operationType.
   */
  @java.lang.Override
  public int getOperationTypeValue() {
    return operationType_;
  }
  /**
   *
   *
   * <pre>
   * The RPC that initiated this Long Running Operation.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.OperationMetadata.OperationType operation_type = 1;</code>
   *
   * @return The operationType.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.OperationMetadata.OperationType getOperationType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.channel.v1.OperationMetadata.OperationType result =
        com.google.cloud.channel.v1.OperationMetadata.OperationType.valueOf(operationType_);
    return result == null
        ? com.google.cloud.channel.v1.OperationMetadata.OperationType.UNRECOGNIZED
        : result;
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
    if (operationType_
        != com.google.cloud.channel.v1.OperationMetadata.OperationType.OPERATION_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, operationType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operationType_
        != com.google.cloud.channel.v1.OperationMetadata.OperationType.OPERATION_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, operationType_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.OperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.OperationMetadata other =
        (com.google.cloud.channel.v1.OperationMetadata) obj;

    if (operationType_ != other.operationType_) return false;
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
    hash = (37 * hash) + OPERATION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + operationType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.OperationMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.OperationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.OperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.OperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.OperationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.OperationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.OperationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.OperationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.OperationMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.OperationMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.OperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.OperationMetadata parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.OperationMetadata prototype) {
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
   * Provides contextual information about a [google.longrunning.Operation][google.longrunning.Operation].
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.OperationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.OperationMetadata)
      com.google.cloud.channel.v1.OperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.OperationsProto
          .internal_static_google_cloud_channel_v1_OperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.OperationsProto
          .internal_static_google_cloud_channel_v1_OperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.OperationMetadata.class,
              com.google.cloud.channel.v1.OperationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.OperationMetadata.newBuilder()
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
      operationType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.OperationsProto
          .internal_static_google_cloud_channel_v1_OperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.OperationMetadata getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.OperationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.OperationMetadata build() {
      com.google.cloud.channel.v1.OperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.OperationMetadata buildPartial() {
      com.google.cloud.channel.v1.OperationMetadata result =
          new com.google.cloud.channel.v1.OperationMetadata(this);
      result.operationType_ = operationType_;
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
      if (other instanceof com.google.cloud.channel.v1.OperationMetadata) {
        return mergeFrom((com.google.cloud.channel.v1.OperationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.OperationMetadata other) {
      if (other == com.google.cloud.channel.v1.OperationMetadata.getDefaultInstance()) return this;
      if (other.operationType_ != 0) {
        setOperationTypeValue(other.getOperationTypeValue());
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
      com.google.cloud.channel.v1.OperationMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.channel.v1.OperationMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int operationType_ = 0;
    /**
     *
     *
     * <pre>
     * The RPC that initiated this Long Running Operation.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.OperationMetadata.OperationType operation_type = 1;</code>
     *
     * @return The enum numeric value on the wire for operationType.
     */
    @java.lang.Override
    public int getOperationTypeValue() {
      return operationType_;
    }
    /**
     *
     *
     * <pre>
     * The RPC that initiated this Long Running Operation.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.OperationMetadata.OperationType operation_type = 1;</code>
     *
     * @param value The enum numeric value on the wire for operationType to set.
     * @return This builder for chaining.
     */
    public Builder setOperationTypeValue(int value) {

      operationType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The RPC that initiated this Long Running Operation.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.OperationMetadata.OperationType operation_type = 1;</code>
     *
     * @return The operationType.
     */
    @java.lang.Override
    public com.google.cloud.channel.v1.OperationMetadata.OperationType getOperationType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.channel.v1.OperationMetadata.OperationType result =
          com.google.cloud.channel.v1.OperationMetadata.OperationType.valueOf(operationType_);
      return result == null
          ? com.google.cloud.channel.v1.OperationMetadata.OperationType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The RPC that initiated this Long Running Operation.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.OperationMetadata.OperationType operation_type = 1;</code>
     *
     * @param value The operationType to set.
     * @return This builder for chaining.
     */
    public Builder setOperationType(
        com.google.cloud.channel.v1.OperationMetadata.OperationType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      operationType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The RPC that initiated this Long Running Operation.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.OperationMetadata.OperationType operation_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOperationType() {

      operationType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.OperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.OperationMetadata)
  private static final com.google.cloud.channel.v1.OperationMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.OperationMetadata();
  }

  public static com.google.cloud.channel.v1.OperationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OperationMetadata> PARSER =
      new com.google.protobuf.AbstractParser<OperationMetadata>() {
        @java.lang.Override
        public OperationMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new OperationMetadata(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<OperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.OperationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
