package questao3;

public class RegraFuncionario {
	
	Funcionario[] f = new Funcionario[2];
	
	public void regraFuncionario(Funcionario funcionarios) {
		
		for(int i=0;i<f.length;i++) {
			f[i] = funcionarios;
		}
	}
	
	public Funcionario[] dadosFuncionario() {
		return f;
	}

}
