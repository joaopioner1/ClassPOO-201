package livro;

public class Livro {

	private String titulo;
	private int paginasTotais;
	private int numeroPgLidas;
	
	public Livro() {
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
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPaginasTotais() {
		return paginasTotais;
	}

	public void setPaginasTotais(int paginasTotais) {
		this.paginasTotais = paginasTotais;
	}

	public int getNumeroPgLidas() {
		return numeroPgLidas;
	}

	public void setNumeroPgLidas(int numeroPgLidas) {
		this.numeroPgLidas = numeroPgLidas;
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