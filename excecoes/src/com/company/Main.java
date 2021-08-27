package com.company;

public class Main {

    public static void main(String[] args) {

        //Mensagem final
        String mensagemFinal = "Esta é a última mensagem";

        //Código que lança exceção
        int[] numeros = new int[5];

        try {
            numeros[5] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Limite de tamanho excedido");
        }finally {
            System.out.println(mensagemFinal);
        }

        int a = 0;
        int b = 300;

        try {
            calcularQuociente(b, a);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro");
        }finally {
            System.out.println("Programa finalizado!!!");
        }
    }

    public static int calcularQuociente(int b, int a) {
        return b/a;
    }


}
