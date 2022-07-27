package br.dio.exercicio;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Atividade Calculadora");
        Calculadora.soma(2.5, 3.2);
        Calculadora.subtracao(5.5, 5.5);
        Calculadora.multiplicacao(40.5, 300.56);
        Calculadora.divisao(100, 2);

        //Mensagem
        System.out.println("Atividade Mensagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(18);

        //Emprestimo
        System.out.println("Atividade Emprestimo");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
