package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//offer e add adicionam elementos na fila
		fila.add("Anna");  // não add se não tiver espaço na fila
		fila.offer("Bia"); //retorna false caso não consiga add
		fila.offer("Gui"); 
		fila.offer("Teo"); 
		fila.offer("Sam"); 
		
		//pegar elemento na fila
		System.out.println(fila.peek()); //Anna => pega o primeiro elemento, se não houver retorna null
		System.out.println(fila.element());//Anna =>  pega o primeiro elemento, se não houver retorna um erro
		
		fila.size(); // retorna o tamanho
	//	fila.clear(); // limpa a fila
		fila.isEmpty(); // retorna se está vazio
		fila.poll(); //remove o primeiro elemento da fila => Se não houver elementos retorna null
		fila.remove(); //remove o primeiro elemento da fila =>  Se não houver elementos retorna um erro
		fila.contains("Teo"); //return true ou false
		
		
		
		
		
		
	}

}
