package br.com.es.ufg.persistencia.torneio.persistencia.entidades;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Torneio {

  @Id
  @GeneratedValue
  private Long id;

  @NotNull
  @NotBlank
  @Column(columnDefinition = "text")
  private String titulo;

  @Column(columnDefinition = "text")
  private String descricao;

}
