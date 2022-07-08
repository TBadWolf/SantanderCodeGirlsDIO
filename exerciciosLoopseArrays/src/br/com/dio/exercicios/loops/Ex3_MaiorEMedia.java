package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero; //criando as variáveis
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt(); // atribuindo a informação à variável número

            soma = soma + numero; 

            if (numero > maior) maior = numero;

            count = count + 1; //cria variáveis para fazer o contador de vezes que o laço irá se repetir
        } while(count < 5);//estipular que o contador pare somente qnd for maior que 5

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

    }
}
