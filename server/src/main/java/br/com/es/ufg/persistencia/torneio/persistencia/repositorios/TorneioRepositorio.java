package br.com.es.ufg.persistencia.torneio.persistencia.repositorios;

import br.com.es.ufg.persistencia.torneio.persistencia.entidades.Equipe;
import br.com.es.ufg.persistencia.torneio.persistencia.entidades.Torneio;
import org.springframework.data.repository.CrudRepository;

public interface TorneioRepositorio extends CrudRepository<Torneio, Long> {
}
