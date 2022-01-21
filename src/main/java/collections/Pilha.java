package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		// Add epush adicionam, porem se não houver espaço na pilha add não add e push retorna false
		livros.add("Harry Potter");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		//Pega o ultimo elemento
		livros.peek();  // pega o ultimo elemento, se não houver retorna null 
		livros.element();// Se não houver elementos retorna um erro 
		
		//remove o ultimo elemento
		livros.poll(); //Se não houver elementos retorna null
		livros.remove();//Se não houver elementos retorna um erro
		livros.pop(); //Se não houver elementos retorna um erro
		
		//outros comportamentos são iguais aos outros;
		

	}

}
