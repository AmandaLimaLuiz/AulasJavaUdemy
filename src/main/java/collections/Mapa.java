package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//percorre por chave ou valor
public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//adiciona ou substitui
		usuarios.put(1, "Rob");
		usuarios.put(2, "Cris");
		usuarios.put(30, "Bia");
		usuarios.put(4, "Mel");
		
		//não pega ordenado
		System.out.println(usuarios.keySet()); //[1, 2, 4, 30]
		System.out.println(usuarios.values()); //[Rob, Cris, Mel, Bia]
		System.out.println(usuarios.entrySet()); //[1=Rob, 2=Cris, 4=Mel, 30=Bia]
		System.out.println(usuarios.containsKey(2)); //true
		System.out.println(usuarios.containsValue("Rob")); //true
		System.out.println(usuarios.get(4)); //Mel
		
		//Percorrer
		
		for(int chave: usuarios.keySet()) {
			System.out.print(chave + " ");
			//1 2 4 30 
		}
		for(String valor: usuarios.values()) {
			System.out.print(valor + " ");
			//Rob Cris Mel Bia  
		}
		for(Entry<Integer, String> reg: usuarios.entrySet()) {
			System.out.print(reg + " ");
			//1=Rob 2=Cris 4=Mel 30=Bia 
		}
		

	}

}
