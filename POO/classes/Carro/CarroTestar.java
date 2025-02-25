package poo;

public class CarroTestar {
	public static void main(String[] args) {
		carro c1 = new carro();
		c1.nome = "Uno";
		c1.marca = "Fiat";
		c1.fabricacaoano = 2015;
		c1.vel = 60;
		c1.acelerar(10);
		System.out.println("Velocidade: " + c1.vel + "Km/h");
		c1.freiar(30);
		System.out.println("Velocidade: " + c1.vel + "Km/h");
		}
}
