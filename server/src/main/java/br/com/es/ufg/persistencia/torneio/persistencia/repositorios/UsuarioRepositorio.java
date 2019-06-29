package br.com.es.ufg.persistencia.torneio.persistencia.repositorios;

import br.com.es.ufg.persistencia.torneio.persistencia.entidades.Equipe;
import br.com.es.ufg.persistencia.torneio.persistencia.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Long> {
}
