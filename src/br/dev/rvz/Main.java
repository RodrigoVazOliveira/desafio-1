package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int gerarNumeroAleatorio(int tamanho) {
        Random random = new Random();
        return random.nextInt(tamanho);
    }

    public static int testeDeAcerto(int numeroJogador, int numeroAleatorio) {
        if (numeroJogador == numeroAleatorio) {
            System.out.println("Parabéns, você ganhou mais 10 pontos");
            return 10;
        } else if (numeroJogador == (numeroAleatorio+1) || numeroJogador == (numeroAleatorio-1)) {
            System.out.println("Parabéns, você ganhou mais 5 pontos");
            return 5;
        } else {
            return 0;
        }
    }

    /*
     *  1. Fácil - (1 até 10)
     *  2. Médio - (1 até 30)
     *  3. Dificíl - (1 até 60)
     * */
    public static int nivelJogo(int nivel) {
        if (nivel == 1) {
            return gerarNumeroAleatorio(10);
        } else if (nivel == 2) {
            return gerarNumeroAleatorio(30);
        } else if (nivel == 3) {
            return gerarNumeroAleatorio(60);
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int pontuacao = 0, numeroAleatorio, entradaJogador;
        boolean continuar = true;
        String tentarNovamente;
        List<Integer> acertos = new ArrayList<>();
        List<Integer> erros   = new ArrayList<>();

        System.out.println("Bem vindo ao jogo do adivinha um número");
        System.out.println("Digite um nível de dificuldade: \n1. Fácil\n2. Médio\n3.Dificil");
        entradaJogador = Integer.parseInt(in.nextLine());

        if (entradaJogador <= 3) {
            while (continuar) {
                numeroAleatorio = nivelJogo(entradaJogador);
                System.out.println("Por faor digite um número: ");
                entradaJogador = Integer.parseInt(in.nextLine());

                int aux = testeDeAcerto(entradaJogador, numeroAleatorio);

                if (aux != 0) {
                    pontuacao += aux;
                    acertos.add(entradaJogador);
                } else {
                    erros.add(entradaJogador);
                }

                System.out.println("Digite \"S\" para continuar e \"n\" para sair do jogo");
                tentarNovamente = in.nextLine();

                if (tentarNovamente.equalsIgnoreCase("n")) {
                    continuar = false;
                }

            }


            System.out.println("A sua pontuação final é: " + pontuacao);
            System.out.println("Números que você acertou: " + acertos);
            System.out.println("Números que você errou: " + erros);
        } else {
            System.out.println("Nível de jogo inválido!");
        }
    }
}
