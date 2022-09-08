package br.dio.exercicios.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.print("Tabuada: ");
        tabuada = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }

        System.out.println("Programa Encerrado...");
    }
}
