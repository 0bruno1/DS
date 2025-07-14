import java.util.Scanner;
public class Crescente { 
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a,b,c;
        System.out.println("Coloque o numero 1: ");
        a = ler.nextInt();
        System.out.println("Coloque o numero 2: ");
        b = ler.nextInt();
        System.out.println("Coloque o numero 3: ");
        c = ler.nextInt();
        if((a<=b)&&(b<=c)) {
        System.out.println("A ordem crescente é: " +a+ " | " +b+ " | " +c);
        }
        else if((a<=c)&&(c<=b)) {
        System.out.println("A ordem crescente é: " +a+" | "+c+" | "+b);
        }
        else if((c<=b)&&(b<=a) ) {
        System.out.println("A ordem crescente é:  "+c+ " | " +b+" | "+a);
        }
        else if((b<=c)&&(c<=a)) {
        System.out.println("A ordem crescente é: "+b+" | "+c+" | "+a);
        }
        else if((b<=a)&&(a<=c)) {
    	System.out.println("A ordem crescente é: "+b+" | "+a+" | " +c);
        }
        else if((c<=a)&&(a<=b)) {
        System.out.println("A ordem crescente é: "+c+" | "+a+" | " +b);
        }
        ler.close();
	}

}
