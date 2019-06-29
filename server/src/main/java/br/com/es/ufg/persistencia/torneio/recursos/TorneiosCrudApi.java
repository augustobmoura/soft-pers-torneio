package br.com.es.ufg.persistencia.torneio.recursos;

import br.com.es.ufg.persistencia.torneio.persistencia.entidades.Equipe;
import br.com.es.ufg.persistencia.torneio.persistencia.entidades.Torneio;
import org.springframework.data.repository.CrudRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Path;

@Named
@Path("/torneios")
public class TorneiosCrudApi extends EntidadeCrudApi<Torneio> {

  @Inject
  public TorneiosCrudApi(final CrudRepository<Torneio, Long> repositorio) {
    super(repositorio);
  }

  @Override
  protected String getDescricaoEntidade() {
    return "torneios";
  }

}
