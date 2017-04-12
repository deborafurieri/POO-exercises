package banco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class BancoImpl {
	public static void main(String[] args) {

		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		ContaCorrente c1 = new ContaCorrente();
		ContaCorrente c2 = new ContaCorrente();
		ContaCorrente c3 = new ContaCorrente();
		
		c1.setNome(JOptionPane.showInputDialog("Entre com seu nome"));
		c1.setNumero(JOptionPane.showInputDialog("Entre com o numero de sua Conta Corrente"));
		
		c2.setNome(JOptionPane.showInputDialog("Entre com seu nome"));
		c2.setNumero(JOptionPane.showInputDialog("Entre com o numero de sua Conta Corrente"));
		
		c3.setNome(JOptionPane.showInputDialog("Entre com seu nome"));
		c3.setNumero(JOptionPane.showInputDialog("Entre com o numero de sua Conta Corrente"));
		
		c1.setLimite(1000);
		c2.setLimite(2000);
		c3.setLimite(3000);

		c1.setSaldo(2000);
		c2.setSaldo(1000);
		c3.setSaldo(3000);

		c1.transferencia(c2, 200);

		c1.saque(300);
		c2.saque(100);
		c3.saque(50);

		c1.deposito(35);
		c2.deposito(25);
		c3.deposito(15);

		contas.add(c1);
		contas.add(c2);
		contas.add(c3);

		// imprimir da lista de contas correntes o saldo total de todas as
		// contas;
		for (Iterator<ContaCorrente> iter = contas.iterator(); iter.hasNext();) {
			
			ContaCorrente c = iter.next();
			System.out.println("\tEXTRATO\t");
			System.out.println("Numero da Conta : " + c.getNumero());
			System.out.println("Saldo Atual: " + c.getSaldo() + "\n");
		}
	}
}
