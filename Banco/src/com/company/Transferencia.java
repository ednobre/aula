package com.company;

public class Transferencia extends Transacao{
    private int contaOrigem;
    private int contaDestino;
    private int valor;

    public Transferencia(int contaOrigem, int contaDestino, int valor) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
    }

    @Override
    public boolean transaction(int valor) {
        return super.transaction(valor);
    }

    @Override
    public boolean transactionOK() {
        return false;
    }

    @Override
    public boolean transactionNoOK() {
        return false;
    }
}
