// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/companyprofile.grpc.proto

package com.wanpng.employers-users.grpc.domain;

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
      "\n\'protos/domain/companyprofile.grpc.prot" +
      "o\022\rprotos.domain\"Z\n\022CompanyProfileGrpc\022\n" +
      "\n\002id\030\001 \001(\t\022\017\n\007user_id\030\002 \001(\t\022\024\n\014company_n" +
      "ame\030\003 \001(\t\022\021\n\tphoto_url\030\004 \001(\tBx\n&com.wanp" +
      "ng.employers-users.grpc.domainB\030CompanyP" +
      "rofileGrpcProtosP\001Z2github.com/wanpng/em" +
      "ployers-users-grpc/grpc/domainb\006proto3"
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
        new java.lang.String[] { "Id", "UserId", "CompanyName", "PhotoUrl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
