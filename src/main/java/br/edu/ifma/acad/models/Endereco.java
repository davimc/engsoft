package br.edu.ifma.acad.models;


public class Endereco {
    private String endereco, bairro, cep;

    public Endereco(String endereco, String bairro, String cep) {
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
