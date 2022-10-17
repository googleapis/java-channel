// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/reports_service.proto

package com.google.cloud.channel.v1;

public interface FetchReportResultsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.FetchReportResultsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The metadata for the report results (display name, columns, row count, and
   * date ranges).
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ReportResultsMetadata report_metadata = 1;</code>
   * @return Whether the reportMetadata field is set.
   */
  boolean hasReportMetadata();
  /**
   * <pre>
   * The metadata for the report results (display name, columns, row count, and
   * date ranges).
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ReportResultsMetadata report_metadata = 1;</code>
   * @return The reportMetadata.
   */
  com.google.cloud.channel.v1.ReportResultsMetadata getReportMetadata();
  /**
   * <pre>
   * The metadata for the report results (display name, columns, row count, and
   * date ranges).
   * </pre>
   *
   * <code>.google.cloud.channel.v1.ReportResultsMetadata report_metadata = 1;</code>
   */
  com.google.cloud.channel.v1.ReportResultsMetadataOrBuilder getReportMetadataOrBuilder();

  /**
   * <pre>
   * The report's lists of values. Each row follows the settings and ordering
   * of the columns from `report_metadata`.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Row rows = 2;</code>
   */
  java.util.List<com.google.cloud.channel.v1.Row> 
      getRowsList();
  /**
   * <pre>
   * The report's lists of values. Each row follows the settings and ordering
   * of the columns from `report_metadata`.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Row rows = 2;</code>
   */
  com.google.cloud.channel.v1.Row getRows(int index);
  /**
   * <pre>
   * The report's lists of values. Each row follows the settings and ordering
   * of the columns from `report_metadata`.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Row rows = 2;</code>
   */
  int getRowsCount();
  /**
   * <pre>
   * The report's lists of values. Each row follows the settings and ordering
   * of the columns from `report_metadata`.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Row rows = 2;</code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.RowOrBuilder> 
      getRowsOrBuilderList();
  /**
   * <pre>
   * The report's lists of values. Each row follows the settings and ordering
   * of the columns from `report_metadata`.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Row rows = 2;</code>
   */
  com.google.cloud.channel.v1.RowOrBuilder getRowsOrBuilder(
      int index);

  /**
   * <pre>
   * Pass this token to [FetchReportResultsRequest.page_token][google.cloud.channel.v1.FetchReportResultsRequest.page_token] to retrieve
   * the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Pass this token to [FetchReportResultsRequest.page_token][google.cloud.channel.v1.FetchReportResultsRequest.page_token] to retrieve
   * the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
