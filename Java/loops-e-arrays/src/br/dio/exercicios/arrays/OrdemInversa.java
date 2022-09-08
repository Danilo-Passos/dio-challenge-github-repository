package br.dio.exercicios.arrays;

public class OrdemInversa {
    public static void main(String[] args) {

        int [] vetor = {-5, -6, 15, 50, 8, 4};
        int count = 0;

        System.out.print("Vetor: ");

        while(count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor Inverso: ");
        for (int i = (vetor.length -1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }
}
