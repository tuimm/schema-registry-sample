package com.tui.avro.schemaregistry.sample.rest;

//import com.tui.avro.schemaregistry.sample.event.FooEvent;
import com.tui.avro.schemaregistry.sample.FooEvent;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping(value = "foo")
@Tag(
  name = "foo"
)
public class FooController {

  private final StreamBridge streamBridge;
  private static final Random random = new Random();

  public FooController(StreamBridge streamBridge) {
    this.streamBridge = streamBridge;

  }

  @Operation(
    tags = "foo"
  )
  @ApiResponses(
    value = {
      @ApiResponse(responseCode = "202", description = "Accepted")
    }
  )
  @PostMapping(
    path = "",
    consumes = MediaType.APPLICATION_JSON_VALUE
  )
  @ResponseStatus(HttpStatus.ACCEPTED)
  public void startStream(@Valid @RequestBody
    FooCommand fooCommand) {
    FooEvent fooEvent = new FooEvent();
    fooEvent.setId(String.valueOf(UUID.randomUUID()));
    fooEvent.setMessage(fooCommand.getMessage());
    streamBridge.send("fooEventSupplier-out-0", MessageBuilder.withPayload(fooEvent)
      .setHeader(KafkaHeaders.MESSAGE_KEY, fooEvent.getId())
      .setHeader("partitionKey", fooEvent.getId())
      .build());
  }
}

