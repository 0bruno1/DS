import java.util.Scanner;
public class Salario {	
	public static void main(String args[]) {
	Scanner ler = new Scanner(System.in);
	double salarioinicial,salariofinal;
	int dependentes;
	System.out.println("Insira o Salário inicial");
	salarioinicial = ler.nextDouble();
	//leia o numero de dependentes
	System.out.println("Insira o número de dependentes");
	dependentes = ler.nextInt();
	//calcule o salario final
	salariofinal = salarioinicial + dependentes*55.00;
	System.out.println("este será seu salario final: " + salariofinal);
	ler.close();
	}

}
