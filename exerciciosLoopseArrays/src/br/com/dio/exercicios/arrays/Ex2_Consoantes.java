package br.com.dio.exercicios.arrays;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6]; //cria um array de 6 posições
        int quantidadeConsoantes = 0; //cria variável de quantas consoantes serão lidas

        int count = 0; //contador inicia no 0
        do {
            System.out.println("Letra: ");
            String letra = scan.next(); //atribui a informação recebida a variavel letra

            if ( !(letra.equalsIgnoreCase("a") | // ! - toda string que for diferentes detas
                    letra.equalsIgnoreCase("e") | // mencionadas será consoante
                    letra.equalsIgnoreCase("i") | // retorna TRUE ou FALSE
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) )  {
                consoantes[count] = letra; // pegará o array de consoante na posição do contador = a letra digitada
                quantidadeConsoantes++;//soma a quantidade se positivo para consoante
            }

            count++; //incrementa o contador para a repetição

        } while(count < consoantes.length); // repetirá até quanto o contador for menor que o length do array

        System.out.print("Consoantes: ");
        for ( String consoante  :  consoantes ) { //tipo de elemento do array : consoantes (a String que será lida)
            if ( consoante != null) //irá imprimir somente se for diferente de null
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        //System.out.println(consoantes.length);

    }

}
