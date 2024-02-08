package com.gerenciamento.escolar;

import java.util.ArrayList;
import java.util.List;

public class DIsciplina extends Aluno {
	private String disciplina;
	private int codigodisciplina;
	private String professorresponsavel;
	private ArrayList<String> alunosmatriculados =  new ArrayList<String>();
    private ArrayList<Integer> matriculaalunos = new ArrayList<Integer>();

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getCodigodisciplina() {
		return codigodisciplina;
	}

	public void setCodigodisciplina(int codigodisciplina) {
		this.codigodisciplina = codigodisciplina;
	}

	public String getProfessorresponsavel() {
		return professorresponsavel;
	}

	public void setProfessorresponsavel(String professorresponsavel) {
		this.professorresponsavel = professorresponsavel;
	}

	public List<String> getAlunosmatriculados() {
		return alunosmatriculados;
	}

	public void setAlunosmatriculados(ArrayList<String> alunosmatriculados) {
		this.alunosmatriculados = alunosmatriculados;
	}
	
	   public ArrayList<Integer> getMatricula(ArrayList<Integer> matricula) {
		return matricula;
	}

	public void setMatricula(ArrayList<Integer> matricula) {
		this.matriculaalunos = matricula;
	}

	public void adicionarAlunos(String nome , int matricula) {
		   if(nome != null && matricula != 0 ) {
			   alunosmatriculados.add(nome);
			   matriculaalunos.add(matricula);
		   }
		   
	   }
	}