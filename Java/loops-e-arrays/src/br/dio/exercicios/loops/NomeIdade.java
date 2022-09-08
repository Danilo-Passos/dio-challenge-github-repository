package br.dio.exercicios.loops;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.print("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.print("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Programa Encerrado...");
    }
}
