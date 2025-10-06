package org.example;

public class foreach {
    public static void main(String [] args){
        String [] alunos={"gabi","joao","daniel"};
        for(String nomes:alunos){
            System.out.println("O nome do  aluno é: "+nomes);
        }
        for(int i=0;i<alunos.length;i++){
            System.out.println("O nome do aluno(a) é:"+alunos[i]);
        }

    }
}
