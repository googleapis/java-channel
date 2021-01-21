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

public interface ListProductsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ListProductsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the reseller account.
   * Format: accounts/{account_id}.
   * </pre>
   *
   * <code>string account = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The account.
   */
  java.lang.String getAccount();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the reseller account.
   * Format: accounts/{account_id}.
   * </pre>
   *
   * <code>string account = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for account.
   */
  com.google.protobuf.ByteString getAccountBytes();

  /**
   *
   *
   * <pre>
   * Optional. Requested page size. Server might return fewer results than requested.
   * If unspecified, at most 100 Products will be returned.
   * The maximum value is 1000; values above 1000 will be coerced to 1000.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results, if other than the first one.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results, if other than the first one.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. The BCP-47 language code, such as "en-US".  If specified, the
   * response will be localized to the corresponding language code. Default is
   * "en-US".
   * </pre>
   *
   * <code>string language_code = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The BCP-47 language code, such as "en-US".  If specified, the
   * response will be localized to the corresponding language code. Default is
   * "en-US".
   * </pre>
   *
   * <code>string language_code = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
