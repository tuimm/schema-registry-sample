package com.tui.schemaregistry.sample.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.kjetland.jackson.jsonSchema.annotations.JsonSchemaInject;
import com.kjetland.jackson.jsonSchema.annotations.JsonSchemaString;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonSchemaInject(
  strings =
  {@JsonSchemaString(path="javaType", value="com.tui.schemaregistry.sample.event.FooEvent")})
public class FooEvent {
  @JsonProperty
  private String id;
  @JsonProperty
  private String message;
}
