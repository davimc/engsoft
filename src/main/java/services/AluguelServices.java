package services;

import br.edu.ifma.acad.models.Aluguel;
import br.edu.ifma.acad.repositories.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AluguelServices {
    @Autowired
    private AluguelRepository repository;

    public List<Aluguel> findAll(){
        return (List<Aluguel>)repository.findAll();
    }
    
}
