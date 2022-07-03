package aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class AlunoExe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\n Nome: ");
        String nome = scan.nextLine();
        System.out.print("\n Data de nascimento (dd/mm/aaaa): ");
        String nasci = scan.next();
        scan.nextLine();
        System.out.print("\n Turma: ");
        String turma = scan.nextLine();
        System.out.print("\n Data da matrícula (dd/mm/aaaa): ");
        String matricula = scan.next();

        Aluno aluno = new Aluno(nome, nasci, turma, matricula);
        System.out.println(aluno);

        scan.close();
    }
}
