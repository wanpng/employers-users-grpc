// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/employers_users_service.grpc.proto

package com.wanpng.employers-users.grpc.service;

public final class EmployersUsersServiceProtos {
  private EmployersUsersServiceProtos() {}
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
      "\n1protos/service/employers_users_service" +
      ".grpc.proto\022\016protos.service\032\'protos/doma" +
      "in/companyprofile.grpc.proto\"Z\n\033UpdateCo" +
      "mpanyProfileRequest\022;\n\020employer_profile\030" +
      "\001 \001(\0132!.protos.domain.CompanyProfileGrpc" +
      "\"3\n\034UpdateCompanyProfileResponse\022\023\n\013empl" +
      "oyer_id\030\001 \001(\t2\212\001\n\025EmployersUsersService\022" +
      "q\n\024UpdateCompanyProfile\022+.protos.service" +
      ".UpdateCompanyProfileRequest\032,.protos.se" +
      "rvice.UpdateCompanyProfileResponseB}\n\'co" +
      "m.wanpng.employers-users.grpc.serviceB\033E" +
      "mployersUsersServiceProtosP\001Z3github.com" +
      "/wanpng/employers-users-grpc/grpc/servic" +
      "eb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.wanpng.employers-users.grpc.domain.CompanyProfileGrpcProtos.getDescriptor(),
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
    com.wanpng.employers-users.grpc.domain.CompanyProfileGrpcProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
