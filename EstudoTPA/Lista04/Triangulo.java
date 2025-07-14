import java.util.Scanner;
public class Triangulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a,b,c;
		System.out.println("Coloque a medida do lado a: ");
		a = ler.nextDouble();
		System.out.println("Coloque a medida do lado b: ");
		b = ler.nextDouble();
		System.out.println("Coloque a medida do lado c: ");
		c = ler.nextDouble();
		System.out.println("Esta é a medida do lado A : " + a);
		System.out.println("Esta é a medida do lado A : " + b);
		System.out.println("Esta é a medida do lado A : " + c);
		if(a>b+c){
		System.out.println("Triangulo Invalido");
		}
		else if(b>c+a) {
			System.out.println("Triangulo Invalido");
		}
		else if(c>b+a) {
			System.out.println("Triangulo Invalido");
		}
		else if(a==c && b==c){
			System.out.println("Triangulo valido");
			System.out.println("Equilatero.");
		}
		else if(a!=b && b!=c){
			System.out.println("Triangulo valido");
			System.out.println("Escaleno.");
		}
		else {
			System.out.println("Triangulo valido");
			System.out.println("Isoceles.");
		}
		ler.close();
	}
}
