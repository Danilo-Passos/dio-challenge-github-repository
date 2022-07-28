package br.dio.exercicio;

public class Main {

    public static void main(String[] args) {

        //Retornos
        System.out.println("Atividade Retornos");

        double areaQuadrado = Quadrilatero.area(10);
        System.out.println("A área do Quadrado é: " + areaQuadrado);

        double areaRetângulo = Quadrilatero.area(10d, 10d);
        System.out.println("A área do Retângulo é: " + areaRetângulo);

        double areaTrapezio = Quadrilatero.area(10, 10, 10);
        System.out.println("A área do Traézio é: " + areaRetângulo);

        double areaLosangolo = Quadrilatero.area(10f, 10f);
        System.out.println("A área do Losangolo é: " + areaLosangolo);
    }
}
