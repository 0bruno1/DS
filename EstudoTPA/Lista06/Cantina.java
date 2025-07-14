import java.util.Scanner;
public class Cantina {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numlanche;
		System.out.println("O cardapio de lanches de hoje esta abaixo, insira o numero do lanche de sua escolha.");
		System.out.println("1 para um Cachorro quente por R$8.00");
		System.out.println("2 para um Cheese burguer por R$12.00");
		System.out.println("3 para um X-salad por R$15.00");
		System.out.println("4 para um misto quente por R$11.00");
		System.out.println("5 para um pão na chapa por R$11.00");
		System.out.println("Escolha o numero para o respectivo lanche e seu preço: ");
		numlanche = ler.nextInt();
		switch(numlanche) {
		case 1:
			System.out.println("Você escolheu um Cachorro quente por R$8.00");
			break;
		case 2:
			System.out.println("Você escolheu um Cheese burguer por R$12.00");
			break;
		case 3:
			System.out.println("Você escolheu um X-salada por R$15.00");
			break;
		case 4:
			System.out.println("Você escolheu um misto quente por R$11.00");
			break;
		case 5:
			System.out.println("Você escolheu um pão na chapa por R$6.00");
			break;
			default:
				System.out.println("Insira um numero valido de 1-5.");
		}
		ler.close();
	}
}
