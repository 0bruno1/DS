package matriz;
import java.util.Scanner;
public class Cpf {
	public static void main(String []args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o seu cpf");
		String cpf = ler.nextLine().trim();
		if(!cpf.matches("//{11}")) {
			System.out.println("Insira um cpf Válido, Insira 11 numeros");
		}
		else {
			System.out.println("Seu cpf sera formatado desta maneira: " +cpf.substring(0,3)+"." + cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9,11));
		}
	ler.close();
	}
}
