package com.java;

import java.util.Random;
import java.util.Scanner;


    public class Adivinhacao {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numAleatorio = new Random().nextInt(100)+1;
            int tentativas = 0;


            for (int i = 0; i < 5; i++) {
                System.out.println("Digite um número de 1 a 100: ");
                int numero = sc.nextInt();

                tentativas++;

                if (numero > numAleatorio){
                    System.out.println("O número é menor");
                } else if (numero < numAleatorio) {
                    System.out.println("O número é maior");
                } else {
                    System.out.println("Parabéns!!Você acertou o número aleatório com " + tentativas + " tentativas");
                    break;
                }
            }
            if (tentativas == 5) {
                System.out.println("Você esgotou suas 5 tentativas. O número era: " + numAleatorio);
            }

        }
    }


