package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4}; //determina os valores do array

        //System.out.println(vetor.length);

        System.out.print("Vetor: "); //mostra o vetor como está alocado.
        int count =0; //variável que controla a quantidade de repetições
        while(count < (vetor.length)) { //contador para controlar as vezes de repetição
            System.out.print(vetor[count] + " ");//[count] para mostrar cada elemento do vetor
            count++; // incrementa a contagem do contador para alternar a posição do dado do array
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --) { //length -1 pq o array sempre começa com 0
            //aqui decrementou o contador para mostrar os elementos do vetor do final para o inicio
            System.out.print(vetor[i] + " ");
        }

    }
}
