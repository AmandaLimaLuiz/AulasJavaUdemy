package desafioModulo;

public class DesafioModuloClasseMetodo {
//Classe pessoa = nome, pessoa
	// metodo comer  = recebe objeto da classe comida
//Classe comida = nome da comida, peso
	// acrescentar o peso da comida ao peso da pessoa.
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.300);
		Comida c2 = new Comida("Feijão", 0.500);
			
		
		Pessoa p = new Pessoa("Joana", 60.1);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
	}

}
