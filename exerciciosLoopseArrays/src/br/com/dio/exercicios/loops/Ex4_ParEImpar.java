package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();//atribui a informação recebida à variável quantidade de numeros.

        int count = 0; //o contador irá controlar a quantidade de repetição até a quantidade que vc informou.
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();//atribui a informação recebida à variável os números que você for inserindo.

            if (numero % 2 == 0 ) quantPares++; //resto de divisão, todos que tiverem resto 0 será pares
            else quantImpares++; // o restante que não for 0 será ímpares

            count++; //incremento do count para o contador conseguir somar as quantidades repetidas do laço
        } while(count < quantNumeros); //repetirá de acordo com a quantidade de números que você escolheu

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
    }
}
