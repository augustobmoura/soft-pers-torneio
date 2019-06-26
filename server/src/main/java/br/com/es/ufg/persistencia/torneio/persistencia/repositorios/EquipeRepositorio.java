package br.com.es.ufg.persistencia.torneio.persistencia.repositorios;

import br.com.es.ufg.persistencia.torneio.persistencia.entidades.Equipe;
import org.springframework.data.repository.CrudRepository;

public interface EquipeRepositorio extends CrudRepository<Equipe, Long> {
}
