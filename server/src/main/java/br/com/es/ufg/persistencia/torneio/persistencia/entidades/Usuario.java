package br.com.es.ufg.persistencia.torneio.persistencia.entidades;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@Entity
public class Usuario implements Entidade<Long> {

  @Id
  @GeneratedValue
  private Long id;

  @NotNull
  private String nome;

  @Min(0L)
  private int idade;

  @ManyToMany(mappedBy = "jogadores")
  private Set<Equipe> equipes;

}
