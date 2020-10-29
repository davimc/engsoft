package br.edu.ifma.acad.repositories;

import br.edu.ifma.acad.models.Aluguel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AluguelRepository extends CrudRepository<Aluguel, Long> {
}
