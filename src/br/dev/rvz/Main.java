package br.dev.rvz;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int gerarNumeroAleatorio(int tamanho) {
        Random random = new Random();
        return random.nextInt(tamanho);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pontuacao = 0, numeroAleatorio = gerarNumeroAleatorio(10), entradaJogador;

        System.out.println("Bem vindo ao jogo do adivinha um número");
        System.out.println("Por faor digite um número: ");
        entradaJogador = Integer.parseInt(in.nextLine());

        if ()

    }
}
