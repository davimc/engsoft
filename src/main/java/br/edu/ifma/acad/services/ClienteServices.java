package br.edu.ifma.acad.services;

import br.edu.ifma.acad.models.Cliente;
import br.edu.ifma.acad.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServices {
    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll(){
        return (List<Cliente>)repository.findAll();
    }
    public Optional<Cliente> findByName(String clienteNome){
        return repository.findByNome(clienteNome);
    }
}
