package lista3;

import java.util.Scanner;

public class SomandoNumeros {
	
	/*
	 * 5- Crie um programa que leia um n�mero do teclado at� que encontre um
		n�mero igual a zero. No final, mostre a soma dos n�meros
		digitados.(DO...WHILE)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		int soma = 0;
		
		Scanner entradaInt = new Scanner(System.in);
		
		do {
			System.out.print("Digite um numero: ");
			numero = entradaInt.nextInt();
			
			if(numero != 0) {
				soma = soma + numero;
			}
			
		}while(numero != 0);
		
		System.out.printf("A soma dos numeros digitatod foi: %d", soma);

	}

}
