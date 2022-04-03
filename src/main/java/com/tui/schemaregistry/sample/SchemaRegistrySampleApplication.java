package com.tui.schemaregistry.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.schema.registry.client.EnableSchemaRegistryClient;

@SpringBootApplication
@EnableSchemaRegistryClient
public class SchemaRegistrySampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SchemaRegistrySampleApplication.class, args);
  }

}
