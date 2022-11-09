// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface UpdateCustomerRepricingConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.UpdateCustomerRepricingConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The CustomerRepricingConfig object to update.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the customerRepricingConfig field is set.
   */
  boolean hasCustomerRepricingConfig();
  /**
   * <pre>
   * Required. The CustomerRepricingConfig object to update.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerRepricingConfig.
   */
  com.google.cloud.channel.v1.CustomerRepricingConfig getCustomerRepricingConfig();
  /**
   * <pre>
   * Required. The CustomerRepricingConfig object to update.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.channel.v1.CustomerRepricingConfigOrBuilder getCustomerRepricingConfigOrBuilder();
}