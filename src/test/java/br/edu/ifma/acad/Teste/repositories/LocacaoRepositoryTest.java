package br.edu.ifma.acad.Teste.repositories;

import br.edu.ifma.acad.Teste.builder.LocacaoBuilder;
import br.edu.ifma.acad.models.Locacao;
import br.edu.ifma.acad.repositories.LocacaoRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

public class LocacaoRepositoryTest {
    @Autowired
    private LocacaoRepository locacaoRepository;
    private Locacao locacao;
    @BeforeAll
    public void inicio(){
        locacao = LocacaoBuilder.umaLocacao().constroi();
    }
    @BeforeEach
    public void antes(){

    }
    @AfterEach
    public void depois(){

    }

}
