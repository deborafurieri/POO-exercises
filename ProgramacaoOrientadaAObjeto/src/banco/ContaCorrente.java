package banco;

public class ContaCorrente {
	protected String nome;
	protected String numero;
	private double limite;
	boolean status;
	private double saldo;

	
	public void saque(double valor) {

		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente");
		} else {
			this.saldo -= valor;
			System.out.println("Sacado: " + valor);
		}
		System.out.println("Novo saldo: " + this.saldo + "\n");
	}

	public void deposito(double deposito) {
		if (deposito <= 0) {
			throw new IllegalArgumentException("Valor precisa ser maior que 0");
		} else {
			this.saldo += deposito;
			// System.out.println("Depositado: " + deposito);
			// System.out.println("Novo saldo: " + this.saldo + "\n");
		}
	}

	public void transferencia(ContaCorrente c, double valor) {
		this.saque(valor);
		c.deposito(valor);
		System.out.println("\tDados da Transferencia\t");
		System.out.println("Transferido: " + valor);
		System.out.println("Novo saldo: " + c.getSaldo() + "\n");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}


	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
