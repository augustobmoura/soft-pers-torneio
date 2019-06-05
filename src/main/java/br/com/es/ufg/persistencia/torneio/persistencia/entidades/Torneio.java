package br.com.es.ufg.persistencia.torneio.persistencia.entidades;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Torneio {

  @Id
  @GeneratedValue
  private Long id;

}
