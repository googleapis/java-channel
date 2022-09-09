/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.channel.v1.samples;

// [START channel_v1_generated_cloudchannelserviceclient_listskus_paged_async]
import com.google.cloud.channel.v1.CloudChannelServiceClient;
import com.google.cloud.channel.v1.ListSkusRequest;
import com.google.cloud.channel.v1.ListSkusResponse;
import com.google.cloud.channel.v1.ProductName;
import com.google.cloud.channel.v1.Sku;
import com.google.common.base.Strings;

public class AsyncListSkusPaged {

  public static void main(String[] args) throws Exception {
    asyncListSkusPaged();
  }

  public static void asyncListSkusPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudChannelServiceClient cloudChannelServiceClient = CloudChannelServiceClient.create()) {
      ListSkusRequest request =
          ListSkusRequest.newBuilder()
              .setParent(ProductName.of("[PRODUCT]").toString())
              .setAccount("account-1177318867")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setLanguageCode("languageCode-2092349083")
              .build();
      while (true) {
        ListSkusResponse response = cloudChannelServiceClient.listSkusCallable().call(request);
        for (Sku element : response.getSkusList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END channel_v1_generated_cloudchannelserviceclient_listskus_paged_async]
