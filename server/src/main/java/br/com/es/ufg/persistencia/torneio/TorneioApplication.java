package br.com.es.ufg.persistencia.torneio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
  servers = @Server(url = "http://localhost:8080/api/")
)
@SpringBootApplication
public class TorneioApplication {

  public static void main(String[] args) {
    SpringApplication.run(TorneioApplication.class, args);
  }

}
