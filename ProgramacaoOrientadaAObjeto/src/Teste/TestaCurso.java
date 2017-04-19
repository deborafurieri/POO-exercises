package Teste;

import java.util.List;
import java.util.Set;
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

	    curso.adicionaAluno(new Aluno("joao", 21, "30552412"));
	    curso.adicionaAluno(new Aluno("maria", 18, "99999999"));
	    
	    System.out.println("\tLista de Alunos\t");
	    Set<Aluno> alunos = curso.getAluno();
	 	System.out.println(alunos);
	 	
	 	System.out.println("\tLista de Aulas\t");
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println("\tSobre o Curso\t");
		System.out.println(curso);
	}
}
