package com.company.atividadeindividual.exer3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.printf("tamanho ladoA do piso: ");
        Scanner tecladoA = new Scanner(System.in);
        double ladoA = tecladoA.nextDouble();
        
        System.out.printf("tamanho ladoB piso : ");
        Scanner tecladoB = new Scanner(System.in);
        double ladoB = tecladoB.nextDouble();

        System.out.printf("Area da lajota: ");
        Scanner tecladoL = new Scanner(System.in);
        double lajota = tecladoL.nextDouble();

        System.out.println("--------Area do retangulo-------");
        double areaRet = Retangulo.calculaArea(ladoA,ladoB);

        System.out.println("--------perimetro do retangulo-------");
        double perimetro = Retangulo.calcucalculaPerimetrolaArea(ladoA,ladoB);

        System.out.println("--------Quantidate de lajota-------");
        Retangulo.quantidadePiso(areaRet,lajota*lajota);

        System.out.println("--------Quantidate de lajota no rodape-------");
        Retangulo.quatidadeRodape(lajota,ladoB);
    }
}
