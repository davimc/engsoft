package br.edu.ifma.acad.Teste.builder;

import br.edu.ifma.acad.models.Cliente;

import java.time.LocalDate;

public class ClienetBuilder {
    private Cliente cliente;

    private ClienetBuilder(){

    }
    public static ClienetBuilder umCliente(){
        ClienetBuilder builder = new ClienetBuilder();
        builder.cliente.setCpf("607.272.893-65");
        builder.cliente.setNome("Davi");
        builder.cliente.setEmail("davimatosc@hotmail.com");
        builder.cliente.setTel1("982186943");
        builder.cliente.setTel2("982122222");
        builder.cliente.setNascimento(LocalDate.of(1995,6,2));

        return builder;
    }
    public ClienetBuilder comCpf(String cpf){
        cliente.setCpf(cpf);
        return this;
    }
    public ClienetBuilder comTelPrincipal(String tel){
        cliente.setTel1(tel);
        return this;
    }
    public ClienetBuilder comTelSecundario(String tel){
        cliente.setTel2(tel);
        return this;
    }
    public ClienetBuilder comNascimento(LocalDate data){
        cliente.setNascimento(data);
        return this;
    }
    public Cliente constroi(){
        return cliente;
    }
}
