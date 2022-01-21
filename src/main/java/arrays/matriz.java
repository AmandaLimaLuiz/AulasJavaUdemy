package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantos alunos: ");
		int quantAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas por aluno: ");
		int quantNotas = entrada.nextInt();
		
		double notasDaTurma [][] = new double [quantAlunos] [quantNotas];
		double total = 0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ", (j+1),(i+1));
				notasDaTurma[i][j] = entrada.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		double media = total / (quantAlunos * quantNotas);
		System.out.println("Media da turma é: " + media);
		
		for (double notasDoAluno []: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		entrada.close();
		
	}

}
