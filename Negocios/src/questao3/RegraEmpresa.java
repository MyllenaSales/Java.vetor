package questao3;

public class RegraEmpresa {
	
	Empresa[] em = new Empresa[2];
	
	public void regraEmpresa(Empresa empresa) {
		
		
		for(int i=0;i<em.length;i++) {
			
			em[i] = empresa;
			
		}

	}
	
	public Empresa[] dadosEmpresa() {
		return em;
	}

}
