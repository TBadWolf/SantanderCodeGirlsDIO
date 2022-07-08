package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); //classe random gera números aleatórios

        int[] numerosAleatorios = new int[20]; //criou array de 20 elementos de números inteiros

        for(int i = 0; i < numerosAleatorios.length; i++) {//enquanto o i for menor que o tamanho do array, incrementa.
            int numero = random.nextInt(100); //criou a variável número e o random criará o número aleatório até 100
            numerosAleatorios[i] = numero; //os numeros aleatorios[i] receberá o valor random da variavel números
        }

        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) { //o número dentro dos números aleatórios
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessor dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");//decrementará o número random -1 para o antecessor
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " "); //icrementará o número random +1 para o sucessor
        }




    }

}
