import java.util.Scanner;
public class Carro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numpl;
		System.out.println("Insira o ultimo numero da placa de seu carro: ");
		numpl = ler.nextInt();
			switch(numpl){
			case 1:
			case 2:
				System.out.println("Seu carro não pode rodar segunda");
				break;
			case 3:
			case 4:
				System.out.println("Seu carro não pode rodar terça");
				break;
			case 5:
			case 6:
				System.out.println("Seu carro não pode rodar quarta");
				break;
			case 7:
			case 8:
				System.out.println("Seu carro não pode rodarquinta");
				break;
			case 9:
			case 0:
				System.out.println("Seu carro não pode rodar sexta");
				break;
			default:
				System.out.println("Ultimo valor inválido.");
			}
		ler.close();
	}

}
