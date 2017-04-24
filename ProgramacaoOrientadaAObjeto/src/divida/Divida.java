package divida;

import java.util.ArrayList;

public class Divida {
	private double valorTotal;
	private double valorPago;
	private String nomeCredor;
	private String cnpjCredor;
	private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	public ArrayList<Pagamento> getPagamentos() {
		return this.pagamentos;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorPago() {
		return valorPago;
	}

	public String getNomeCredor() {
		return nomeCredor;
	}

	public void setNomeCredor(String nomeCredor) {
		this.nomeCredor = nomeCredor;
	}

	public String getCnpjCredor() {
		return cnpjCredor;
	}

	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public double paga(double valor) {
		return this.valorPago += valor;
	}

	public void registra(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		this.paga(pagamento.getValor());
	}

	public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this.pagamentos) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this.pagamentos) {
			if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
}