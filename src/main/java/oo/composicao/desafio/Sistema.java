package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {

		
		
		Compra compra1 = new Compra();
		compra1.adicionaItem("caneta", 9.67, 100);
		compra1.adicionaItem("caderno", 15.50, 5);
		
		Compra compra2 = new Compra();
		compra2.adicionaItem("lapis", 1.25, 50);
		compra2.adicionaItem(new Produto("borracha", 2.68), 10);
		
		Cliente cliente = new Cliente("Maria Joana");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
		
	}

}
