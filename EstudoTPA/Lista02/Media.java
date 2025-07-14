import java.util.Scanner;
public class Media {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int num1,num2,num3;
		double media;
		//ler o num1
		System.out.println("Coloque o primeiro numero.");
		num1 = ler.nextInt();
		//ler o num2
		System.out.println("Coloque o segundo numero");
		num2 = ler.nextInt();
		//leia o num3
		System.out.println("Coloque o terceiro numero");
		num3 = ler.nextInt();
		//calcule a media dos tres itens
		media = (num1*num1)+(num2*num2)+(num3*num3)/3;
		System.out.println("esta será a média dos tres itens:  " + media);
		
		ler.close();
	}

}
