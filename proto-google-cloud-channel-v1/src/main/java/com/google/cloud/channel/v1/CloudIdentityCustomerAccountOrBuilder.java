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

public interface CloudIdentityCustomerAccountOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.CloudIdentityCustomerAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * True if a Cloud Identity account exists for a specific domain.
   * </pre>
   *
   * <code>bool existing = 1;</code>
   *
   * @return The existing.
   */
  boolean getExisting();

  /**
   *
   *
   * <pre>
   * True if the Cloud Identity account is associated with a customer
   * belonging to the Channel Services partner making the API call.
   * </pre>
   *
   * <code>bool owned = 2;</code>
   *
   * @return The owned.
   */
  boolean getOwned();

  /**
   *
   *
   * <pre>
   * Name of the customer that owns the Cloud Identity account. This field is
   * populated ONLY if owned = true.
   * The customer_name takes the format:
   * accounts/{account_id}/customers/{customer_id}
   * </pre>
   *
   * <code>string customer_name = 3;</code>
   *
   * @return The customerName.
   */
  java.lang.String getCustomerName();
  /**
   *
   *
   * <pre>
   * Name of the customer that owns the Cloud Identity account. This field is
   * populated ONLY if owned = true.
   * The customer_name takes the format:
   * accounts/{account_id}/customers/{customer_id}
   * </pre>
   *
   * <code>string customer_name = 3;</code>
   *
   * @return The bytes for customerName.
   */
  com.google.protobuf.ByteString getCustomerNameBytes();

  /**
   *
   *
   * <pre>
   * Cloud Identity ID of the customer. This field is populated ONLY if
   * existing = true.
   * </pre>
   *
   * <code>string customer_cloud_identity_id = 4;</code>
   *
   * @return The customerCloudIdentityId.
   */
  java.lang.String getCustomerCloudIdentityId();
  /**
   *
   *
   * <pre>
   * Cloud Identity ID of the customer. This field is populated ONLY if
   * existing = true.
   * </pre>
   *
   * <code>string customer_cloud_identity_id = 4;</code>
   *
   * @return The bytes for customerCloudIdentityId.
   */
  com.google.protobuf.ByteString getCustomerCloudIdentityIdBytes();
}
