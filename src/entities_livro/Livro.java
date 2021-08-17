package entities_livro;

import exceptions.InvalidPageNumber;

public class Livro {
	
	//ATRIBUTOS
	private String titulo;
	private Integer paginas;
	private Integer numPagLidas;
	
	//CONSTRUTORES
	public Livro() {
	}
	
	public Livro(String titulo, Integer paginas) {
		setPaginas(paginas);
		setTitulo(titulo);
	}

	public Livro(String titulo, Integer paginas, Integer numPagLidas) {
		setPaginas(paginas);
		setTitulo(titulo);
		setNumPagLidas(numPagLidas);
	}

	//METODINHOS
	public Integer recomeca() {
		return numPagLidas = 0;
	}
	
	public boolean ler(Integer pag) {
		if (pag + numPagLidas < paginas) {
			numPagLidas += pag;
			return false;
		} 
		if (pag + numPagLidas == paginas) {
			return true;
		}
		throw new InvalidPageNumber("ERRO! Ultrapassou o limite total de paginas do livro.");
	}
	
	@Override
	public String toString() {
		return "Titulo: " + getTitulo() 
				+ "\nPaginas: " + getPaginas()
				+ "\nNumero paginas lidas: " + getNumPagLidas()
				+ "\n-----------";
	}
	
	//GETTERS E SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public Integer getNumPagLidas() {
		return numPagLidas;
	}

	public void setNumPagLidas(Integer numPagLidas) {
		if (numPagLidas > paginas) {
			throw new InvalidPageNumber("O numero de paginas lidas deve ser menor/igual ao numero de paginas.");
		}
		this.numPagLidas = numPagLidas;
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