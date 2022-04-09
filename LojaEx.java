package br.com.generation.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class LojaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String produto1 = "caderno";
		String produto2 = "caneta";
		String produto3 = "lapis";
		
		ArrayList<String> produtos = new ArrayList<>();
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		
		System.out.println("Lista de produtos: " + produtos );
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Você deseja adicionar ou remover? Digite 1 para adicionar e 2 para remover.");
		int num = leia.nextInt();
		
		if( num == 1) {
			System.out.println("Nome do produto: ");
			String produto = leia.next();
			produtos.add(produto);
			
		}
		else if(num == 2) {
			System.out.println("Qual produto gostaria de remover: ");
			int quantidade = produtos.size();
			System.out.println(quantidade);
			for (int i = 0; i < quantidade; i++);
				System.out.println(( num + 1) + produtos.get( num ));
		}
		System.out.println("Digite o número correspondente ao produto: ");
		int numProduto = leia.nextInt();
		produtos.remove(numProduto - 1);
		System.out.println();
		System.out.println("A nova lista é: " + produtos);
	}

		else {
		System.out.println("Opção invalida");
	}
	Collections.sort(produtos);
	System.out.println("Produtos "+ produtos);
				
			
			
		}
		
				
	}


