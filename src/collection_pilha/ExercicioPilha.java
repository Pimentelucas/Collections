package collection_pilha;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		
		int num;
		String nome = new String();
		
		Stack<String> livros = new Stack<String>();
		
		Scanner leia =  new Scanner(System.in);
		
		do {
			
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("Entre com a opção desejada: ");
			num = leia.nextInt();
			
			
			switch(num) {
			case 1:
				System.out.println("Digite o nome: ");
				nome = leia.next();
				livros.push(nome);
				System.out.println(livros);
				System.out.println("Livro adicionado!");
				break;
			case 2:
				System.out.println("Lista de livros na fila:");
				System.out.println(livros);
				break;
			case 3:
				livros.pop();
				if(livros.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println(livros);
				}
				break;
			case 0:
				System.out.println("Programa finalizado!");			
			}
		}while(num != 0);
	}

}
