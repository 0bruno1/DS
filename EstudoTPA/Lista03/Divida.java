import java.util.Scanner;
public class Divida {
   public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double salario,divida,renda;
	System.out.println("Coloque o Salário: ");
	salario = ler.nextDouble();
	System.out.println("Coloque o total de dividas: ");
	divida = ler.nextDouble();
	renda = salario-divida;
	System.out.println("Esta será sua renda apos o pagamento: " + renda + " Reais.");
	if(renda<0) {
		System.out.println("Terá um prejuizo de: " + renda);
	}
	else {
		System.out.println("sua renda sera suficiente e sobrará: " + renda );
	}
	ler.close();
}

}
