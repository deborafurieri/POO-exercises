package banco;

import java.util.List;

public class Banco {

	private List<ContaCorrente> contas;
	
	public void adicionaConta(ContaCorrente c){
		contas.add(c);
		
	} 
	public  List<ContaCorrente> getContas(){
		return contas;
	}

}