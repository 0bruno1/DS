package poo;

public class carro {

	String nome;
	String marca;
	int fabricacaoano;
	int vel;

	void acelerar(int aceleracao) {
		 vel+=aceleracao;
	}
	void freiar(int freiar) {
		vel-=freiar;
	}
	void buzinar() {
		System.out.println("bibibi");
	}
}
