import java.util.Scanner;
public class Futebol {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Insira a idade do aluno");
		idade = ler.nextInt();
		switch (idade) {
		case 6:
			System.out.println("Este aluno tem: "+idade+" Anos, portanto sua catégoria é: Dente de leite");
			break;
		case 7:
			System.out.println("Este aluno tem: "+idade+" Anos, portanto sua catégoria é: junior ");
			break;
		case 8:
			System.out.println("Junior max");
		case 9:
			System.out.println("Este aluno tem: "+idade+" Anos, portanto sua catégoria é: Junior master");
			break;
		case 10:
			System.out.println("Este aluno tem: " + idade + "Anos, portanto sua catégoria é:  master ");
			break;
			default:
				System.out.println("Este aluno não possui uma categoria");
		}
		ler.close();
	}

}
