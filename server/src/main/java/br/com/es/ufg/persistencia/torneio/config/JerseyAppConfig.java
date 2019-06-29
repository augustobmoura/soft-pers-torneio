package br.com.es.ufg.persistencia.torneio.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class JerseyAppConfig extends ResourceConfig {
  public JerseyAppConfig() {
    packages("br.com.es.ufg.persistencia.torneio.recursos");
    packages("io.swagger.v3.jaxrs2.integration.resources");
  }

  @Bean
  ObjectMapper mapper() {
    return new ObjectMapper();
  }
}
