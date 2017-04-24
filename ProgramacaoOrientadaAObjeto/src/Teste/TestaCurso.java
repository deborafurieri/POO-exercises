package Teste;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class TestaCurso {

	public static void main(String[] args) {

		Curso curso = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		curso.adiciona(new Aula("Primeira Aula", 21));
		curso.adiciona(new Aula("Segunda Aula", 20));
		curso.adiciona(new Aula("Terceira Aula", 24));
		curso.adiciona(new Aula("Quarta Aula", 10));

		List<Aula> aulasImutaveis = curso.getAulas();

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Aluno a1 = new Aluno("Joao", 21, 1234, 27, 30552412);
		Aluno a2 = new Aluno("Maria", 18, 1235, 27, 99999999);
		Aluno a3 = new Aluno("Jose", 15,1236, 27, 99988888);
		Aluno a4 = new Aluno("Pedro", 16, 1237,27, 99977777);
		
	    curso.adicionaAluno(a1);
	    curso.adicionaAluno(a2);
	    curso.adicionaAluno(a3);
	    curso.adicionaAluno(a4);
	    
	    System.out.println("\tLista de Alunos\t");
	    for (Aluno aluno : curso.getAluno()) {
		    System.out.println(aluno);
		}
	    
	 	System.out.println("\n\tLista de Aulas\t");
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println("\n\tSobre o Curso\t");
		System.out.println(curso);
		
		System.out.println("O aluno " + a1.getNome() + " está matriculado?");
		System.out.println(curso.estaMatriculado(a1));
	}
}
