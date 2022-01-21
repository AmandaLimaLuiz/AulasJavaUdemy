package collections;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		HashSet<Usuario> users = new HashSet<Usuario>();
		
		users.add(new Usuario("Pedro"));
		users.add(new Usuario("Maria"));
		users.add(new Usuario("Joao"));
		
		System.out.println(users.contains(new Usuario("Joao")));

	}

}
