package Teste;

public class Aluno implements Comparable<Aluno>  {
	private String nome;
	private int idade;
	private String telefone;
	
	public Aluno(String nome, int idade, String telefone){
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}


	public int getIdade() {
		return idade;
	}


	public String getTelefone() {
		return telefone;
	}

	@Override
	public String toString() {
		return "\nNome:" + this.nome + "\nIdade:" + this.idade + "\nTelefone: " + this.telefone;
	}

	@Override
	public int compareTo(Aluno o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
