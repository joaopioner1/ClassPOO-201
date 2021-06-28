package livro;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 24/06/21
		Scanner sc = new Scanner(System.in);
		
		Livro livro = new Livro();//Instanciando um objeto
	
		System.out.print("Insira o titulo do livro: ");
		String titulo = sc.nextLine();
		System.out.print("Insira o titulo do livro: ");
		int numPaginasTotais = sc.nextInt();
		System.out.print("Insira o titulo do livro: ");
		int numPaginasLidas = sc.nextInt();
		
		sc.close();
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