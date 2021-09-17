package com.company.atividadeindividual.exer2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = null;

        System.out.printf("Digite uma String: ");
        Scanner teclado = new Scanner(System.in);

        nome = teclado.next();

        ManipulaString.inverteNome(nome);
        ManipulaString.palindromo(nome);
    }


}
