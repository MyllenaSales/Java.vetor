package vetor;

import java.util.Arrays;

public class OrdemAlfabetica {
	
	String[] nomes = new String[10];
		
	public OrdemAlfabetica() {
		
	}


	public OrdemAlfabetica(String[] nomes) {
		super();
		this.nomes = nomes;
	}


	public String[] getNomes() {
		return nomes;
	}


	public void setNomes(String[] nomes) {
		this.nomes = nomes;
	}


	public void alfabeto() {
		
		Arrays.sort(nomes);
		
		System.out.println("Nomes em ordem alfabetica: ");
		for(String nome: nomes) {
			System.out.println(nome);
			
		}
	}

}
