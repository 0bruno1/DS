import java.util.Scanner;
public class numerovizinho {
	public static void main(String args []) {
		Scanner ler = new Scanner(System.in);
		int numero;
		//ler o número
		System.out.println("Coloque o número");
		numero = ler.nextInt();
		//calcular o antecessor
		numero = numero - 1;
		System.out.println("o antecessor será: " + numero);
		//calcular o sucessor
		numero = numero + 2;
		System.out.println("O sucessor será: " + numero);
		ler.close();
	}

}
