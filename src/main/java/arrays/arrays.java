package arrays;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		//sem inicializar
		double notaAlunoA [] = new double [3];
		notaAlunoA[0] = 7.9;
		notaAlunoA[1] = 8;
		notaAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notaAlunoA));
		//media:
		double total= 0;
		for(int i = 0; i <notaAlunoA.length; i++) {
			total+= notaAlunoA[i];
		}
		System.out.println(total / notaAlunoA.length);

		//inicializando com valores:
		//colocar uma variavel ou constante dentro
		final double nota2 = 9.9;
		double notaAlunoB [] = {5.1, 5.8,nota2 ,8.9};
		
		//foreach
		
		for(double nota: notaAlunoB) {
			System.out.print(nota + " ");
		}
		
		
	}

}
