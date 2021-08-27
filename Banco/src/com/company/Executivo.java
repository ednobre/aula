package com.company;

public class Executivo {

    public boolean depositar(int conta, int valor){
        Deposito deposito = new Deposito(conta, valor);
        return deposito.transaction(valor);
    }

    public boolean transferir(int contaOrigem, int contaDestino, int valor){
        Transferencia transferencia = new Transferencia(contaOrigem, contaDestino, valor);
        return transferencia.transaction(valor);
    }

}
