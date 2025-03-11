package app;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		double num1,num2;
		String operacao;
		System.out.println("=====Calculadora Básica=====");
		System.out.println();
		System.out.println("Insira o primeiro numero da operação");
		num1 = ler.nextDouble();
		System.out.println("Insira o segundo numero da operação");
		num2 = ler.nextDouble();
		System.out.println("Escolha uma das seguintes operações: (| + | - | | x | | / |)");
		operacao = ler.next();
		switch(operacao){
		case "+":
			calc.somar(num1,num2);
			break;
		case "-":
			calc.subtrair(num1, num2);
			break;
		case "x":
			calc.multiplicar(num1, num2);
			break;
		case "/":
			calc.dividir(num1, num2);
			break;
		default :
			System.out.println("Operação invalida.");
		}
	}
}
