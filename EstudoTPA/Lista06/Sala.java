import java.util.Scanner;	
public class Sala {
	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		int alunos;
		int mb,b,r,i;
		float porcentagem;
		String escolha;
		System.out.println("Quantos alunos tem no total na sala??");
		alunos = jc.nextInt();
		System.out.println("Escolha a nota para verificar a % dos alunos, escolha entre: MB,M,R e I");
		escolha = jc.next();
		switch(escolha) {
		case "MB":
			System.out.println("Quantos alunos tiraram MB?");
			mb = jc.nextInt();
			porcentagem = (alunos/mb)*100;
			System.out.println("Os alunos que tiraram MB representa:"+porcentagem+"% da sala");
			break;
		case "B":
			System.out.println("Quantos alunos tiraram B?");
			b = jc.nextInt();
			porcentagem = (alunos/b)*100;
			System.out.println("Os alunos que tiraram B representam:"+porcentagem+"% da sala");
			break;
		case "r":
			System.out.println("Quantos alunos tiraram R?");
			r = jc.nextInt();
			porcentagem = (alunos/r)*100;
			System.out.println("Os alunos que tiraram R representa:"+porcentagem+"% da sala");
			break;
		case "I":
			System.out.println("Quantos alunos tiraram I?");
			i = jc.nextInt();
			porcentagem = (alunos/i)*100;
			System.out.println("Os alunos que tiraram MB representa:"+porcentagem+"% da sala");
			break;
			}
		jc.close();
	}

}
