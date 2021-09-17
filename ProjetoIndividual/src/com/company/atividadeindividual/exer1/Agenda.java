package com.company.atividadeindividual.exer1;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Pessoa> listaP = new ArrayList();


    public void amarzenarPessoas(Pessoa pessoa) {

        listaP.add(pessoa);
    }

    public void exibirAgenda() {
        for (Pessoa lp : listaP) {
            System.out.println(lp);
        }
    }

    public void removerPessoas(String nome) {
        for(int i=0; i<listaP.size();i++){
            if(listaP.get(i).getName().equals(nome)) {
                listaP.remove(i);
            }
        }
//        for (Pessoa lp: listaP) {
//            if (lp.getName().equals(nome)){
//                listaP.remove(nome);
//                System.out.println("xxxxxxxxxxxxxxxxxxxxx");
//            }
//        }
    }

    public int exibirPessoa(int id) {
        for (Pessoa lp: listaP) {
            if (lp.getId() == id) {
                System.out.println(lp);
            }
        }
        return 0;
    }

}
