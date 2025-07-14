import java.util.Scanner;
public class Carro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		  double km,l,gm;
		  System.out.println("Digite a distancia que o carro se moveu: ");
		  km = ler.nextDouble();
		  System.out.println("Digite a capacidade total de combustivel: ");
		  l = ler.nextDouble();
		  gm = km/l;
		  System.out.println("Este será o seu gasto médio: " + gm + "Km/L");
		  
		  if(gm>=10) {
			  System.out.println("Econômico");
		  }
		  else {
			  System.out.println("Não econômico");
		  }
		  ler.close();
	}
}
