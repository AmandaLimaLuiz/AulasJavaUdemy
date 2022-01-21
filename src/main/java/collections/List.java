package collections;

import java.util.ArrayList;

//Estrutura ordenada

public class List {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Luiz"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Sam"));
		lista.add(new Usuario("Sam"));
		
		for(Usuario u: lista) {
			System.out.print(u.nome + " "); //Ana Luiz Bia Sam 
		}
		
		//Acessar pelo indice
		System.out.println(lista.get(2).nome); //Bia //Se o objeto não tiver o toString
		System.out.println(lista.get(3)); //O nome é: Sam //Se o objeto  tiver o toString
		
		//list pode ser removido tanto pelo indice quanto pelo objeto
		lista.remove(1);
		lista.remove(new Usuario("Sam"));

	}

}
