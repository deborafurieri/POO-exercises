package Teste;

import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;


public class Curso {	

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<Aluno>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}


	public Set<Aluno> getAluno() {
		return Collections.unmodifiableSet(alunos); 
	}
	
	private HashMap<Integer, Aluno> matriculaParaAluno = new HashMap<>();
    
	public void adicionaAluno(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}
	@Override
	    public String toString() {
	       return "Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()+ " minutos,\n"
	       		+ "Aulas inclusas: "+ this.getAulas();
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	@Override
	public int hashCode(){
	    return this.nome.hashCode();
	}
	
}