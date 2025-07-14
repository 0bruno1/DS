import java.util.Scanner;
public class Meses {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String mes;
		System.out.println("Coloque o nome de um mês para ver em qual dia acaba: ");
		mes = ler.next();
		switch(mes) {
		case "Janeiro":
		case "Março":
		case "Maio":
		case "julho":
		case "Setembro":
		case "Outubro":
		case "Dezembro":
			System.out.println("Este mês acaba no dia 31.");
			break;
		case "Abril":
		case "junho":
		case "Agosto":
		case "Novembro":
			System.out.println("Este mês caba no dia 30.");
			break;
		case "Fevereiro":
			System.out.println("O mês de Fevereiro é o unico que acaba no dia 28, em anos bissextos acaba no dia 29");
			default :
				System.out.println("Este mês não existe no calendário.");
		}
			
	}
}
