package com.gerenciamento.escolar;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_notas")
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Nomes")
	private String Nome;
	@Column(name = "Matricula")
	private int matricula;
	@Column(name = "Notas")
	private ArrayList<Double> notas = new ArrayList<Double>();

	public double Media() {
		double n1 = 0, n2 = 0, n3 = 0, n4 = 0;
		double media = (n1 + n2 + n3 + n4) / 4;
		return media;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}

	public String ExibirInfos() {
		String exibirinfos;
		exibirinfos = "Infos dos alunos[";
		exibirinfos = "Nome: " + Nome;
		exibirinfos = "Matricula: " + matricula;
		exibirinfos = "Notas" + notas;
		return exibirinfos;
	}
	// ver uam forma de acessar e configurar o banco de dados(ver um video se
	// necessario).
}
