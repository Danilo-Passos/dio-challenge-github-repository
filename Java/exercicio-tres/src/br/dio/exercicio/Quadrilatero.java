package br.dio.exercicio;

public class Quadrilatero {
    public static double area(double lado) {
        //Quadrado
        return  lado * lado;
    }

    public static double area(double lado, double lado2) {
        //Retangulo
        return lado * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        //Trapezio
       return ((baseMaior + baseMenor)*altura) / 2;
    }

    public static float area(float diagonal1, float diagonal2) {
        //Losangolo
        return ((diagonal1 * diagonal2) / 2);
    }
}
