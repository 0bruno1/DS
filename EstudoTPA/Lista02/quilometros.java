import java.util.Scanner;
public class quilometros {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double metros,quilometros;
		//ler os metros
		System.out.println("Coloque a quantidade de metros.");
		metros = ler.nextDouble();
		//calcular metros em quilometros
		quilometros = metros/1000;
		System.out.println("a quantidade de metros em quilometros é: " + quilometros );		
		ler.close();
		
	}

}
