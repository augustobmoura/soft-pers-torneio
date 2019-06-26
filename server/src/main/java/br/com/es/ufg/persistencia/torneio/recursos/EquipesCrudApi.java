package br.com.es.ufg.persistencia.torneio.recursos;

import br.com.es.ufg.persistencia.torneio.persistencia.entidades.Equipe;
import org.springframework.data.repository.CrudRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Path;

@Named
@Path("/equipes")
public class EquipesCrudApi extends EntidadeCrudApi<Equipe> {

  @Inject
  public EquipesCrudApi(final CrudRepository<Equipe, Long> repositorio) {
    super(repositorio);
  }

  @Override
  protected String getDescricaoEntidade() {
    return "equipe";
  }

}
