package br.edu.ifma.acad.services;

import br.edu.ifma.acad.models.Imovel;
import br.edu.ifma.acad.repositories.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImovelServices {
    @Autowired
    private ImovelRepository repository;

    public List<Imovel> findAll(){
        return (List<Imovel>)repository.findAll();
    }

}
