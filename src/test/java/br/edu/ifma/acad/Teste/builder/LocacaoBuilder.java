package br.edu.ifma.acad.Teste.builder;

import br.edu.ifma.acad.models.Cliente;
import br.edu.ifma.acad.models.Imovel;
import br.edu.ifma.acad.models.Locacao;

import java.time.LocalDate;

public class LocacaoBuilder {

    private Locacao locacao;

    private LocacaoBuilder() { }

    public static LocacaoBuilder umaLocacao() {
        LocacaoBuilder builder = new LocacaoBuilder();
        builder.locacao = new Locacao();
        builder.locacao.setPorcentualMulta(2.5);
        builder.locacao.setDataInicio(LocalDate.now());
        builder.locacao.setDataVencimento(LocalDate.now().plusYears(2));
        builder.locacao.setDataFim(LocalDate.now().plusYears(2));
        builder.locacao.setAluguel(550);
        builder.locacao.setObs("");
        return builder;
    }
    public LocacaoBuilder paraCliente(Cliente cliente){
        locacao.setCliente(cliente);
        return this;
    }
    public LocacaoBuilder paraImovel(Imovel imovel){
        locacao.setImovel(imovel);
        return this;
    }
    public LocacaoBuilder comAtivo(boolean ativo){
        locacao.setAtivo(ativo);
        return this;
    }
    public LocacaoBuilder comDataInicio(LocalDate data){
        locacao.setDataInicio(data);
        return this;
    }
    public LocacaoBuilder comDataVencimento(LocalDate data){
        locacao.setDataVencimento(data);
        return this;
    }
    public LocacaoBuilder comDataFim(LocalDate data){
        locacao.setDataFim(data);
        return this;
    }
    public Locacao constroi(){
        return locacao;
    }
}
