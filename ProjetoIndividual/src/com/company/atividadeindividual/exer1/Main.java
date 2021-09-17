package com.company.atividadeindividual.exer1;


public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(0,"ed","sant Ant","121212",40,1.66);
        Pessoa pessoa2 = new Pessoa(1,"jonas","sp","131313",30,1.60);
        Pessoa pessoa3 = new Pessoa(2,"livia","sant Ant","14141414",20,1.62);
        Pessoa pessoa4 = new Pessoa(3,"dimas","juca barbosa","1425362",22,1.74);
        Pessoa pessoa5 = new Pessoa(4,"marcia","Tiradendes","121212",44,1.72);
        Pessoa pessoa6 = new Pessoa(5,"ana","RR","121212",35,1.78);
        Pessoa pessoa7 = new Pessoa(6,"joao","RJ","121212",28,1.46);
        Pessoa pessoa8 = new Pessoa(7,"paulo","zinfa","121212",75,1.76);
        Pessoa pessoa9 = new Pessoa(8,"mendonca","guaiba","121212",18,1.69);
        Pessoa pessoa10 = new Pessoa(9,"boiadeiro","poa","121212",27,1.60);

        Agenda agenda = new Agenda();

        agenda.amarzenarPessoas(pessoa1);
        agenda.amarzenarPessoas(pessoa2);
        agenda.amarzenarPessoas(pessoa3);
        agenda.amarzenarPessoas(pessoa4);
        agenda.amarzenarPessoas(pessoa5);
        agenda.amarzenarPessoas(pessoa6);
        agenda.amarzenarPessoas(pessoa7);
        agenda.amarzenarPessoas(pessoa8);
        agenda.amarzenarPessoas(pessoa9);
        agenda.amarzenarPessoas(pessoa10);

        System.out.println("--------Exibir toda Agenda--------------");
        agenda.exibirAgenda();

        System.out.println("--------Remove uma passoa--------------");
        String nomeRemover = "marcia";
        agenda.removerPessoas(nomeRemover);
        agenda.exibirAgenda();

        System.out.println("--------Exibir uma passoa--------------");
        agenda.exibirPessoa(5);

    }
}
