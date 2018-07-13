// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LoginResp.proto

package com.chat.commons.obj.proto;

public final class LoginRespProto {
  private LoginRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LoginRespOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.chat.commons.obj.proto.LoginResp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 resultCode = 1;</code>
     */
    int getResultCode();
  }
  /**
   * Protobuf type {@code com.chat.commons.obj.proto.LoginResp}
   */
  public  static final class LoginResp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.chat.commons.obj.proto.LoginResp)
      LoginRespOrBuilder {
    // Use LoginResp.newBuilder() to construct.
    private LoginResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LoginResp() {
      resultCode_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private LoginResp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              resultCode_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chat.commons.obj.proto.LoginRespProto.internal_static_com_chat_commons_obj_proto_LoginResp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chat.commons.obj.proto.LoginRespProto.internal_static_com_chat_commons_obj_proto_LoginResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chat.commons.obj.proto.LoginRespProto.LoginResp.class, com.chat.commons.obj.proto.LoginRespProto.LoginResp.Builder.class);
    }

    public static final int RESULTCODE_FIELD_NUMBER = 1;
    private int resultCode_;
    /**
     * <code>int32 resultCode = 1;</code>
     */
    public int getResultCode() {
      return resultCode_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (resultCode_ != 0) {
        output.writeInt32(1, resultCode_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (resultCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, resultCode_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.chat.commons.obj.proto.LoginRespProto.LoginResp)) {
        return super.equals(obj);
      }
      com.chat.commons.obj.proto.LoginRespProto.LoginResp other = (com.chat.commons.obj.proto.LoginRespProto.LoginResp) obj;

      boolean result = true;
      result = result && (getResultCode()
          == other.getResultCode());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESULTCODE_FIELD_NUMBER;
      hash = (53 * hash) + getResultCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.chat.commons.obj.proto.LoginRespProto.LoginResp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chat.commons.obj.proto.LoginRespProto.LoginResp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chat.commons.obj.proto.LoginRespProto.LoginResp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chat.commons.obj.proto.LoginRespProto.LoginResp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chat.commons.obj.proto.LoginRespProto.LoginResp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chat.commons.obj.proto.LoginRespProto.LoginResp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chat.commons.obj.proto.LoginRespProto.LoginResp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.chat.commons.obj.proto.LoginRespProto.LoginResp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.chat.commons.obj.proto.LoginRespProto.LoginResp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.chat.commons.obj.proto.LoginRespProto.LoginResp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.chat.commons.obj.proto.LoginRespProto.LoginResp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.chat.commons.obj.proto.LoginRespProto.LoginResp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.chat.commons.obj.proto.LoginRespProto.LoginResp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.chat.commons.obj.proto.LoginResp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.chat.commons.obj.proto.LoginResp)
        com.chat.commons.obj.proto.LoginRespProto.LoginRespOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chat.commons.obj.proto.LoginRespProto.internal_static_com_chat_commons_obj_proto_LoginResp_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chat.commons.obj.proto.LoginRespProto.internal_static_com_chat_commons_obj_proto_LoginResp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chat.commons.obj.proto.LoginRespProto.LoginResp.class, com.chat.commons.obj.proto.LoginRespProto.LoginResp.Builder.class);
      }

      // Construct using com.chat.commons.obj.proto.LoginRespProto.LoginResp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        resultCode_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chat.commons.obj.proto.LoginRespProto.internal_static_com_chat_commons_obj_proto_LoginResp_descriptor;
      }

      public com.chat.commons.obj.proto.LoginRespProto.LoginResp getDefaultInstanceForType() {
        return com.chat.commons.obj.proto.LoginRespProto.LoginResp.getDefaultInstance();
      }

      public com.chat.commons.obj.proto.LoginRespProto.LoginResp build() {
        com.chat.commons.obj.proto.LoginRespProto.LoginResp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chat.commons.obj.proto.LoginRespProto.LoginResp buildPartial() {
        com.chat.commons.obj.proto.LoginRespProto.LoginResp result = new com.chat.commons.obj.proto.LoginRespProto.LoginResp(this);
        result.resultCode_ = resultCode_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chat.commons.obj.proto.LoginRespProto.LoginResp) {
          return mergeFrom((com.chat.commons.obj.proto.LoginRespProto.LoginResp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chat.commons.obj.proto.LoginRespProto.LoginResp other) {
        if (other == com.chat.commons.obj.proto.LoginRespProto.LoginResp.getDefaultInstance()) return this;
        if (other.getResultCode() != 0) {
          setResultCode(other.getResultCode());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chat.commons.obj.proto.LoginRespProto.LoginResp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chat.commons.obj.proto.LoginRespProto.LoginResp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int resultCode_ ;
      /**
       * <code>int32 resultCode = 1;</code>
       */
      public int getResultCode() {
        return resultCode_;
      }
      /**
       * <code>int32 resultCode = 1;</code>
       */
      public Builder setResultCode(int value) {
        
        resultCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 resultCode = 1;</code>
       */
      public Builder clearResultCode() {
        
        resultCode_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:com.chat.commons.obj.proto.LoginResp)
    }

    // @@protoc_insertion_point(class_scope:com.chat.commons.obj.proto.LoginResp)
    private static final com.chat.commons.obj.proto.LoginRespProto.LoginResp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.chat.commons.obj.proto.LoginRespProto.LoginResp();
    }

    public static com.chat.commons.obj.proto.LoginRespProto.LoginResp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LoginResp>
        PARSER = new com.google.protobuf.AbstractParser<LoginResp>() {
      public LoginResp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new LoginResp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LoginResp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LoginResp> getParserForType() {
      return PARSER;
    }

    public com.chat.commons.obj.proto.LoginRespProto.LoginResp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_chat_commons_obj_proto_LoginResp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_chat_commons_obj_proto_LoginResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017LoginResp.proto\022\032com.chat.commons.obj." +
      "proto\"\037\n\tLoginResp\022\022\n\nresultCode\030\001 \001(\005B\020" +
      "B\016LoginRespProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_chat_commons_obj_proto_LoginResp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_chat_commons_obj_proto_LoginResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_chat_commons_obj_proto_LoginResp_descriptor,
        new java.lang.String[] { "ResultCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
