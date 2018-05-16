package com.mlzhang.wl.service;

import org.springframework.boot.SpringApplication;

import java.awt.*;
import java.net.URI;

public class ServiceStarter {

  public static void main(String[] args) throws Exception {
    System.setProperty("java.awt.headless", "false");

    SpringApplication.run(ServiceInitializer.class);

    // port 9999 is configured in src/test/resources/application.properties(key: server.port)
    Desktop.getDesktop().browse(new URI("http://127.0.0.1:9999"));
  }
}
