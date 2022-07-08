package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random(); //gerar números aleatórios

        int[][] M = new int[4][4]; // primeira [] representa a linha e a segunda [] a coluna

        for(int i = 0; i < M.length; i++) { //enquanto i(linha) for menor que o tamanho da nossa matriz, incrementa
            for( int j = 0; j < M[i].length; j++) { //enquanto J (elemento)for menor que o tamanho da nossa matriz, incrementa
                M[i][j] = random.nextInt(9); //pegou a linha e a coluna da matriz m e gerou numero aleatorio
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M  ) { //pegou cada linha da matriz
            for (int coluna : linha ) {// pegou cada elemento
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

    }


}
