package lista3;

import java.util.Scanner;

public class VerificandoMaiorNumero {
	
	/*
	 	Parar um loop quando digitar um numero negativo
		OBS.: qunado parar devera mostrar qual foi o maior numero digitado.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		int maior = 0;
		
		Scanner entradaInt = new Scanner(System.in);
		
		do {
			System.out.print("Escreva um numero: ");
			numero = entradaInt.nextInt();
			
			if(numero > maior) {
				maior = numero;	
			}
			
		}while(numero >= 0);
		
		System.out.printf("O menor numero e %d", maior);

	}

}
