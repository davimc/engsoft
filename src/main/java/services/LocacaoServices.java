package services;

import br.edu.ifma.acad.models.Locacao;
import br.edu.ifma.acad.repositories.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocacaoServices {
    @Autowired
    private LocacaoRepository repository;


}
