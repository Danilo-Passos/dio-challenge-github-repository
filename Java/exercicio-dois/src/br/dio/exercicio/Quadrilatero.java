package br.dio.exercicio;

public class Quadrilatero {
    public static void area(double lado) {

        System.out.println("Área do quadrado é: " + lado * lado);

    }

    public static void area(double lado, double lado2) {

        System.out.println("Área do retângulo é: " + lado * lado2);

    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do trapézio é: " + ((baseMaior+baseMenor)*altura) / 2);

    }

    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Área do losangolo é: " + (diagonal1 * diagonal2) / 2);

    }

}
