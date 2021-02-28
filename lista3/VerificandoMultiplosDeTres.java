package lista3;

import java.util.Scanner;

public class VerificandoMultiplosDeTres {
	
	/*
	 * 6- Escrever um programa que receba vários números inteiros no teclado. E no
		final imprimir a média dos números múltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		int media = 0;
		int i = 0;
		
		Scanner entradaInt = new Scanner(System.in);
		
		do {
			System.out.print("Digite um numero inteiro: ");
			numero = entradaInt.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				media = media + numero;
				i++;
				
				System.out.printf("O valor %d e multiplo de 3\n", numero);
			}
			
		}while(numero != 0);
		
		System.out.println();
		System.out.printf("A media dos valores digitados multiplos de 3 e: %d\n", (media / i));

	}

}
