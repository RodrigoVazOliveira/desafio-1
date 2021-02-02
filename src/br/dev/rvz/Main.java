package br.dev.rvz;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int gerarNumeroAleatorio(int tamanho) {
        Random random = new Random();
        return random.nextInt(tamanho);
    }

    public static void main(String[] args) {
        
    }
}
