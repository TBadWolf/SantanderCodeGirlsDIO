package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1) (fatorial = decompor um número multiplicando)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt(); //relaciona o valor digitado à variável fatorial.

        int multiplicacao = 1; // determina o valor da multiplicação como 1

        System.out.print(fatorial +"! = ");
        for(int i = fatorial ; i >= 1 ; i --) { //atribui a variável I como o fatorial escolhido, o contador vai controlando a repetição do laço através do decremento do fatorial
            multiplicacao = multiplicacao * i; //realiza a multiplicação.
        }

        System.out.println(multiplicacao);
    }

}
