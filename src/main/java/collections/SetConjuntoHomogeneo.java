package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetConjuntoHomogeneo {

	public static void main(String[] args) {
	//	Set<String> listaAprovados = new HashSet<>(); //Não respeita a ordem de inserção
		SortedSet<String> listaAprovados = new TreeSet<>(); //Respeita a ordem de inserção
		listaAprovados.add("Ana");
		listaAprovados.add("Pedro");
		listaAprovados.add("Carla");
		listaAprovados.add("Carlos");
		
		for(String candidatos: listaAprovados) {
			System.out.print(candidatos + " "); //Carla Ana Pedro Carlos = hashSet
												//Ana Carla Carlos Pedro  = treeSet
		}
		
		

	}

}
