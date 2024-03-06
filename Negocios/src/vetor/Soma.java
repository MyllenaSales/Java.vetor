package vetor;
public class Soma {
	
    Double[] numeros = new Double[10];
    Double soma = 0.0;

	public Soma() {
		
	}


	public Soma(Double[] numeros, Double soma) {
		super();
		this.numeros = numeros;
		this.soma = soma;
	}


	public Double[] getNumeros() {
		return numeros;
	}


	public void setNumeros(Double[] numeros) {
		this.numeros = numeros;
	}


	public Double getSoma() {
		return soma;
	}


	public void setSoma(Double soma) {
		this.soma = soma;
	}


	public void soma() {
		
		for(Double valores: numeros) {
			soma = soma + valores;
		}
		System.out.println("A soma total dos valores é: "+soma);
	}

}

