package com.company.atividadeindividual.exer1;

public class Pessoa {
    private int id;
    private String name;
    private String endereco;
    private String telefone;
    private int idade;
    private Double altura;

    public Pessoa() {
    }

    public Pessoa(int id, String name, String endereco, String telefone, int idade, Double altura) {
        this.id = id;
        this.name = name;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
