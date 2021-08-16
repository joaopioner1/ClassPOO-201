package model.entities;

import model.exception.InvalidNota;

public class Estudante {

	private String nome;
	private Integer idade;
	private Double[] nota = new Double[3];

	//CONSTRUTORES
	public Estudante() {
	}
	
	public Estudante(String nome, Integer idade) {
		setIdade(idade);
		setNome(nome);
	}
	
	public Estudante(String nome, Integer idade, Double[] nota) {
		setNome(nome);
		setIdade(idade);
		setNota(nota);
	}

	//GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double[] getNota() {
		return nota;
	}

	public void setNota(Double[] nota) {
		for (int i = 0; i < 3; i++) {
			if (nota[i] <= 10) {
				this.nota = nota;
			} else {
				throw new InvalidNota("Impossivel setar tal nota, deve ser menor que 10");
			}
		}

	}

}
