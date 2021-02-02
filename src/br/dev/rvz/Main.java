package br.dev.rvz;

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

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int pontuacao = 0, numeroAleatorio = gerarNumeroAleatorio(5), entradaJogador;
        boolean continuar = true;
        String tentarNovamente;

        System.out.println("Bem vindo ao jogo do adivinha um número");

        while(continuar) {

            System.out.println("Por faor digite um número: ");
            entradaJogador = Integer.parseInt(in.nextLine());

            pontuacao += testeDeAcerto(entradaJogador, numeroAleatorio);

            System.out.println("Digite \"S\" para continuar e \"n\" para sair do jogo");
            tentarNovamente = in.nextLine();

            if (tentarNovamente.equalsIgnoreCase("n")) {
                continuar = false;
            }

        }

        System.out.println("A sua pontuação final é: " + pontuacao);
    }
}
