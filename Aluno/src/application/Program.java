package application;

import entities.Aluno;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.printf("%nEntre com o nome do Aluno, seguido das suas notas trimenstrais:%n");
        aluno.name = s.nextLine();
        aluno.n1 = s.nextDouble();
        aluno.n2 = s.nextDouble();
        aluno.n3 = s.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n",aluno.gradeFinal());
        System.out.println(aluno.passOrFailed());

        if (aluno.passOrFailed() == "FAILED"){
            System.out.printf("MISSING %.2f POINT%n",aluno.missingPoints());
        }

        s.close();
    }
}
