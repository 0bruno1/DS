import java.util.Scanner;
public class produto {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		 double precoinicial,precofinal,cupom;
		 //ler o preço inicial
		 System.out.println("Coloque o preço inicial do produto: ");
		 precoinicial = ler.nextDouble();
		 //ler o desconto do cupom
		 System.out.println("Coloque o desconto que sera aplicado pelo cupom: ");
		 cupom = ler.nextDouble();
		 //calcular o preço após o cupom
		 precofinal = (precoinicial*cupom)/100;
		 precofinal = precoinicial-precofinal;
		 System.out.println("O preço apoós o cupom será: " + precofinal + " Reais.");
		 ler.close();
		
	}
		
}
	
