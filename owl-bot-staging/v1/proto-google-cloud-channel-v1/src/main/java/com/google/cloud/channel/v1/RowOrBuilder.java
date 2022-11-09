// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/reports_service.proto

package com.google.cloud.channel.v1;

public interface RowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.Row)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of values in the row.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ReportValue values = 1;</code>
   */
  java.util.List<com.google.cloud.channel.v1.ReportValue> 
      getValuesList();
  /**
   * <pre>
   * The list of values in the row.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ReportValue values = 1;</code>
   */
  com.google.cloud.channel.v1.ReportValue getValues(int index);
  /**
   * <pre>
   * The list of values in the row.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ReportValue values = 1;</code>
   */
  int getValuesCount();
  /**
   * <pre>
   * The list of values in the row.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ReportValue values = 1;</code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.ReportValueOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <pre>
   * The list of values in the row.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ReportValue values = 1;</code>
   */
  com.google.cloud.channel.v1.ReportValueOrBuilder getValuesOrBuilder(
      int index);
}