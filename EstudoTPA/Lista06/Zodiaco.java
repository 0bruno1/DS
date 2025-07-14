import java.util.Scanner;
public class Zodiaco {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		int dia,mes; 
		System.out.println("Insira o mês em que nasceu: ");
		mes = jc.nextInt();
		System.out.println("Insira o dia em que nasceu: ");
		dia = jc.nextInt();
			switch(mes) {
			case 1:
				if(dia<=22) {
					System.out.println("Seu signo é Capricornio");
				}
				else {
					System.out.println("Seu signo é Aquario");
				}
				break;
			case 2:
				if(dia<=20) {
					System.out.println("Seu signo é Capricornio");
				}
				else {
					System.out.println("Peixes");
				}
				break;
			case 3:
				if(dia <= 21) {
					System.out.println("Peixes");
				}
				else {
					System.out.println("Aries");
				}
				break;
			case 4:
				if(dia <= 21) {
					System.out.println("Aries");
				}
				else {
					System.out.println("Touro");
				}
				break;
			case 5:
				if(dia <= 20) {
					System.out.println("Touro");
				}
				else {
					System.out.println("Gêmeos");
				}
				break;
			case 6:
				if(dia <= 20) {
					System.out.println("Gêmeos");
				}
				else {
					System.out.println("Cancêr");
				}
			case 7:
				if(dia <= 21) {
					System.out.println("Cancêr");
				}
				else {
					System.out.println("Leão");
					break;
				}
			case 8:
				if(dia <= 22) {
					System.out.println("Leão");
				}
				else {
					System.out.println("Virgem");
				}
			case 9:
				if(dia <= 23) {
					System.out.println("Virgem");
				}
				else {
					System.out.println("Libra");
				}
				break;
			case 10:
				if(dia <= 22) {
					System.out.println("Libra");
				}
				else {
					System.out.println("Escorpeão");
				}
				break;
			case 11:
				if(dia <= 23) {
					System.out.println("Escorpeão");
				}
				else {
					System.out.println("Sargitário");
				}
				break;
			case 12:
				if(dia <= 21) {
					System.out.println("Sargitário");
				}
				else {
					System.out.println("Capricornio");
				}
			}
			jc.close();
	}
}