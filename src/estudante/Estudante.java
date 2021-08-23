package estudante;

public class Estudante {
	
	private String nome;
	private Double[] nota;
	private Integer idade;
	
	public Estudante() {
	}

	public Estudante(String nome, Double[] nota, Integer idade) {
		this.nome = nome;
		this.nota = nota;
		this.idade = idade;
	}

	public int fazAniver() {
		return idade + 1;
	}
	
	public double calcMedia(int i) {
		double media = 0;
		media += nota[i];
		return media / i;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double[] getNota() {
		return nota;
	}

	public void setNota(Double[] nota) {
		this.nota = nota;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
}
