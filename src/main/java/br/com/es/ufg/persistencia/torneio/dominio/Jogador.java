package br.com.es.ufg.persistencia.torneio.dominio;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Jogador {

  @Id
  @GeneratedValue
  private long id;

  @NotNull
  private String nome;

  @Min(0L)
  private int idade;

}
