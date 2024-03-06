package vetor;
import java.util.Scanner;
public class Questao1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		OrdemAlfabetica nome = new OrdemAlfabetica();
		
		for (int i=0; i< nome.getNomes().length;i++) {
			
			System.out.print("Digite o "+(i+1)+"° nome: ");
			nome.getNomes()[i]= input.nextLine();
			
		}
		
		nome.alfabeto();
		input.close();
	}

}
