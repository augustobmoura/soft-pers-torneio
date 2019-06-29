package br.com.es.ufg.persistencia.torneio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition()
@SpringBootApplication
public class TorneioApplication {

  public static void main(String[] args) {
    SpringApplication.run(TorneioApplication.class, args);
  }

}
