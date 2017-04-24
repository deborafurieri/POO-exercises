package Teste;

import java.util.HashMap;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private int idade;
	private int matricula;
	private int telefone;
	private int prefixo;

	public Aluno(String nome, int idade, int matricula, int prefixo, int telefone) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.telefone = telefone;
		this.prefixo = prefixo;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public int getTelefone() {
		return telefone;
	}

	@Override
	public String toString() {
		return "\nNome:" + this.nome + "\nIdade:" + this.idade + " anos\nTelefone: (" + this.prefixo + ") 	"
				+ this.telefone;
	}

	public Integer getMatricula() {
		return matricula;
	}

	@Override
	public int compareTo(Aluno o) {
		return 0;
	}
	private HashMap<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	public Aluno buscaMatriculado(int numero) {
	    return this.matriculaParaAluno.get(numero);
	}

}
