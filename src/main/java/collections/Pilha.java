package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		// Add epush adicionam, porem se n�o houver espa�o na pilha add n�o add e push retorna false
		livros.add("Harry Potter");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		//Pega o ultimo elemento
		livros.peek();  // pega o ultimo elemento, se n�o houver retorna null 
		livros.element();// Se n�o houver elementos retorna um erro 
		
		//remove o ultimo elemento
		livros.poll(); //Se n�o houver elementos retorna null
		livros.remove();//Se n�o houver elementos retorna um erro
		livros.pop(); //Se n�o houver elementos retorna um erro
		
		//outros comportamentos s�o iguais aos outros;
		

	}

}
