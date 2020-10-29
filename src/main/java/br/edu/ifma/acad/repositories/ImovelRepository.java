package br.edu.ifma.acad.repositories;

import br.edu.ifma.acad.models.Imovel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImovelRepository extends CrudRepository<Imovel, Long> {
}
