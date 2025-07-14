import java.util.Scanner;
public class Imc {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double p,a,imc;
		System.out.println("coloque seu peso: ");
		p = ler.nextDouble();
		System.out.println("Coloque sua altura: ");
		a = ler.nextDouble();
		imc = p/(a*a);
		System.out.println("Este será seu IMC: " + imc);
		if(imc<18.5) {
			System.out.println("Excesso de magreza");		
		}
		else if(imc<25) {
			System.out.println("peso normal");
		}
		else if(imc<30) {
			System.out.println("Excesso de peso");
		}
		else if(imc<35) {
			System.out.println("Obesidade grau I");
		}
		else if(imc<40) {
			System.out.println("Obesidade grau II");
		}
		else if(imc>40) {
			System.out.println("Obesidade grau III");
		}
		ler.close();
	}

}
