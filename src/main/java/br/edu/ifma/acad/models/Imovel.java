package br.edu.ifma.acad.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String tipoImovel;
    private Endereco endereco;
    private double metragem;
    private short banheiro, suites, garangem, dormitorio;
    private double aluguel_sugerido;
    private String obs = "";

    public Imovel(String tipoImovel, Endereco endereco, double metragem, short banheiro, short suites, short garangem, short dormitorio, double aluguel_sugerido) {
        this.tipoImovel = tipoImovel;
        this.endereco = endereco;
        this.metragem = metragem;
        this.banheiro = banheiro;
        this.suites = suites;
        this.garangem = garangem;
        this.dormitorio = dormitorio;
        this.aluguel_sugerido = aluguel_sugerido;

    }

    public Imovel(String tipoImovel, Endereco endereco, double metragem, short banheiro, short suites, short garangem, short dormitorio, double aluguel_sugerido, String obs) {
        this.tipoImovel = tipoImovel;
        this.endereco = endereco;
        this.metragem = metragem;
        this.banheiro = banheiro;
        this.suites = suites;
        this.garangem = garangem;
        this.dormitorio = dormitorio;
        this.aluguel_sugerido = aluguel_sugerido;
        this.obs = obs;
    }
}
