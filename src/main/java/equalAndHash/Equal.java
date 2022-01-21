package equalAndHash;

public class Equal {

	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Pedro  Silva";
		u1.email = "pedrosilva@email.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro  Silva";
		u2.email = "pedrosilva@email.com";
		
		System.out.println(u1 == u2); //false
		System.out.println(u1.equals(u2)); //false antes de implementar o equal no objeto e true após a implementação.
	
	}

}
