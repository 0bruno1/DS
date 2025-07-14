import java.util.Scanner;
public class irpf {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double sf,irpf;
		System.out.println("Insira seu Salário: ");
		sf = ler.nextDouble();
		if(sf<=1434.59) {
			System.out.println("Sem desconto do irpf.");
		}
		else if(sf<=2150) {
			irpf = (sf * 7.5)/100;
			System.out.println("O desconto do irpf será de: " + irpf + " Reais");
		}
		else if(sf<=2866.70) {
			irpf = (sf * 15)/100;
			System.out.println("O desconto do irpf será de: " + irpf + " Reais");
		}
		else if(sf<=3582) {
			irpf = (sf * 22.5)/100;
			System.out.println("O desconto do irpf será de: " + irpf + " Reais");
		}
		else if(sf>3582){
			irpf = (sf * 27.5)/100;
			System.out.println("O desconto do irpf será de: " + irpf + " Reais");
		}
		ler.close();	                     
	}

}
