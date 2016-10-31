// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/data.proto

package com.google.bigtable.v2;

public interface RowRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.RowRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bytes start_key_closed = 1;</code>
   *
   * <pre>
   * Used when giving an inclusive lower bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getStartKeyClosed();

  /**
   * <code>optional bytes start_key_open = 2;</code>
   *
   * <pre>
   * Used when giving an exclusive lower bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getStartKeyOpen();

  /**
   * <code>optional bytes end_key_open = 3;</code>
   *
   * <pre>
   * Used when giving an exclusive upper bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getEndKeyOpen();

  /**
   * <code>optional bytes end_key_closed = 4;</code>
   *
   * <pre>
   * Used when giving an inclusive upper bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getEndKeyClosed();

  public com.google.bigtable.v2.RowRange.StartKeyCase getStartKeyCase();

  public com.google.bigtable.v2.RowRange.EndKeyCase getEndKeyCase();
}
