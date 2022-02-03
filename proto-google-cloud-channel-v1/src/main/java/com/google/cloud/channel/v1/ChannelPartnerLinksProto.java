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
// source: google/cloud/channel/v1/channel_partner_links.proto

package com.google.cloud.channel.v1;

public final class ChannelPartnerLinksProto {
  private ChannelPartnerLinksProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_ChannelPartnerLink_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_ChannelPartnerLink_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/channel/v1/channel_partne"
          + "r_links.proto\022\027google.cloud.channel.v1\032\034"
          + "google/api/annotations.proto\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\032$google/cloud/channel/v1/common"
          + ".proto\032\037google/protobuf/timestamp.proto\""
          + "\217\004\n\022ChannelPartnerLink\022\021\n\004name\030\001 \001(\tB\003\340A"
          + "\003\022\'\n\032reseller_cloud_identity_id\030\002 \001(\tB\003\340"
          + "A\002\022I\n\nlink_state\030\003 \001(\01620.google.cloud.ch"
          + "annel.v1.ChannelPartnerLinkStateB\003\340A\002\022\034\n"
          + "\017invite_link_uri\030\004 \001(\tB\003\340A\003\0224\n\013create_ti"
          + "me\030\005 \001(\0132\032.google.protobuf.TimestampB\003\340A"
          + "\003\0224\n\013update_time\030\006 \001(\0132\032.google.protobuf"
          + ".TimestampB\003\340A\003\022\026\n\tpublic_id\030\007 \001(\tB\003\340A\003\022"
          + "\\\n#channel_partner_cloud_identity_info\030\010"
          + " \001(\0132*.google.cloud.channel.v1.CloudIden"
          + "tityInfoB\003\340A\003:r\352Ao\n.cloudchannel.googlea"
          + "pis.com/ChannelPartnerLink\022=accounts/{ac"
          + "count}/channelPartnerLinks/{channel_part"
          + "ner_link}*>\n\026ChannelPartnerLinkView\022\017\n\013U"
          + "NSPECIFIED\020\000\022\t\n\005BASIC\020\001\022\010\n\004FULL\020\002*z\n\027Cha"
          + "nnelPartnerLinkState\022*\n&CHANNEL_PARTNER_"
          + "LINK_STATE_UNSPECIFIED\020\000\022\013\n\007INVITED\020\001\022\n\n"
          + "\006ACTIVE\020\002\022\013\n\007REVOKED\020\003\022\r\n\tSUSPENDED\020\004By\n"
          + "\033com.google.cloud.channel.v1B\030ChannelPar"
          + "tnerLinksProtoP\001Z>google.golang.org/genp"
          + "roto/googleapis/cloud/channel/v1;channel"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.channel.v1.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_channel_v1_ChannelPartnerLink_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_channel_v1_ChannelPartnerLink_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_ChannelPartnerLink_descriptor,
            new java.lang.String[] {
              "Name",
              "ResellerCloudIdentityId",
              "LinkState",
              "InviteLinkUri",
              "CreateTime",
              "UpdateTime",
              "PublicId",
              "ChannelPartnerCloudIdentityInfo",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.channel.v1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
