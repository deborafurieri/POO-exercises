package banco;

public class Banco {

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
		c.saldo += valor;
		System.out.println("\tDados da Transferencia\t");
		System.out.println("Transferido: " + valor);
		System.out.println("Novo saldo: " + c.saldo + "\n");
	}

}