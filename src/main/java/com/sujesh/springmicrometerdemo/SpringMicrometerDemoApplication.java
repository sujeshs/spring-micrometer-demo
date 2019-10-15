package com.sujesh.springmicrometerdemo;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.Random;

import static com.google.common.util.concurrent.Uninterruptibles.sleepUninterruptibly;
import static java.lang.System.currentTimeMillis;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

@SpringBootApplication
@RestController
public class SpringMicrometerDemoApplication {

  @Autowired Random random;
  @Autowired private MeterRegistry meterRegistry;

  @GetMapping("/greet")
  public String greetUser() {
    long startTime = currentTimeMillis();
    someComputation();
    meterRegistry.timer("ttk").record(Duration.ofMillis(currentTimeMillis() - startTime));
    return "This is a demo application for micrometer";
  }

  public static void main(String[] args) {
    ConfigurableApplicationContext applicationContext =
        SpringApplication.run(SpringMicrometerDemoApplication.class, args);
  }

  private void someComputation() {
    sleepUninterruptibly(random.nextInt(2000) + 1, MILLISECONDS);
  }
}
