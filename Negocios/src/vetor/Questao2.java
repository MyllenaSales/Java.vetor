package vetor;
import java.util.Scanner;

public class Questao2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Soma so = new Soma();
		
		for(int i = 0; i< so.getNumeros().length;i++) {
			System.out.print("Digite o "+(i+1)+"° número: ");
			so.getNumeros()[i] = input.nextDouble();
		}
		so.soma();
		input.close();
	}

}
