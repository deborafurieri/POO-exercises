package divida;

import java.util.HashMap;

public class BalancoEmpresa {
	private HashMap<String, Divida> dividas = new HashMap<String, Divida>();

	public void registraDivida(String cnpjCredor, String nomeCredor, double valorTotal) {
		Divida divida = new Divida();
		divida.setValorTotal(valorTotal);
		divida.setNomeCredor(nomeCredor);
		divida.setNomeCredor(cnpjCredor);
		dividas.put(cnpjCredor, divida);
	}

	public void pagaDivida(String cnpjCredor, Pagamento pagamento) {
		Divida divida = dividas.get(cnpjCredor);
		 if (divida != null) {
	            divida.registra(pagamento);
	          }
	}
}
