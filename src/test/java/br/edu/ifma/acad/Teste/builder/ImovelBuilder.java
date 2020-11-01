package br.edu.ifma.acad.Teste.builder;

import br.edu.ifma.acad.models.Endereco;
import br.edu.ifma.acad.models.Imovel;
import br.edu.ifma.acad.models.Tipo;

public class ImovelBuilder {
    private Imovel imovel;

    private ImovelBuilder(){

    }
    public static ImovelBuilder umImovel(){
        ImovelBuilder builder = new ImovelBuilder();
        builder.imovel = new Imovel();
        builder.imovel.setTipoImovel(Tipo.CASA);
        builder.imovel.setEndereco(new Endereco("Rua dos manacas","7","São Francisco","65076-410"));
        builder.imovel.setBanheiro(1);
        builder.imovel.setDormitorio(2);
        builder.imovel.setgaragem(3);
        builder.imovel.setSuites(1);
        builder.imovel.setAluguelSugerido(200.00);
        builder.imovel.setMetragem(40.0);
        builder.imovel.setObs("alguma coisa deveria ser dita");

        return builder;
    }

    public ImovelBuilder comTipo(Tipo tipo){
        this.imovel.setTipoImovel(tipo);
        return this;
    }
    public ImovelBuilder comEndereco(String endereco, String numero, String bairro, String cep){
        this.imovel.setEndereco(new Endereco(endereco,numero,bairro,cep));
        return this;
    }
    public Imovel constroi(){
        return imovel;
    }
}
