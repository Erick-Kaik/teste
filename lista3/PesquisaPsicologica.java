package lista3;

import java.util.Random;
import java.util.Scanner;

public class PesquisaPsicologica {
	
	/*
	 * 4- Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		o número de pessoas calmas;
		o número de mulheres nervosas;
		o número de homens agressivos;
		o número de outros calmos;
		o número de pessoas nervosas com mais de 40 anos;
		o número de pessoas calmas com menos de 18 anos.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		int genero;
		int opcoes;
		int i = 0;
		int calmas = 0;
		int calmasO = 0;
		int calmas18 = 0;
		int nervosas40 = 0;
		int nervosasM = 0;
		int agressivasH = 0;
		
		Scanner opcao = new Scanner(System.in);
		Scanner entradaIdade = new Scanner(System.in);
		Scanner entradaGenero = new Scanner(System.in);
		
		Random random = new Random();
		
		while(i < 150) {
			
			System.out.println("Quantos anos voce tem?");
			//idade = entradaIdade.nextInt();
			idade = random.nextInt((110 - 1) + 1) + 1;
			
			System.out.println("Voce se considera: 1-feminino / 2-masculino / 3-Outros ");
			//genero = entradaGenero.nextInt();
			genero = random.nextInt((3 - 1) + 1) + 1;
			
			System.out.println("Voce se considera uma pessoa? ");
			System.out.println("1 | Calma");
			System.out.println("2 | Nervosa");
			System.out.println("3 | Agressiva");
			
			//opcoes = opcao.nextInt();
			opcoes = random.nextInt((3 - 1) + 1) + 1;
			
			if(idade < 18) {
				if(opcoes == 1 && genero == 3) {
					calmas18++;
					calmasO++;
					calmas++;
				
				}else if(opcoes == 1 && genero == 2) {
					calmas18++;
					calmas++;
				
				}else if(opcoes == 1 && genero == 1) {
					calmas18++;
					calmas++;
				
				}else if(genero == 3) {
					if(opcoes == 1) {
						calmasO++;
						calmas++;
						
					}
					
				}else if(genero == 2) {
					if(opcoes == 3) {
						agressivasH++;
						
					}else if(opcoes == 1) {
						calmas++;
					}
					
				}else if(genero == 1) {
					if(opcoes == 2) {
						nervosasM++;
						
					}else if (opcoes == 1) {
						calmas++;
					}
					
				}
				
			}else if(idade > 40) {
				if(opcoes == 2 && genero == 1) {
					nervosas40++;
					nervosasM++;
					
				}else if(opcoes == 2 && genero == 2) {
					nervosas40++;
					
				}else if(opcoes == 2 && genero == 3) {
					nervosas40++;
					
				}else if(genero == 3) {
					if(opcoes == 1) {
						calmasO++;
						calmas++;
						
					}
					
				}else if(genero == 2) {
					if(opcoes == 3) {
						agressivasH++;
						
					}else if(opcoes == 1) {
						calmas++;
					}
					
				}else if(genero == 1) {
					if(opcoes == 2) {
						nervosasM++;
						
					}else if (opcoes == 1) {
						calmas++;
					}
					
				}
				
			}else if(genero == 3) {
				if(opcoes == 1) {
					calmasO++;
					calmas++;
					
				}
				
			}else if(genero == 2) {
				if(opcoes == 3) {
					agressivasH++;
					
				}else if(opcoes == 1) {
					calmas++;
				}
				
			}else if(genero == 1) {
				if(opcoes == 2) {
					nervosasM++;
					
				}else if (opcoes == 1) {
					calmas++;
				}
				
			}else if(opcoes == 1) {
				calmas++;
			}
			
			i++;
			
		}
		
		System.out.printf("Pessoas Calmas: %d\n", calmas);
		System.out.printf("Mulheres Nervosas: %d\n", nervosasM);
		System.out.printf("Homens Agressivas: %d\n", agressivasH);
		System.out.printf("Outros Calmas: %d\n", calmasO);
		System.out.printf("Pessoas Nervosas com mais de 40 anos: %d\n", nervosas40);
		System.out.printf("Pessoas Calmas com menos de 18 anos: %d\n", calmas18);

	}

}
