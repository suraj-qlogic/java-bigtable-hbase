// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/data.proto

package com.google.bigtable.v2;

public interface ValueRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.ValueRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bytes start_value_closed = 1;</code>
   *
   * <pre>
   * Used when giving an inclusive lower bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getStartValueClosed();

  /**
   * <code>optional bytes start_value_open = 2;</code>
   *
   * <pre>
   * Used when giving an exclusive lower bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getStartValueOpen();

  /**
   * <code>optional bytes end_value_closed = 3;</code>
   *
   * <pre>
   * Used when giving an inclusive upper bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getEndValueClosed();

  /**
   * <code>optional bytes end_value_open = 4;</code>
   *
   * <pre>
   * Used when giving an exclusive upper bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getEndValueOpen();

  public com.google.bigtable.v2.ValueRange.StartValueCase getStartValueCase();

  public com.google.bigtable.v2.ValueRange.EndValueCase getEndValueCase();
}
