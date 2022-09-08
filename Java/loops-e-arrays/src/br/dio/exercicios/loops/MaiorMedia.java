package br.dio.exercicios.loops;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.print("Número: ");
            numero = scan.nextInt();

            soma = numero + soma;

            if (numero > maior)
                maior = numero;

            count++;
        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + soma/count);

        System.out.println("Programa Encerrado...");
    }
}
