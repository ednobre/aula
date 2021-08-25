package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("ed", 40, "1"));
        pessoas.add(new Pessoa());
        pessoas.add(new Pessoa("maria", 30, "2", 72, 1.80));
        pessoas.add(new Pessoa("wilson", 62));

        Pessoa pessoa = new Pessoa("Ivo", 45, "2", 65, 1.70);
        double valorImc;
        int indice;
        boolean maior;
        System.out.println(pessoa);

        valorImc = pessoa.calcularImc(pessoa.getPeso(),pessoa.getAltura());
        System.out.println(valorImc);

        if (valorImc < 20){
            indice = -1;
        }
        if (valorImc > 25){
            indice = 1;
        } else {
            indice = 0;
        }
        if (indice == -1){

        }

        maior = pessoa.ehMaiorIdade(pessoa.getIdade());

        if (maior == true){
            System.out.println("maior de idade");
        }
        else {
            System.out.println("e menor de idade");
        }




    }
}
