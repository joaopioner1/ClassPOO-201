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
Atributos: titulo, páginas, número de páginas lidas.
Método: recomeca –> que recomeça a leitura do livro
Método: ler –> lê um número de páginas a partir de onde está e retorna se o livro
já foi todo lido ou não (boolean). Observe que o número de páginas lidas não pode
ultrapassar o número de páginas do livro.
–> Faça testes criando um livro, realizando leituras e verificando se o livro acabou
e em que página se encontra até o livro acabar, recomece a leitura e faça novas 
leituras.
*/