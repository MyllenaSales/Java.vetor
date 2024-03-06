package questao3;

public class RegraEmpresa {
	
	Empresa[] em = new Empresa[2];
	
	int i =0;
	
	public void regraEmpresa(Empresa empresa) {
		
		if(i<em.length) {
			
			em[i] = empresa;
			
			i++;
			
		}

	}
	
	public Empresa[] dadosEmpresa() {
		return em;
	}

}
