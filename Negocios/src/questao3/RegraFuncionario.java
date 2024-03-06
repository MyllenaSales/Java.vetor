package questao3;

public class RegraFuncionario {
	
	Funcionario[] f = new Funcionario[2];
	
	int i =0;
	
	public void regraFuncionario(Funcionario funcionarios) {
			f[i] = funcionarios;
			
			i++;
	
	}
	
	public Funcionario[] dadosFuncionario() {
		return f;
	}

}
