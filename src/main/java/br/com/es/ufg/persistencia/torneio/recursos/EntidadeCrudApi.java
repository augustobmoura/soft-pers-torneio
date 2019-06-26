package br.com.es.ufg.persistencia.torneio.recursos;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.Optional;

public abstract class EntidadeCrudApi<T> {

  private final CrudRepository<T, Long> repositorio;

  @Inject
  protected EntidadeCrudApi(final CrudRepository<T, Long> repositorio) {
    this.repositorio = repositorio;
  }

  protected abstract String getDescricaoEntidade();

  public Iterable<T> encontrarTodos() {
    return repositorio.findAll();
  }

  @Path("/{id}")
  public T encontrar(@PathParam("id") final Long id) {
    return repositorio.findById(id)
      .orElseThrow(() -> naoEncontrouPersistido(id));
  }

  @POST
  public T cadastrar(final T novo) {
    return repositorio.save(novo);
  }

  @PUT
  @Path("/{id}")
  public T sobreescrever(@PathParam("id") final Long id, final T novo) {
    if (!repositorio.existsById(id)) {
      throw naoEncontrouPersistido(id);
    }

    return repositorio.save(novo);
  }

  @DELETE
  @Path("/{id}")
  public T apagar(@PathParam("id") final Long id) {
    final Optional<T> persisted = repositorio.findById(id);

    if (persisted.isEmpty()) {
      throw naoEncontrouPersistido(id);
    }

    repositorio.deleteById(id);
    return persisted.get();
  }

  protected NotFoundException naoEncontrouPersistido(final Long id) {
    return new NotFoundException(String.format(
      "Registro de %s com identificador %s não foi encontrado",
      getDescricaoEntidade(),
      id
    ));
  }

}
