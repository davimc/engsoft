package br.edu.ifma.acad.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="locacao_id")
    private List<Locacao> locacoes;

    @Column(name="tipo")
    private Tipo tipoImovel;

    @OneToOne
    @JoinColumn(name="endereco_id")
    private Endereco endereco;
    private double metragem;
    private int banheiro, suites, garagem, dormitorio;
    @Column(name="aluguelSugerido")
    private double aluguelSugerido;
    private String obs = "";

    public Imovel() {
    }

    public long getId() {
        return id;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    public Tipo getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(Tipo tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }

    public int getBanheiro() {
        return banheiro;
    }

    public void setBanheiro(int banheiro) {
        this.banheiro = banheiro;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getgaragem() {
        return garagem;
    }

    public void setgaragem(int garagem) {
        this.garagem = garagem;
    }

    public int getDormitorio() {
        return dormitorio;
    }

    public void setDormitorio(int dormitorio) {
        this.dormitorio = dormitorio;
    }

    public double getAluguelSugerido() {
        return aluguelSugerido;
    }

    public void setAluguelSugerido(double aluguelSugerido) {
        this.aluguelSugerido = aluguelSugerido;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
