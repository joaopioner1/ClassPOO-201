package livro;

public class Livro {

	private final String titulo;
	private final int paginasTotais;
	private int numeroPgLidas;
	
	public Livro() {
		this.titulo = "";
		this.paginasTotais = 0;
	}
	
	public Livro(String titulo, int paginasTotais, int numeroPgLidas) {
		this.titulo = titulo;
		this.numeroPgLidas = numeroPgLidas;
		this.paginasTotais = paginasTotais;
	}
	
	public int recomeca() {
		return numeroPgLidas = 1;
	}
	
	public boolean ler(int pagina) {
		if (numeroPgLidas + pagina <= paginasTotais) {
			numeroPgLidas += pagina;
			return false;
		}
		else {
			return true;
		}
	}

	public String getTitulo() {
		if (this.titulo.equals("")) {
			return "No title available";
		} else {
			return titulo;
		}
	}

	public int getPaginasTotais() {
		return paginasTotais;
	}

	public int getNumeroPgLidas() {
		return numeroPgLidas;
	}

	public void setNumeroPgLidas(int numeroPgLidas) {
		this.numeroPgLidas = numeroPgLidas;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("LIVRO INFO:");
		sb.append("\nTitulo: " + getTitulo());
		sb.append("\nNumero de paginas: " + getPaginasTotais());
		sb.append("\nNumero de paginas lidas: " + getNumeroPgLidas());
		sb.append("---------------");
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (numeroPgLidas != other.numeroPgLidas)
			return false;
		if (paginasTotais != other.paginasTotais)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
}
/*
Projeto 1:
Classe: Livro 
Atributos: titulo, p�ginas, n�mero de p�ginas lidas.
M�todo: recomeca �> que recome�a a leitura do livro
M�todo: ler �> l� um n�mero de p�ginas a partir de onde est� e retorna se o livro
j� foi todo lido ou n�o (boolean). Observe que o n�mero de p�ginas lidas n�o pode
ultrapassar o n�mero de p�ginas do livro.
�> Fa�a testes criando um livro, realizando leituras e verificando se o livro acabou
e em que p�gina se encontra at� o livro acabar, recomece a leitura e fa�a novas 
leituras.
*/