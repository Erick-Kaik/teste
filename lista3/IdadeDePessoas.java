package lista3;

import java.util.Scanner;

public class IdadeDePessoas {
	
	/*
	 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		int menor = 0;
		int maior = 0;
		
		Scanner entradaInt = new Scanner(System.in);
		
		System.out.println("Qual sua idade: ");
		idade = entradaInt.nextInt();
		
		while(idade != -99) {
			System.out.println("Qual sua idade: ");
			idade = entradaInt.nextInt();
			
			if(idade < 21) {
				menor++;
				
			}else if(idade > 50) {
				maior++;
				
			}
		}
		
		System.out.printf("Idades menores que 21 anos: %d\n", menor);
		System.out.printf("Idades maiores que 50 anos: %d\n", maior);

	}

}
