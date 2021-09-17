package com.company.atividadeindividual.exer2;

public class ManipulaString {
    String nome;

    public ManipulaString() {
    }

    public static void inverteNome(String nome) {
        System.out.println(new StringBuilder(nome).reverse().toString().toUpperCase());
    }

    public static void palindromo(String nome){
        String inverte = new StringBuilder(nome).reverse().toString();
        if(inverte.equals(nome))
            System.out.println(nome+ " é um palíndromo.");
    }

    //public static String retirarEspaco(String nome) {
      //  return nome.replace(nome);
   // }
}
