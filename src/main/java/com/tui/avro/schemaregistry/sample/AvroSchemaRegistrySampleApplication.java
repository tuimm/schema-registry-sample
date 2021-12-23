package com.tui.avro.schemaregistry.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.schema.registry.client.EnableSchemaRegistryClient;

@SpringBootApplication
@EnableSchemaRegistryClient
public class AvroSchemaRegistrySampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(AvroSchemaRegistrySampleApplication.class, args);
  }

}
