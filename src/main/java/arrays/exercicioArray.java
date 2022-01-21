package arrays;

import java.util.Scanner;

public class exercicioArray {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite quantas notas você deseja adicionar:");
		int quant = teclado.nextInt();
		
		double notas[] = new double [quant];
		double total = 0;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i+1));
			double nota = teclado.nextDouble();
			notas[i] = nota;
			total += nota;
		}
		System.out.println(total / notas.length);

	}

}
