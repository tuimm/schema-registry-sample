package com.tui.avro.schemaregistry.sample.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Schema(name = "FooCommand")
public class FooCommand {
  @Schema(
    required = true
  )
  @NotNull(message = "'message' is a required field")
  @JsonProperty("message")
  private String message;

}
