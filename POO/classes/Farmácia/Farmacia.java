package poo;
import java.util.Scanner;
public class Farmacia {
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		Remedio re1 = new Remedio();
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do funcionario: ");
		func1.nome = ler.next();
		System.out.println("Digite o RG do funcionario: ");
		func1.rg = ler.next();
		System.out.println("Digite o Telefone do funcionario: ");
		func1.tel = ler.next();
		System.out.println("Digite o nome do funcionario: ");
		func1.dataDeNascimento = ler.next();
		
		System.out.println("insira o nome do remedio: ");
		re1.nome = ler.next();
		System.out.println("insira o nome do remedio: ");
		re1.desc = ler.next();
		System.out.println("insira o nome do remedio: ");
		re1.estoque = ler.nextInt();
		System.out.println("insira o nome do remedio: ");
		re1.preço = ler.nextDouble();
		ler.close();
	}
	
}
