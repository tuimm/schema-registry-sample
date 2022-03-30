//package com.tui.schemaregistry.sample.stream;
//
//import com.tui.schemaregistry.sample.event.FooEvent;
//import org.springframework.stereotype.Component;
//
//import java.util.UUID;
//import java.util.function.Supplier;
//
//@Component("fooEventSupplier")
//
//public class FooEventSupplier implements Supplier<FooEvent> {
//
//  /**
//   * Gets a result.
//   *
//   * @return a result
//   */
//  @Override
//  public FooEvent get() {
//    return FooEvent.builder()
//      .message("HELLO WORLD")
//      .id(String.valueOf(UUID.randomUUID()))
//      .build();
//  }
//}
