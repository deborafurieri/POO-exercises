package divida;

public class DividaImpl {

	public static void main(String[] args) {
		Pagamento pagamento1 = new Pagamento();
		pagamento1.setValor(500.0);
		pagamento1.setCnpjPagador("00.000.000/0002-02");
		pagamento1.setPagador("Empresa Pagadora");

		new BalancoEmpresa().pagaDivida("00.000.000/0001-01", pagamento1);
		System.out.println("Nome do Pagador: " + pagamento1.getPagador() + "\nCNJP do Pagador: "
				+ pagamento1.getCnpjPagador() + "\nValor Pago: " + pagamento1.getValor());

	}
}
