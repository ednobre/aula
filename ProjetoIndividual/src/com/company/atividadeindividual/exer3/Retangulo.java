package com.company.atividadeindividual.exer3;

public class Retangulo {

    public static double calculaArea(double ladoA, double ladoB) {
        System.out.println(ladoA*ladoB);
        return ladoA*ladoB;
    }
    public static double calcucalculaPerimetrolaArea(double ladoA, double ladoB) {
        System.out.println((ladoA+ladoB)*2);
        return (ladoA+ladoB)*2;
    }
    public static void quantidadePiso(double area, double lajota) {
        System.out.println(area/lajota);
    }

    public static void quatidadeRodape(double lajota, double perimetro) {
      System.out.println((perimetro/lajota-4*lajota));
    }
}
