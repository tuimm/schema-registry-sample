package com.tui.schemaregistry.sample.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FooEvent {
  @JsonProperty
  private String id;
  @JsonProperty
  private String message;
}
