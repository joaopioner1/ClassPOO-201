package application_livro;

import entities_livro.Livro;

public class Program {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 17/08/2021
		
		try {
			Livro l1 = new Livro();
			System.out.println(l1);
			l1.setPaginas(15);
			l1.setNumPagLidas(15);
			System.out.println(l1);
			
			l1.ler(-1);
			System.out.println(l1);
			
			l1.recomeca();
			System.out.println(l1);
			
			l1.ler(40);
			System.out.println(l1);

		}
		catch (NullPointerException e) {
			System.out.println("O numero de paginas lidas deve ser menor/igual ao numero de paginas.");
			e.printStackTrace();
		}
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