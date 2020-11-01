package br.edu.ifma.acad.Teste.repositories;

import br.edu.ifma.acad.Teste.builder.ClienetBuilder;
import br.edu.ifma.acad.models.Cliente;
import br.edu.ifma.acad.repositories.ClienteRepository;
import br.edu.ifma.acad.services.ClienteServices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.NoResultException;

public class ClienteRepositoryTest {
    @Autowired
    private static ClienteServices services;


    @Test
    public void deveEncontrarUsuarioPeloNome(){
       services.findByName("Davi").get();
    }

}
