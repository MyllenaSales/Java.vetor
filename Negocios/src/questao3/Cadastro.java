package questao3;

import java.util.Arrays;

public class Cadastro {
	public static void main(String[] args) {
		
		
		Empresa em1 = new Empresa();
		em1.setNome("Limoeiro");
		em1.setCnpj("10090807");
		em1.setTelefone("75 988102030");
		
		Empresa em2 = new Empresa();
		em2.setNome("Laranja Lima");
		em2.setCnpj("222333444");
		em2.setTelefone("75 988203040");
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Magali");
		f1.setCpf("222.333.444-05");
		f1.setRg("111.222.333/02");
		f1.setTelefone("4002-8922");
		f1.setEmpresa(em1);
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Mônica");
		f2.setCpf("123.456.789-01");
		f2.setRg("343.242.444/05");
		f2.setTelefone("5003-8933");
		f2.setEmpresa(em2);
		
		RegraEmpresa r1 = new RegraEmpresa();
		r1.regraEmpresa(em1);
		r1.regraEmpresa(em2);
		
		RegraFuncionario r2 = new RegraFuncionario();
		r2.regraFuncionario(f1);
		r2.regraFuncionario(f2);
		
		System.out.println(Arrays.toString(r2.dadosFuncionario()));
		System.out.println(Arrays.toString(r1.dadosEmpresa()));
	}

}
