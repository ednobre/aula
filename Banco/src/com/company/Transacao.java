package com.company;

public abstract class Transacao{
    private int valor;
    public boolean transaction(int valor) {
        if (this.valor > 0){
            return transactionOK();
        } else{
            return transactionNoOK();
        }
    }

    public abstract boolean transactionOK();
    public abstract boolean transactionNoOK();

}
