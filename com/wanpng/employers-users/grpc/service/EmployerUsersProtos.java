// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/employer_service.grpc.proto

package com.wanpng.employers-users.grpc.service;

public final class EmployerUsersProtos {
  private EmployerUsersProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_service_UpdateCompanyProfileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_service_UpdateCompanyProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_service_UpdateCompanyProfileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_service_UpdateCompanyProfileResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*protos/service/employer_service.grpc.p" +
      "roto\022\016protos.service\032(protos/domain/comp" +
      "any_profile.grpc.proto\"Z\n\033UpdateCompanyP" +
      "rofileRequest\022;\n\020employer_profile\030\001 \001(\0132" +
      "!.protos.domain.CompanyProfileGrpc\"3\n\034Up" +
      "dateCompanyProfileResponse\022\023\n\013employer_i" +
      "d\030\001 \001(\t2\204\001\n\017EmployerService\022q\n\024UpdateCom" +
      "panyProfile\022+.protos.service.UpdateCompa" +
      "nyProfileRequest\032,.protos.service.Update" +
      "CompanyProfileResponseBu\n\'com.wanpng.emp" +
      "loyers-users.grpc.serviceB\023EmployerUsers" +
      "ProtosP\001Z3github.com/wanpng/employers-us" +
      "ers-grpc/grpc/serviceb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.wanpng.employers-users.grpc.service.CompanyProfileGrpcProtos.getDescriptor(),
        });
    internal_static_protos_service_UpdateCompanyProfileRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_service_UpdateCompanyProfileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_service_UpdateCompanyProfileRequest_descriptor,
        new java.lang.String[] { "EmployerProfile", });
    internal_static_protos_service_UpdateCompanyProfileResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_protos_service_UpdateCompanyProfileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_service_UpdateCompanyProfileResponse_descriptor,
        new java.lang.String[] { "EmployerId", });
    com.wanpng.employers-users.grpc.service.CompanyProfileGrpcProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}