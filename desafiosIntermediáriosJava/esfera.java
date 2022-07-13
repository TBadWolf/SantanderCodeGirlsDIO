package desafiosIntermediáriosJava;

import java.util.Scanner;


public class esfera {
    public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
 //TODO: Complete os espaços em branco com uma possível solução para o desafio 
  		double pi = 3.14159;
  		double raio = sc.nextDouble();
  		
  		double volume = (4.0/3) * pi * (Math.pow(raio, 3.0));
  		System.out.printf("VOLUME =  %.3f %n" , volume);
    }
	
}