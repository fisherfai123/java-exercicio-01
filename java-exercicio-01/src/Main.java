import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int menor=0, maior=0, x, cont = 0;
		
		Scanner ler = new Scanner(System.in);
		
		while(cont < 4) {
		System.out.println("Insira o valor: ");
		x = ler.nextInt();
	    if (cont == 0) {
		maior = x;
		menor = x;
		}
		
		if(x > maior) maior = x;
		if(x < menor) menor = x;
		
		cont ++;		
		}
		if(maior > 50) System.out.println("Valor muito Alto!");
		else System.out.println("Valor normal!");
		
	}
}
