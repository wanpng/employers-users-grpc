// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/company_profile.grpc.proto

package com.wanpng.employer.grpc.domain;

public final class CompanyProfileGrpcProtos {
  private CompanyProfileGrpcProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_domain_CompanyProfileGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_domain_CompanyProfileGrpc_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(protos/domain/company_profile.grpc.pro" +
      "to\022\rprotos.domain\"K\n\022CompanyProfileGrpc\022" +
      "\n\n\002id\030\001 \001(\t\022\023\n\013employer_id\030\002 \001(\t\022\024\n\014comp" +
      "any_name\030\003 \001(\tBq\n\037com.wanpng.employer.gr" +
      "pc.domainB\030CompanyProfileGrpcProtosP\001Z2g" +
      "ithub.com/wanpng/employers-users-grpc/gr" +
      "pc/domainb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protos_domain_CompanyProfileGrpc_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_domain_CompanyProfileGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_domain_CompanyProfileGrpc_descriptor,
        new java.lang.String[] { "Id", "EmployerId", "CompanyName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
