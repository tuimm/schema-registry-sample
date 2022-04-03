package com.tui.schemaregistry.sample.stream;

import com.tui.schemaregistry.sample.FooEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component("fooEventConsumer")
@Log4j2
public class FooEventConsumer implements Consumer<FooEvent> {
  /**
   * Performs this operation on the given argument.
   *
   * @param fooEvent the input argument
   */
  @Override public void accept(FooEvent fooEvent) {

    log.info("New event notification: " + fooEvent.getMessage());
  }
}
