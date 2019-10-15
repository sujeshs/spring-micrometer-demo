package com.sujesh.springmicrometerdemo;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.composite.CompositeMeterRegistry;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import io.micrometer.influx.InfluxMeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class MeterRegistryConfig {

  @Bean
  public Random random() {
    return new Random();
  }

  @Bean
  public MeterRegistry meterRegistry(
      SimpleMeterRegistry simpleMeterRegistry, InfluxMeterRegistry influxMeterRegistry) {

    CompositeMeterRegistry meterRegistry = new CompositeMeterRegistry();
    meterRegistry.add(simpleMeterRegistry);
    meterRegistry.add(influxMeterRegistry);

    return meterRegistry;
  }

  @Bean
  public SimpleMeterRegistry simpleMeterRegistry() {
    return new SimpleMeterRegistry();
  }
}
