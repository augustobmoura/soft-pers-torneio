package br.com.es.ufg.persistencia.torneio.persistencia.entidades;

public interface Entidade<I> {

  void setId(I id);

  I getId();

}
