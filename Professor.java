package com.gerenciamento.escolar;

public class Professor {
    private String Nome;
    private int Nregistro;
    private String disciplina;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getNregistro() {
		return Nregistro;
	}
	public void setNregistro(int nregistro) {
		Nregistro = nregistro;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
    
    public String infoProfessor() {
    	String infop;
    	infop = "Infomações do professor[";
    	infop = "Nome: " + Nome;
    	infop = "Numero de registro: " + Nregistro; 
    	infop = "Disciplina: " + disciplina;
    	return infop;
    }
}
