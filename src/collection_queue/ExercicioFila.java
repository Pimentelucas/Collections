package collection_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		
		int num;
		String nome = new String();
		Queue<String> clientes = new LinkedList<String>();
		
		Scanner leia =  new Scanner(System.in);
		
		do {
		
			System.out.println("1 - Adicionar clientes na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - Sair");
			System.out.println("Entre com a opção desejada: ");
			num = leia.nextInt();
			
			
			switch(num) {
			case 1:
				System.out.println("Digite o nome: ");
				nome = leia.next();
				clientes.add(nome);
				System.out.println(clientes);
				System.out.println("Cliente adicionado!");
				break;
			case 2:
				System.out.println("Lista de clientes na fila:");
				System.out.println(clientes);
				break;
			case 3:
				clientes.poll();
				if(clientes.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println(clientes);
				}
				break;
			case 0:
				System.out.println("Programa finalizado!");			
			}
		}while(num != 0);
	}

}
