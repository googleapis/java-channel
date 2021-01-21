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

public interface ListTransferableSkusResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ListTransferableSkusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Information about existing SKUs for a customer that would need to be
   * transferred.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
   */
  java.util.List<com.google.cloud.channel.v1.TransferableSku> getTransferableSkusList();
  /**
   *
   *
   * <pre>
   * Information about existing SKUs for a customer that would need to be
   * transferred.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
   */
  com.google.cloud.channel.v1.TransferableSku getTransferableSkus(int index);
  /**
   *
   *
   * <pre>
   * Information about existing SKUs for a customer that would need to be
   * transferred.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
   */
  int getTransferableSkusCount();
  /**
   *
   *
   * <pre>
   * Information about existing SKUs for a customer that would need to be
   * transferred.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.TransferableSkuOrBuilder>
      getTransferableSkusOrBuilderList();
  /**
   *
   *
   * <pre>
   * Information about existing SKUs for a customer that would need to be
   * transferred.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.TransferableSku transferable_skus = 1;</code>
   */
  com.google.cloud.channel.v1.TransferableSkuOrBuilder getTransferableSkusOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to [ListTransferableSkusRequest.page_token][google.cloud.channel.v1.ListTransferableSkusRequest.page_token] to obtain
   * that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to [ListTransferableSkusRequest.page_token][google.cloud.channel.v1.ListTransferableSkusRequest.page_token] to obtain
   * that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
