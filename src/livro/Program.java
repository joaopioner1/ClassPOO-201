package livro;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 24/06/21
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o titulo do livro: ");
		String titulo = sc.nextLine();
		System.out.print("Insira o numero de paginas totais do livro: ");
		int numPaginasTotais = sc.nextInt();
		System.out.print("Insira o titulo do livro: ");
		int numPaginasLidas = sc.nextInt();
		
		Livro livro = new Livro(titulo, numPaginasTotais, numPaginasLidas);//Instanciando um objeto
		
		livro.ler(60);
		System.out.println(livro.getNumeroPgLidas());
		livro.recomeca();
		System.out.println(livro.getNumeroPgLidas());
		sc.close();
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