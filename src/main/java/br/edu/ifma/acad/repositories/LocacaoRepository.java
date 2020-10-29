package br.edu.ifma.acad.repositories;

import br.edu.ifma.acad.models.Locacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocacaoRepository extends CrudRepository<Locacao, Long> {
}
