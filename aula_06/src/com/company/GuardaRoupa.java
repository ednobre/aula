package com.company;

import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {

    HashMap<Integer, List<Roupa>> guardaRoupa = new HashMap<>();
    int num = 1;

    // metodo incluir
    public Integer incluirRoupa(List<Roupa> listaDeRoupas){
        guardaRoupa.put(num++,listaDeRoupas);
        return num;
    }

    // usar um for para percorrer o Hash
    public void mostraGuarda() {
        System.out.println(guardaRoupa);
    }

//    public List<Roupa> devolverRoupas(Integer número){
//
//    }

    @Override
    public String toString() {
        return "GuardaRoupa{" +
                "guardaRoupa=" + guardaRoupa +
                '}';
    }
}
