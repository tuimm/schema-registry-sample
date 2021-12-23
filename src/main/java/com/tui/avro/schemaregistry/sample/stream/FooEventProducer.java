//package com.example.awsgluekafkaexample.stream;
//
//import com.example.awsgluekafkaexample.event.FooEvent;
//import org.springframework.cloud.function.context.PollableBean;
//import org.springframework.stereotype.Component;
//
//import java.util.Random;
//import java.util.UUID;
//import java.util.function.Supplier;
//
//@Component("fooEventProducer")
//
//public class FooEventProducer implements Supplier<FooEvent> {
//
//  /**
//   * Gets a result.
//   *
//   * @return a result
//   */
//  @Override
//  @PollableBean
//  public FooEvent get() {
//    Random random = new Random();
//    return FooEvent.builder()
//      .fooId(String.valueOf(UUID.randomUUID()))
//      .sequenceNumber(random.nextInt(10000 - 1) + 1)
//      .build();
//  }
//}
