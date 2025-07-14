import java.util.Scanner;
public class Idade {
	 public static void main(String[] args) {
	     Scanner ler = new Scanner(System.in);
	     int aa,an,idade;
	     System.out.println("Insira o ano atual: ");
	     aa = ler.nextInt();
	     System.out.println("Insira o seu ano de nascimento: ");
	     an = ler.nextInt();
	     idade = aa - an;
	     System.out.println("Esta é sua idade atual: " + idade);
	     if(idade<10) {
	    	 	System.out.println("Criança");
	        }
	     else if(idade<18) {
	    	 	System.out.println("Adolescente");

	        }
	     else if(idade<60) {
	            System.out.println("Adulto");
	        }
	     else if(idade >= 60) {
	            System.out.println("Idoso");
	        }
	        ler.close();
	    }

}

