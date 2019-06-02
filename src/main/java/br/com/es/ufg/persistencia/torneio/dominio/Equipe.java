package br.com.es.ufg.persistencia.torneio.dominio;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Equipe {

  @Id
  @GeneratedValue
  private long id;

  @NotNull
  private String nome;

  @OneToMany
  private Set<Jogador> jogadores = new HashSet<>();

}
