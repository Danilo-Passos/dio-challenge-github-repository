package br.dio.exercicios.loops;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int count = 0;
        int numero;
        int qtdPar = 0;
        int qtdImpar =0;

        System.out.print("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.print("Número: ");
            numero = scan.nextInt();
            qtdImpar += (numero % 2 != 0) ? 1 : 0;
            qtdPar += (numero % 2 == 0) ? 1 : 0;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade de números Pares: " + qtdPar);
        System.out.println("Quantidade de números Impar: " + qtdImpar);

//        System.out.println("Quantidade de números Pares: " + (numero / 2));
//        System.out.println("Quantidade de números Impares: " + ((numero / 2) + (numero % 2)));


        System.out.println("Programa Encerrado...");
    }
}
