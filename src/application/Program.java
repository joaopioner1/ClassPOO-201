package application;

import java.util.Scanner;

import model.entities.Estudante;

public class Program {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 16/08/2021
		Scanner scan = new Scanner(System.in);
		
		Estudante estudante1 = new Estudante();
		Estudante estudante2 = new Estudante("Carlos", 16);
		
		Double[] nota = new Double[3];
		for (int i = 0; i < 3; i++) {
			nota[i] = i + 2.00;
		}
		
		Estudante estudante3 = new Estudante("Isadora", 16, nota);

		estudante1.insereNota(8.00);
		estudante1.insereNota(20.00);
		estudante1.insereNota(9.00);
		System.out.println(estudante1.calculaMedia());
		
		scan.close();
	}
}
/*2) Projeto 2:
Classe: Estudante
Atributos: nome, idade, 3 notas (uma por trimestre) .
M�todo: fazAniversario �> incrementa em um a idade
M�todo : insereNota �> insere a nota passada por par�metro no pr�ximo
trimestre sem nota. Se nenhuma nota foi informada, altera a nota1 e assim por
diante. Se as tr�s notas j� foram inseridas nada � alterado pelo m�todo. OBS: caso
necess�rio crie uma vari�vel da classe extra para controlar quais notas foram
inseridas.
M�todo : calculaMedia �> calcula a m�dia das notas j� inseridas.
�> Crie uma pessoa, coloque seu nome e idade iniciais, fa�a alguns anivers�rios
(aumentando a idade) e imprima seu nome e sua idade, altere suas notas dos 3
trimestres e calcule a m�dia a cada nota inserida.*/