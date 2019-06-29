package br.com.es.ufg.persistencia.torneio.recursos;

import br.com.es.ufg.persistencia.torneio.persistencia.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Path;

@Named
@Path("/usuarios")
public class UsuariosCrudApi extends EntidadeCrudApi<Usuario> {

  @Inject
  public UsuariosCrudApi(final CrudRepository<Usuario, Long> repositorio) {
    super(repositorio);
  }

  @Override
  protected String getDescricaoEntidade() {
    return "usuário";
  }

}
