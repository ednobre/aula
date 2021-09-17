package com.company.atividadeindividual.exer5;

public class Validacao {


    public static Boolean nomeValido(String nome) {
        return (nome.length()>2 && nome.length()<51);

    }

    public static Boolean cpfValido(String cpf) {
         return (cpf.length()>10 && cpf.length() <12);
    }

    public static Boolean telefoneValido(String tel){
        return (tel.length()>10 && tel.length() <12);
    }

    public static Boolean emailValido(String email) {
        return email.contains("@");
    }
}
