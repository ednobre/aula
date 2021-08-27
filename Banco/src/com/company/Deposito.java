package com.company;

public class Deposito extends Transacao{
    private int conta;
    private int valor;

    public Deposito(int conta, int valor) {
        this.conta = conta;
        this.valor = valor;
    }

    public Deposito() {
    }

    @Override
    public boolean transaction(int valor) {
        return super.transaction(valor);
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
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
