package com.example.javaboilerplate.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.javaboilerplate"})
@SpringBootApplication
public class JavaBoilerplateApplication extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
    return applicationBuilder.sources(JavaBoilerplateApplication.class);
  }

  public static void main(String[] args) {
    SpringApplication.run(JavaBoilerplateApplication.class, args);
  }

}
