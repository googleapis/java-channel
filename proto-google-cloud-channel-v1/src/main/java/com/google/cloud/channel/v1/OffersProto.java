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

public final class OffersProto {
  private OffersProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_Offer_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_Offer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_ParameterDefinition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_ParameterDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_Constraints_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_Constraints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_CustomerConstraints_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_CustomerConstraints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_Plan_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_Plan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_PriceByResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_PriceByResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_Price_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_Price_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_PricePhase_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_PricePhase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_PriceTier_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_PriceTier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_Period_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_Period_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/cloud/channel/v1/offers.proto\022\027"
          + "google.cloud.channel.v1\032\037google/api/fiel"
          + "d_behavior.proto\032\031google/api/resource.pr"
          + "oto\032$google/cloud/channel/v1/common.prot"
          + "o\032&google/cloud/channel/v1/products.prot"
          + "o\032\037google/protobuf/timestamp.proto\032\027goog"
          + "le/type/money.proto\"\274\004\n\005Offer\022\014\n\004name\030\001 "
          + "\001(\t\022>\n\016marketing_info\030\002 \001(\0132&.google.clo"
          + "ud.channel.v1.MarketingInfo\022)\n\003sku\030\003 \001(\013"
          + "2\034.google.cloud.channel.v1.Sku\022+\n\004plan\030\004"
          + " \001(\0132\035.google.cloud.channel.v1.Plan\0229\n\013c"
          + "onstraints\030\005 \001(\0132$.google.cloud.channel."
          + "v1.Constraints\022D\n\022price_by_resources\030\006 \003"
          + "(\0132(.google.cloud.channel.v1.PriceByReso"
          + "urce\022.\n\nstart_time\030\007 \001(\0132\032.google.protob"
          + "uf.Timestamp\0221\n\010end_time\030\010 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\022K\n\025parameter_def"
          + "initions\030\t \003(\0132,.google.cloud.channel.v1"
          + ".ParameterDefinition\022\021\n\tdeal_code\030\014 \001(\t:"
          + "I\352AF\n!cloudchannel.googleapis.com/Offer\022"
          + "!accounts/{account}/offers/{offer}\"\373\002\n\023P"
          + "arameterDefinition\022\014\n\004name\030\001 \001(\t\022R\n\016para"
          + "meter_type\030\002 \001(\0162:.google.cloud.channel."
          + "v1.ParameterDefinition.ParameterType\0221\n\t"
          + "min_value\030\003 \001(\0132\036.google.cloud.channel.v"
          + "1.Value\0221\n\tmax_value\030\004 \001(\0132\036.google.clou"
          + "d.channel.v1.Value\0226\n\016allowed_values\030\005 \003"
          + "(\0132\036.google.cloud.channel.v1.Value\022\020\n\010op"
          + "tional\030\006 \001(\010\"R\n\rParameterType\022\036\n\032PARAMET"
          + "ER_TYPE_UNSPECIFIED\020\000\022\t\n\005INT64\020\001\022\n\n\006STRI"
          + "NG\020\002\022\n\n\006DOUBLE\020\003\"Y\n\013Constraints\022J\n\024custo"
          + "mer_constraints\030\001 \001(\0132,.google.cloud.cha"
          + "nnel.v1.CustomerConstraints\"\327\001\n\023Customer"
          + "Constraints\022\027\n\017allowed_regions\030\001 \003(\t\022W\n\026"
          + "allowed_customer_types\030\002 \003(\01627.google.cl"
          + "oud.channel.v1.CloudIdentityInfo.Custome"
          + "rType\022N\n\027promotional_order_types\030\003 \003(\0162-"
          + ".google.cloud.channel.v1.PromotionalOrde"
          + "rType\"\206\002\n\004Plan\022:\n\014payment_plan\030\001 \001(\0162$.g"
          + "oogle.cloud.channel.v1.PaymentPlan\022:\n\014pa"
          + "yment_type\030\002 \001(\0162$.google.cloud.channel."
          + "v1.PaymentType\0226\n\rpayment_cycle\030\003 \001(\0132\037."
          + "google.cloud.channel.v1.Period\0225\n\014trial_"
          + "period\030\004 \001(\0132\037.google.cloud.channel.v1.P"
          + "eriod\022\027\n\017billing_account\030\005 \001(\t\"\271\001\n\017Price"
          + "ByResource\022<\n\rresource_type\030\001 \001(\0162%.goog"
          + "le.cloud.channel.v1.ResourceType\022-\n\005pric"
          + "e\030\002 \001(\0132\036.google.cloud.channel.v1.Price\022"
          + "9\n\014price_phases\030\003 \003(\0132#.google.cloud.cha"
          + "nnel.v1.PricePhase\"\212\001\n\005Price\022&\n\nbase_pri"
          + "ce\030\001 \001(\0132\022.google.type.Money\022\020\n\010discount"
          + "\030\002 \001(\001\022+\n\017effective_price\030\003 \001(\0132\022.google"
          + ".type.Money\022\032\n\022external_price_uri\030\004 \001(\t\""
          + "\331\001\n\nPricePhase\0228\n\013period_type\030\001 \001(\0162#.go"
          + "ogle.cloud.channel.v1.PeriodType\022\024\n\014firs"
          + "t_period\030\002 \001(\005\022\023\n\013last_period\030\003 \001(\005\022-\n\005p"
          + "rice\030\004 \001(\0132\036.google.cloud.channel.v1.Pri"
          + "ce\0227\n\013price_tiers\030\005 \003(\0132\".google.cloud.c"
          + "hannel.v1.PriceTier\"i\n\tPriceTier\022\026\n\016firs"
          + "t_resource\030\001 \001(\005\022\025\n\rlast_resource\030\002 \001(\005\022"
          + "-\n\005price\030\003 \001(\0132\036.google.cloud.channel.v1"
          + ".Price\"T\n\006Period\022\020\n\010duration\030\001 \001(\005\0228\n\013pe"
          + "riod_type\030\002 \001(\0162#.google.cloud.channel.v"
          + "1.PeriodType*m\n\024PromotionalOrderType\022 \n\034"
          + "PROMOTIONAL_TYPE_UNSPECIFIED\020\000\022\017\n\013NEW_UP"
          + "GRADE\020\001\022\014\n\010TRANSFER\020\002\022\024\n\020PROMOTION_SWITC"
          + "H\020\003*k\n\013PaymentPlan\022\034\n\030PAYMENT_PLAN_UNSPE"
          + "CIFIED\020\000\022\016\n\nCOMMITMENT\020\001\022\014\n\010FLEXIBLE\020\002\022\010"
          + "\n\004FREE\020\003\022\t\n\005TRIAL\020\004\022\013\n\007OFFLINE\020\005*D\n\013Paym"
          + "entType\022\034\n\030PAYMENT_TYPE_UNSPECIFIED\020\000\022\n\n"
          + "\006PREPAY\020\001\022\013\n\007POSTPAY\020\002*\212\001\n\014ResourceType\022"
          + "\035\n\031RESOURCE_TYPE_UNSPECIFIED\020\000\022\010\n\004SEAT\020\001"
          + "\022\007\n\003MAU\020\002\022\006\n\002GB\020\003\022\021\n\rLICENSED_USER\020\004\022\013\n\007"
          + "MINUTES\020\005\022\016\n\nIAAS_USAGE\020\006\022\020\n\014SUBSCRIPTIO"
          + "N\020\007*G\n\nPeriodType\022\033\n\027PERIOD_TYPE_UNSPECI"
          + "FIED\020\000\022\007\n\003DAY\020\001\022\t\n\005MONTH\020\002\022\010\n\004YEAR\020\003Bl\n\033"
          + "com.google.cloud.channel.v1B\013OffersProto"
          + "P\001Z>google.golang.org/genproto/googleapi"
          + "s/cloud/channel/v1;channelb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.channel.v1.CommonProto.getDescriptor(),
              com.google.cloud.channel.v1.ProductsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.MoneyProto.getDescriptor(),
            });
    internal_static_google_cloud_channel_v1_Offer_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_channel_v1_Offer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_Offer_descriptor,
            new java.lang.String[] {
              "Name",
              "MarketingInfo",
              "Sku",
              "Plan",
              "Constraints",
              "PriceByResources",
              "StartTime",
              "EndTime",
              "ParameterDefinitions",
              "DealCode",
            });
    internal_static_google_cloud_channel_v1_ParameterDefinition_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_channel_v1_ParameterDefinition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_ParameterDefinition_descriptor,
            new java.lang.String[] {
              "Name", "ParameterType", "MinValue", "MaxValue", "AllowedValues", "Optional",
            });
    internal_static_google_cloud_channel_v1_Constraints_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_channel_v1_Constraints_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_Constraints_descriptor,
            new java.lang.String[] {
              "CustomerConstraints",
            });
    internal_static_google_cloud_channel_v1_CustomerConstraints_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_channel_v1_CustomerConstraints_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_CustomerConstraints_descriptor,
            new java.lang.String[] {
              "AllowedRegions", "AllowedCustomerTypes", "PromotionalOrderTypes",
            });
    internal_static_google_cloud_channel_v1_Plan_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_channel_v1_Plan_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_Plan_descriptor,
            new java.lang.String[] {
              "PaymentPlan", "PaymentType", "PaymentCycle", "TrialPeriod", "BillingAccount",
            });
    internal_static_google_cloud_channel_v1_PriceByResource_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_channel_v1_PriceByResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_PriceByResource_descriptor,
            new java.lang.String[] {
              "ResourceType", "Price", "PricePhases",
            });
    internal_static_google_cloud_channel_v1_Price_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_channel_v1_Price_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_Price_descriptor,
            new java.lang.String[] {
              "BasePrice", "Discount", "EffectivePrice", "ExternalPriceUri",
            });
    internal_static_google_cloud_channel_v1_PricePhase_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_channel_v1_PricePhase_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_PricePhase_descriptor,
            new java.lang.String[] {
              "PeriodType", "FirstPeriod", "LastPeriod", "Price", "PriceTiers",
            });
    internal_static_google_cloud_channel_v1_PriceTier_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_channel_v1_PriceTier_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_PriceTier_descriptor,
            new java.lang.String[] {
              "FirstResource", "LastResource", "Price",
            });
    internal_static_google_cloud_channel_v1_Period_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_channel_v1_Period_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_Period_descriptor,
            new java.lang.String[] {
              "Duration", "PeriodType",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.channel.v1.CommonProto.getDescriptor();
    com.google.cloud.channel.v1.ProductsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.MoneyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
