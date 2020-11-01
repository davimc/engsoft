package br.edu.ifma.acad.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Locacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Imovel imovel;
    @ManyToOne
    private Cliente cliente;
    @OneToMany
    private List<Aluguel> alugueis;

    private double valorAluguel;
    private double porcentualMulta;
    private LocalDate dataVencimento, dataInicio=LocalDate.now(), dataFim;
    private boolean isAtivo=true;
    private String obs="";


    public Locacao() {
        isAtivo = true;

    }

    public long getId() {
        return id;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getAluguel() {
        return valorAluguel;
    }

    public void setAluguel(double aluguel) {
        this.valorAluguel = aluguel;
    }

    public double getPorcentualMulta() {
        return porcentualMulta;
    }

    public void setPorcentualMulta(double porcentualMulta) {
        this.porcentualMulta = porcentualMulta;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isAtivo() {
        return isAtivo;
    }

    public void setAtivo(boolean ativo) {
        isAtivo = ativo;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
