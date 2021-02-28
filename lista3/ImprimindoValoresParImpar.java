package lista3;

import java.util.Scanner;

public class ImprimindoValoresParImpar {
	
	/*
	 * 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entradaInt = new Scanner(System.in);
		
		int numero;
		int par = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o %d numero: ", (i + 1));
			numero = entradaInt.nextInt();
			
			if(numero % 2 == 0) {
				par++;
			}	
		}
		
		System.out.println("Dos 10 numero digitados:");
		System.out.printf("%d deles eram pares\n", par);
		System.out.printf("%d deles eram impares\n", (10 - par));

	}

}
