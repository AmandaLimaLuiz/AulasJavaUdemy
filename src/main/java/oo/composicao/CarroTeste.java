package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		c.ligar();
		
		System.out.println(c.estaLigado()); //true
		System.out.println(c.motor.giros()); //3000
		c.acelerar();
		c.acelerar();
		System.out.println(c.motor.giros());//5400
		c.frear();
		System.out.println(c.motor.giros());//4200
		
	}

}
