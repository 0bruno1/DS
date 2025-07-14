import java.util.Scanner;
public class NovoVelho {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int id1,id2,id3,id4,id5,idvelho,idnovo;
        String n1,n2,n3,n4,n5,nomevelho,nomenovo;
        System.out.println("Insira o nome da primeira pessoa: ");
        n1 = ler.next();
        System.out.println("Insira a idade da primeira pessoa");
        id1 = ler.nextInt();
        System.out.println("Insira o nome da segunda pessoa: ");
        n2 = ler.next();
        System.out.println("Insira a idade da segunda pessoa");
        id2 = ler.nextInt();
        System.out.println("Insira o nome da terceira pessoa: ");
        n3 = ler.next();
        System.out.println("Insira a idade da terceira pessoa");
        id3 = ler.nextInt();
        System.out.println("Insira o nome da quarta pessoa: ");
        n4 = ler.next();
        System.out.println("Insira a idade da quarta pessoa");
        id4 = ler.nextInt();
        System.out.println("Insira o nome da quinta pessoa: ");
        n5 = ler.next();
        System.out.println("Insira a idade da quinta pessoa");
        id5 
        = ler.nextInt();
        idvelho=id1;
        nomevelho=n1;
        idnovo=id1;
        nomenovo=n1;
        if(id2<idvelho) {
        	idnovo=id2;
        	nomenovo=n2;
        }
        else if(id2>idvelho){
        	idvelho=id2;
        	nomevelho=n2;
        }
        else if(id3<idvelho) {
        	idnovo=id3;
        	nomenovo=n3;
        }
        else if(id3>idvelho) {
        	idvelho=id3;
        	nomevelho=n3;
        }
        else if(id4<idvelho) {
        	idnovo=id3;
        	nomenovo=n3;
        }
        else if(id4>idvelho) {
        	idvelho=id4;
        	nomenovo=n4;
        }
        else if(id5<idvelho) {
        	idnovo=id5;
        	nomenovo=n5;
        }
        else if(id5>idvelho){
        	idvelho=id5;
        	nomevelho=n5;
        }
        System.out.println("Esta é a pessoa mais nova"+" com "+idnovo+" anos "+" e se chama: "+nomenovo);
        System.out.println("Esta é a pessoa mais velha"+" com "+idvelho+" anos "+" e se chama: "+nomevelho);
        ler.close();
    }

}

