package application_livro;

import entities_livro.Livro;

public class Program {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 17/08/2021
		
		Livro l1 = new Livro();
		System.out.println(l1);
		l1.setNumPagLidas(20);
		l1.setPaginas(15);
		System.out.println(l1);

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