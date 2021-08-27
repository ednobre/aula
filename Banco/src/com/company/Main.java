package com.company;

public class Main {

    public static void main(String[] args) {
        Executivo executivo = new Executivo();


        System.out.println(executivo.depositar(1, 100));
        System.out.println(executivo.transferir(1, 2, 50));


    }
}
