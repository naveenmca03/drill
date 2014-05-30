/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from protobuf

package org.apache.drill.exec.proto;


public final class SchemaUserProtos
{

    public static final class Property
    {
        public static final org.apache.drill.exec.proto.SchemaUserProtos.Property.MessageSchema WRITE =
            new org.apache.drill.exec.proto.SchemaUserProtos.Property.MessageSchema();
        public static final org.apache.drill.exec.proto.SchemaUserProtos.Property.BuilderSchema MERGE =
            new org.apache.drill.exec.proto.SchemaUserProtos.Property.BuilderSchema();
        
        public static class MessageSchema implements com.dyuproject.protostuff.Schema<org.apache.drill.exec.proto.UserProtos.Property>
        {
            public void writeTo(com.dyuproject.protostuff.Output output, org.apache.drill.exec.proto.UserProtos.Property message) throws java.io.IOException
            {
                if(message.hasKey())
                    output.writeString(1, message.getKey(), false);
                if(message.hasValue())
                    output.writeString(2, message.getValue(), false);
            }
            public boolean isInitialized(org.apache.drill.exec.proto.UserProtos.Property message)
            {
                return message.isInitialized();
            }
            public java.lang.String getFieldName(int number)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.Property.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.Property.getFieldNumber(name);
            }
            public java.lang.Class<org.apache.drill.exec.proto.UserProtos.Property> typeClass()
            {
                return org.apache.drill.exec.proto.UserProtos.Property.class;
            }
            public java.lang.String messageName()
            {
                return org.apache.drill.exec.proto.UserProtos.Property.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return org.apache.drill.exec.proto.UserProtos.Property.class.getName();
            }
            //unused
            public void mergeFrom(com.dyuproject.protostuff.Input input, org.apache.drill.exec.proto.UserProtos.Property message) throws java.io.IOException {}
            public org.apache.drill.exec.proto.UserProtos.Property newMessage() { return null; }
        }
        public static class BuilderSchema implements com.dyuproject.protostuff.Schema<org.apache.drill.exec.proto.UserProtos.Property.Builder>
        {
            public void mergeFrom(com.dyuproject.protostuff.Input input, org.apache.drill.exec.proto.UserProtos.Property.Builder builder) throws java.io.IOException
            {
                for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
                {
                    switch(number)
                    {
                        case 0:
                            return;
                        case 1:
                            builder.setKey(input.readString());
                            break;
                        case 2:
                            builder.setValue(input.readString());
                            break;
                        default:
                            input.handleUnknownField(number, this);
                    }
                }
            }
            public boolean isInitialized(org.apache.drill.exec.proto.UserProtos.Property.Builder builder)
            {
                return builder.isInitialized();
            }
            public org.apache.drill.exec.proto.UserProtos.Property.Builder newMessage()
            {
                return org.apache.drill.exec.proto.UserProtos.Property.newBuilder();
            }
            public java.lang.String getFieldName(int number)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.Property.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.Property.getFieldNumber(name);
            }
            public java.lang.Class<org.apache.drill.exec.proto.UserProtos.Property.Builder> typeClass()
            {
                return org.apache.drill.exec.proto.UserProtos.Property.Builder.class;
            }
            public java.lang.String messageName()
            {
                return org.apache.drill.exec.proto.UserProtos.Property.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return org.apache.drill.exec.proto.UserProtos.Property.class.getName();
            }
            //unused
            public void writeTo(com.dyuproject.protostuff.Output output, org.apache.drill.exec.proto.UserProtos.Property.Builder builder) throws java.io.IOException {}
        }
        public static java.lang.String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "key";
                case 2: return "value";
                default: return null;
            }
        }
        public static int getFieldNumber(java.lang.String name)
        {
            java.lang.Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }
        private static final java.util.HashMap<java.lang.String,java.lang.Integer> fieldMap = new java.util.HashMap<java.lang.String,java.lang.Integer>();
        static
        {
            fieldMap.put("key", 1);
            fieldMap.put("value", 2);
        }
    }

    public static final class UserProperties
    {
        public static final org.apache.drill.exec.proto.SchemaUserProtos.UserProperties.MessageSchema WRITE =
            new org.apache.drill.exec.proto.SchemaUserProtos.UserProperties.MessageSchema();
        public static final org.apache.drill.exec.proto.SchemaUserProtos.UserProperties.BuilderSchema MERGE =
            new org.apache.drill.exec.proto.SchemaUserProtos.UserProperties.BuilderSchema();
        
        public static class MessageSchema implements com.dyuproject.protostuff.Schema<org.apache.drill.exec.proto.UserProtos.UserProperties>
        {
            public void writeTo(com.dyuproject.protostuff.Output output, org.apache.drill.exec.proto.UserProtos.UserProperties message) throws java.io.IOException
            {
                for(org.apache.drill.exec.proto.UserProtos.Property properties : message.getPropertiesList())
                    output.writeObject(1, properties, org.apache.drill.exec.proto.SchemaUserProtos.Property.WRITE, true);

            }
            public boolean isInitialized(org.apache.drill.exec.proto.UserProtos.UserProperties message)
            {
                return message.isInitialized();
            }
            public java.lang.String getFieldName(int number)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.UserProperties.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.UserProperties.getFieldNumber(name);
            }
            public java.lang.Class<org.apache.drill.exec.proto.UserProtos.UserProperties> typeClass()
            {
                return org.apache.drill.exec.proto.UserProtos.UserProperties.class;
            }
            public java.lang.String messageName()
            {
                return org.apache.drill.exec.proto.UserProtos.UserProperties.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return org.apache.drill.exec.proto.UserProtos.UserProperties.class.getName();
            }
            //unused
            public void mergeFrom(com.dyuproject.protostuff.Input input, org.apache.drill.exec.proto.UserProtos.UserProperties message) throws java.io.IOException {}
            public org.apache.drill.exec.proto.UserProtos.UserProperties newMessage() { return null; }
        }
        public static class BuilderSchema implements com.dyuproject.protostuff.Schema<org.apache.drill.exec.proto.UserProtos.UserProperties.Builder>
        {
            public void mergeFrom(com.dyuproject.protostuff.Input input, org.apache.drill.exec.proto.UserProtos.UserProperties.Builder builder) throws java.io.IOException
            {
                for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
                {
                    switch(number)
                    {
                        case 0:
                            return;
                        case 1:
                            builder.addProperties(input.mergeObject(org.apache.drill.exec.proto.UserProtos.Property.newBuilder(), org.apache.drill.exec.proto.SchemaUserProtos.Property.MERGE));

                            break;
                        default:
                            input.handleUnknownField(number, this);
                    }
                }
            }
            public boolean isInitialized(org.apache.drill.exec.proto.UserProtos.UserProperties.Builder builder)
            {
                return builder.isInitialized();
            }
            public org.apache.drill.exec.proto.UserProtos.UserProperties.Builder newMessage()
            {
                return org.apache.drill.exec.proto.UserProtos.UserProperties.newBuilder();
            }
            public java.lang.String getFieldName(int number)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.UserProperties.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.UserProperties.getFieldNumber(name);
            }
            public java.lang.Class<org.apache.drill.exec.proto.UserProtos.UserProperties.Builder> typeClass()
            {
                return org.apache.drill.exec.proto.UserProtos.UserProperties.Builder.class;
            }
            public java.lang.String messageName()
            {
                return org.apache.drill.exec.proto.UserProtos.UserProperties.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return org.apache.drill.exec.proto.UserProtos.UserProperties.class.getName();
            }
            //unused
            public void writeTo(com.dyuproject.protostuff.Output output, org.apache.drill.exec.proto.UserProtos.UserProperties.Builder builder) throws java.io.IOException {}
        }
        public static java.lang.String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "properties";
                default: return null;
            }
        }
        public static int getFieldNumber(java.lang.String name)
        {
            java.lang.Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }
        private static final java.util.HashMap<java.lang.String,java.lang.Integer> fieldMap = new java.util.HashMap<java.lang.String,java.lang.Integer>();
        static
        {
            fieldMap.put("properties", 1);
        }
    }

    public static final class UserToBitHandshake
    {
        public static final org.apache.drill.exec.proto.SchemaUserProtos.UserToBitHandshake.MessageSchema WRITE =
            new org.apache.drill.exec.proto.SchemaUserProtos.UserToBitHandshake.MessageSchema();
        public static final org.apache.drill.exec.proto.SchemaUserProtos.UserToBitHandshake.BuilderSchema MERGE =
            new org.apache.drill.exec.proto.SchemaUserProtos.UserToBitHandshake.BuilderSchema();
        
        public static class MessageSchema implements com.dyuproject.protostuff.Schema<org.apache.drill.exec.proto.UserProtos.UserToBitHandshake>
        {
            public void writeTo(com.dyuproject.protostuff.Output output, org.apache.drill.exec.proto.UserProtos.UserToBitHandshake message) throws java.io.IOException
            {
                if(message.hasChannel())
                    output.writeEnum(1, message.getChannel().getNumber(), false);
                if(message.hasSupportListening())
                    output.writeBool(2, message.getSupportListening(), false);
                if(message.hasRpcVersion())
                    output.writeInt32(3, message.getRpcVersion(), false);
                if(message.hasCredentials())
                    output.writeObject(4, message.getCredentials(), org.apache.drill.exec.proto.SchemaUserBitShared.UserCredentials.WRITE, false);

                if(message.hasProperties())
                    output.writeObject(5, message.getProperties(), org.apache.drill.exec.proto.SchemaUserProtos.UserProperties.WRITE, false);

            }
            public boolean isInitialized(org.apache.drill.exec.proto.UserProtos.UserToBitHandshake message)
            {
                return message.isInitialized();
            }
            public java.lang.String getFieldName(int number)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.UserToBitHandshake.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.UserToBitHandshake.getFieldNumber(name);
            }
            public java.lang.Class<org.apache.drill.exec.proto.UserProtos.UserToBitHandshake> typeClass()
            {
                return org.apache.drill.exec.proto.UserProtos.UserToBitHandshake.class;
            }
            public java.lang.String messageName()
            {
                return org.apache.drill.exec.proto.UserProtos.UserToBitHandshake.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return org.apache.drill.exec.proto.UserProtos.UserToBitHandshake.class.getName();
            }
            //unused
            public void mergeFrom(com.dyuproject.protostuff.Input input, org.apache.drill.exec.proto.UserProtos.UserToBitHandshake message) throws java.io.IOException {}
            public org.apache.drill.exec.proto.UserProtos.UserToBitHandshake newMessage() { return null; }
        }
        public static class BuilderSchema implements com.dyuproject.protostuff.Schema<org.apache.drill.exec.proto.UserProtos.UserToBitHandshake.Builder>
        {
            public void mergeFrom(com.dyuproject.protostuff.Input input, org.apache.drill.exec.proto.UserProtos.UserToBitHandshake.Builder builder) throws java.io.IOException
            {
                for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
                {
                    switch(number)
                    {
                        case 0:
                            return;
                        case 1:
                            builder.setChannel(org.apache.drill.exec.proto.UserBitShared.RpcChannel.valueOf(input.readEnum()));
                            break;
                        case 2:
                            builder.setSupportListening(input.readBool());
                            break;
                        case 3:
                            builder.setRpcVersion(input.readInt32());
                            break;
                        case 4:
                            builder.setCredentials(input.mergeObject(org.apache.drill.exec.proto.UserBitShared.UserCredentials.newBuilder(), org.apache.drill.exec.proto.SchemaUserBitShared.UserCredentials.MERGE));

                            break;
                        case 5:
                            builder.setProperties(input.mergeObject(org.apache.drill.exec.proto.UserProtos.UserProperties.newBuilder(), org.apache.drill.exec.proto.SchemaUserProtos.UserProperties.MERGE));

                            break;
                        default:
                            input.handleUnknownField(number, this);
                    }
                }
            }
            public boolean isInitialized(org.apache.drill.exec.proto.UserProtos.UserToBitHandshake.Builder builder)
            {
                return builder.isInitialized();
            }
            public org.apache.drill.exec.proto.UserProtos.UserToBitHandshake.Builder newMessage()
            {
                return org.apache.drill.exec.proto.UserProtos.UserToBitHandshake.newBuilder();
            }
            public java.lang.String getFieldName(int number)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.UserToBitHandshake.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.UserToBitHandshake.getFieldNumber(name);
            }
            public java.lang.Class<org.apache.drill.exec.proto.UserProtos.UserToBitHandshake.Builder> typeClass()
            {
                return org.apache.drill.exec.proto.UserProtos.UserToBitHandshake.Builder.class;
            }
            public java.lang.String messageName()
            {
                return org.apache.drill.exec.proto.UserProtos.UserToBitHandshake.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return org.apache.drill.exec.proto.UserProtos.UserToBitHandshake.class.getName();
            }
            //unused
            public void writeTo(com.dyuproject.protostuff.Output output, org.apache.drill.exec.proto.UserProtos.UserToBitHandshake.Builder builder) throws java.io.IOException {}
        }
        public static java.lang.String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "channel";
                case 2: return "supportListening";
                case 3: return "rpcVersion";
                case 4: return "credentials";
                case 5: return "properties";
                default: return null;
            }
        }
        public static int getFieldNumber(java.lang.String name)
        {
            java.lang.Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }
        private static final java.util.HashMap<java.lang.String,java.lang.Integer> fieldMap = new java.util.HashMap<java.lang.String,java.lang.Integer>();
        static
        {
            fieldMap.put("channel", 1);
            fieldMap.put("supportListening", 2);
            fieldMap.put("rpcVersion", 3);
            fieldMap.put("credentials", 4);
            fieldMap.put("properties", 5);
        }
    }

    public static final class RequestResults
    {
        public static final org.apache.drill.exec.proto.SchemaUserProtos.RequestResults.MessageSchema WRITE =
            new org.apache.drill.exec.proto.SchemaUserProtos.RequestResults.MessageSchema();
        public static final org.apache.drill.exec.proto.SchemaUserProtos.RequestResults.BuilderSchema MERGE =
            new org.apache.drill.exec.proto.SchemaUserProtos.RequestResults.BuilderSchema();
        
        public static class MessageSchema implements com.dyuproject.protostuff.Schema<org.apache.drill.exec.proto.UserProtos.RequestResults>
        {
            public void writeTo(com.dyuproject.protostuff.Output output, org.apache.drill.exec.proto.UserProtos.RequestResults message) throws java.io.IOException
            {
                if(message.hasQueryId())
                    output.writeObject(1, message.getQueryId(), org.apache.drill.exec.proto.SchemaUserBitShared.QueryId.WRITE, false);

                if(message.hasMaximumResponses())
                    output.writeInt32(2, message.getMaximumResponses(), false);
            }
            public boolean isInitialized(org.apache.drill.exec.proto.UserProtos.RequestResults message)
            {
                return message.isInitialized();
            }
            public java.lang.String getFieldName(int number)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.RequestResults.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.RequestResults.getFieldNumber(name);
            }
            public java.lang.Class<org.apache.drill.exec.proto.UserProtos.RequestResults> typeClass()
            {
                return org.apache.drill.exec.proto.UserProtos.RequestResults.class;
            }
            public java.lang.String messageName()
            {
                return org.apache.drill.exec.proto.UserProtos.RequestResults.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return org.apache.drill.exec.proto.UserProtos.RequestResults.class.getName();
            }
            //unused
            public void mergeFrom(com.dyuproject.protostuff.Input input, org.apache.drill.exec.proto.UserProtos.RequestResults message) throws java.io.IOException {}
            public org.apache.drill.exec.proto.UserProtos.RequestResults newMessage() { return null; }
        }
        public static class BuilderSchema implements com.dyuproject.protostuff.Schema<org.apache.drill.exec.proto.UserProtos.RequestResults.Builder>
        {
            public void mergeFrom(com.dyuproject.protostuff.Input input, org.apache.drill.exec.proto.UserProtos.RequestResults.Builder builder) throws java.io.IOException
            {
                for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
                {
                    switch(number)
                    {
                        case 0:
                            return;
                        case 1:
                            builder.setQueryId(input.mergeObject(org.apache.drill.exec.proto.UserBitShared.QueryId.newBuilder(), org.apache.drill.exec.proto.SchemaUserBitShared.QueryId.MERGE));

                            break;
                        case 2:
                            builder.setMaximumResponses(input.readInt32());
                            break;
                        default:
                            input.handleUnknownField(number, this);
                    }
                }
            }
            public boolean isInitialized(org.apache.drill.exec.proto.UserProtos.RequestResults.Builder builder)
            {
                return builder.isInitialized();
            }
            public org.apache.drill.exec.proto.UserProtos.RequestResults.Builder newMessage()
            {
                return org.apache.drill.exec.proto.UserProtos.RequestResults.newBuilder();
            }
            public java.lang.String getFieldName(int number)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.RequestResults.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.RequestResults.getFieldNumber(name);
            }
            public java.lang.Class<org.apache.drill.exec.proto.UserProtos.RequestResults.Builder> typeClass()
            {
                return org.apache.drill.exec.proto.UserProtos.RequestResults.Builder.class;
            }
            public java.lang.String messageName()
            {
                return org.apache.drill.exec.proto.UserProtos.RequestResults.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return org.apache.drill.exec.proto.UserProtos.RequestResults.class.getName();
            }
            //unused
            public void writeTo(com.dyuproject.protostuff.Output output, org.apache.drill.exec.proto.UserProtos.RequestResults.Builder builder) throws java.io.IOException {}
        }
        public static java.lang.String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "queryId";
                case 2: return "maximumResponses";
                default: return null;
            }
        }
        public static int getFieldNumber(java.lang.String name)
        {
            java.lang.Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }
        private static final java.util.HashMap<java.lang.String,java.lang.Integer> fieldMap = new java.util.HashMap<java.lang.String,java.lang.Integer>();
        static
        {
            fieldMap.put("queryId", 1);
            fieldMap.put("maximumResponses", 2);
        }
    }

    public static final class RunQuery
    {
        public static final org.apache.drill.exec.proto.SchemaUserProtos.RunQuery.MessageSchema WRITE =
            new org.apache.drill.exec.proto.SchemaUserProtos.RunQuery.MessageSchema();
        public static final org.apache.drill.exec.proto.SchemaUserProtos.RunQuery.BuilderSchema MERGE =
            new org.apache.drill.exec.proto.SchemaUserProtos.RunQuery.BuilderSchema();
        
        public static class MessageSchema implements com.dyuproject.protostuff.Schema<org.apache.drill.exec.proto.UserProtos.RunQuery>
        {
            public void writeTo(com.dyuproject.protostuff.Output output, org.apache.drill.exec.proto.UserProtos.RunQuery message) throws java.io.IOException
            {
                if(message.hasResultsMode())
                    output.writeEnum(1, message.getResultsMode().getNumber(), false);
                if(message.hasType())
                    output.writeEnum(2, message.getType().getNumber(), false);
                if(message.hasPlan())
                    output.writeString(3, message.getPlan(), false);
            }
            public boolean isInitialized(org.apache.drill.exec.proto.UserProtos.RunQuery message)
            {
                return message.isInitialized();
            }
            public java.lang.String getFieldName(int number)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.RunQuery.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.RunQuery.getFieldNumber(name);
            }
            public java.lang.Class<org.apache.drill.exec.proto.UserProtos.RunQuery> typeClass()
            {
                return org.apache.drill.exec.proto.UserProtos.RunQuery.class;
            }
            public java.lang.String messageName()
            {
                return org.apache.drill.exec.proto.UserProtos.RunQuery.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return org.apache.drill.exec.proto.UserProtos.RunQuery.class.getName();
            }
            //unused
            public void mergeFrom(com.dyuproject.protostuff.Input input, org.apache.drill.exec.proto.UserProtos.RunQuery message) throws java.io.IOException {}
            public org.apache.drill.exec.proto.UserProtos.RunQuery newMessage() { return null; }
        }
        public static class BuilderSchema implements com.dyuproject.protostuff.Schema<org.apache.drill.exec.proto.UserProtos.RunQuery.Builder>
        {
            public void mergeFrom(com.dyuproject.protostuff.Input input, org.apache.drill.exec.proto.UserProtos.RunQuery.Builder builder) throws java.io.IOException
            {
                for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
                {
                    switch(number)
                    {
                        case 0:
                            return;
                        case 1:
                            builder.setResultsMode(org.apache.drill.exec.proto.UserProtos.QueryResultsMode.valueOf(input.readEnum()));
                            break;
                        case 2:
                            builder.setType(org.apache.drill.exec.proto.UserBitShared.QueryType.valueOf(input.readEnum()));
                            break;
                        case 3:
                            builder.setPlan(input.readString());
                            break;
                        default:
                            input.handleUnknownField(number, this);
                    }
                }
            }
            public boolean isInitialized(org.apache.drill.exec.proto.UserProtos.RunQuery.Builder builder)
            {
                return builder.isInitialized();
            }
            public org.apache.drill.exec.proto.UserProtos.RunQuery.Builder newMessage()
            {
                return org.apache.drill.exec.proto.UserProtos.RunQuery.newBuilder();
            }
            public java.lang.String getFieldName(int number)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.RunQuery.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.RunQuery.getFieldNumber(name);
            }
            public java.lang.Class<org.apache.drill.exec.proto.UserProtos.RunQuery.Builder> typeClass()
            {
                return org.apache.drill.exec.proto.UserProtos.RunQuery.Builder.class;
            }
            public java.lang.String messageName()
            {
                return org.apache.drill.exec.proto.UserProtos.RunQuery.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return org.apache.drill.exec.proto.UserProtos.RunQuery.class.getName();
            }
            //unused
            public void writeTo(com.dyuproject.protostuff.Output output, org.apache.drill.exec.proto.UserProtos.RunQuery.Builder builder) throws java.io.IOException {}
        }
        public static java.lang.String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "resultsMode";
                case 2: return "type";
                case 3: return "plan";
                default: return null;
            }
        }
        public static int getFieldNumber(java.lang.String name)
        {
            java.lang.Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }
        private static final java.util.HashMap<java.lang.String,java.lang.Integer> fieldMap = new java.util.HashMap<java.lang.String,java.lang.Integer>();
        static
        {
            fieldMap.put("resultsMode", 1);
            fieldMap.put("type", 2);
            fieldMap.put("plan", 3);
        }
    }

    public static final class BitToUserHandshake
    {
        public static final org.apache.drill.exec.proto.SchemaUserProtos.BitToUserHandshake.MessageSchema WRITE =
            new org.apache.drill.exec.proto.SchemaUserProtos.BitToUserHandshake.MessageSchema();
        public static final org.apache.drill.exec.proto.SchemaUserProtos.BitToUserHandshake.BuilderSchema MERGE =
            new org.apache.drill.exec.proto.SchemaUserProtos.BitToUserHandshake.BuilderSchema();
        
        public static class MessageSchema implements com.dyuproject.protostuff.Schema<org.apache.drill.exec.proto.UserProtos.BitToUserHandshake>
        {
            public void writeTo(com.dyuproject.protostuff.Output output, org.apache.drill.exec.proto.UserProtos.BitToUserHandshake message) throws java.io.IOException
            {
                if(message.hasRpcVersion())
                    output.writeInt32(2, message.getRpcVersion(), false);
            }
            public boolean isInitialized(org.apache.drill.exec.proto.UserProtos.BitToUserHandshake message)
            {
                return message.isInitialized();
            }
            public java.lang.String getFieldName(int number)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.BitToUserHandshake.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.BitToUserHandshake.getFieldNumber(name);
            }
            public java.lang.Class<org.apache.drill.exec.proto.UserProtos.BitToUserHandshake> typeClass()
            {
                return org.apache.drill.exec.proto.UserProtos.BitToUserHandshake.class;
            }
            public java.lang.String messageName()
            {
                return org.apache.drill.exec.proto.UserProtos.BitToUserHandshake.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return org.apache.drill.exec.proto.UserProtos.BitToUserHandshake.class.getName();
            }
            //unused
            public void mergeFrom(com.dyuproject.protostuff.Input input, org.apache.drill.exec.proto.UserProtos.BitToUserHandshake message) throws java.io.IOException {}
            public org.apache.drill.exec.proto.UserProtos.BitToUserHandshake newMessage() { return null; }
        }
        public static class BuilderSchema implements com.dyuproject.protostuff.Schema<org.apache.drill.exec.proto.UserProtos.BitToUserHandshake.Builder>
        {
            public void mergeFrom(com.dyuproject.protostuff.Input input, org.apache.drill.exec.proto.UserProtos.BitToUserHandshake.Builder builder) throws java.io.IOException
            {
                for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
                {
                    switch(number)
                    {
                        case 0:
                            return;
                        case 2:
                            builder.setRpcVersion(input.readInt32());
                            break;
                        default:
                            input.handleUnknownField(number, this);
                    }
                }
            }
            public boolean isInitialized(org.apache.drill.exec.proto.UserProtos.BitToUserHandshake.Builder builder)
            {
                return builder.isInitialized();
            }
            public org.apache.drill.exec.proto.UserProtos.BitToUserHandshake.Builder newMessage()
            {
                return org.apache.drill.exec.proto.UserProtos.BitToUserHandshake.newBuilder();
            }
            public java.lang.String getFieldName(int number)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.BitToUserHandshake.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return org.apache.drill.exec.proto.SchemaUserProtos.BitToUserHandshake.getFieldNumber(name);
            }
            public java.lang.Class<org.apache.drill.exec.proto.UserProtos.BitToUserHandshake.Builder> typeClass()
            {
                return org.apache.drill.exec.proto.UserProtos.BitToUserHandshake.Builder.class;
            }
            public java.lang.String messageName()
            {
                return org.apache.drill.exec.proto.UserProtos.BitToUserHandshake.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return org.apache.drill.exec.proto.UserProtos.BitToUserHandshake.class.getName();
            }
            //unused
            public void writeTo(com.dyuproject.protostuff.Output output, org.apache.drill.exec.proto.UserProtos.BitToUserHandshake.Builder builder) throws java.io.IOException {}
        }
        public static java.lang.String getFieldName(int number)
        {
            switch(number)
            {
                case 2: return "rpcVersion";
                default: return null;
            }
        }
        public static int getFieldNumber(java.lang.String name)
        {
            java.lang.Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }
        private static final java.util.HashMap<java.lang.String,java.lang.Integer> fieldMap = new java.util.HashMap<java.lang.String,java.lang.Integer>();
        static
        {
            fieldMap.put("rpcVersion", 2);
        }
    }

}
