package lista3;

public class ObtendoResto {
	
	/*
	 * 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
		obtemos resto = 5.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1000; i <= 1999; i++) {
			if(i % 11 == 5) {
				System.out.printf("O valor %d dividido por 11 sobra 5\n", i);
				
			}	
		}

	}

}
