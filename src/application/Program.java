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
Método: fazAniversario –> incrementa em um a idade
Método : insereNota –> insere a nota passada por parâmetro no próximo
trimestre sem nota. Se nenhuma nota foi informada, altera a nota1 e assim por
diante. Se as três notas já foram inseridas nada é alterado pelo método. OBS: caso
necessário crie uma variável da classe extra para controlar quais notas foram
inseridas.
Método : calculaMedia –> calcula a média das notas já inseridas.
–> Crie uma pessoa, coloque seu nome e idade iniciais, faça alguns aniversários
(aumentando a idade) e imprima seu nome e sua idade, altere suas notas dos 3
trimestres e calcule a média a cada nota inserida.*/