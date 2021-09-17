package com.company.atividadeindividual.exer5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condicao;

        do {
            Scanner nomeTc = new Scanner(System.in);
            Scanner cpfTc = new Scanner(System.in);
            Scanner ederecoTc = new Scanner(System.in);
            Scanner emailTc = new Scanner(System.in);
            Scanner telefoneTc = new Scanner(System.in);

            System.out.printf("Didite seu nome: ");
            String nome = nomeTc.nextLine();

            System.out.printf("Didite seu cpf: ");
            String cpf = cpfTc.nextLine();

            System.out.printf("Didite seu endereço: ");
            String edereco = ederecoTc.nextLine();

            System.out.printf("Didite seu email: ");
            String email = emailTc.nextLine();

            System.out.printf("Didite seu telefone: ");
            String telefone = telefoneTc.nextLine();

            Boolean nomeValido = Validacao.nomeValido(nome);

            Boolean cpfValido = Validacao.cpfValido(cpf);

            Boolean emailValido = Validacao.emailValido(email);

            Boolean telValido = Validacao.telefoneValido(telefone);

            if(!(nomeValido&&cpfValido&&telValido&&emailValido)) {
                condicao = 1;
                System.out.println("Cliente não pode ser Cadastrado. Dados inválidos!");
            }else {
                System.out.println("Cliente Cadastrado com Sucesso!");
                condicao = 0;
            }
        }while(condicao==1);


    }
}
