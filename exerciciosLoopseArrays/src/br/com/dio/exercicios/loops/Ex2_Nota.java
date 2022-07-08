package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota; //criando a variável nota

        System.out.println("Nota: ");
        nota = scan.nextInt(); //atribuindo a informação recebida à variável nota

        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt(); //repete a solicitação de dado quando a informação de invalido for mostrada.
        }

    }

}
