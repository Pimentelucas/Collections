package collections_array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenadorCrescente {

	public static void main(String[] args) {
		
		String cor = new String();
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner (System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			cor = leia.next();
			cores.add(cor);
		}
		
		System.out.println("\nCores cadastradas: " + cores);
		
		Collections.sort(cores);
		System.out.println("Cores em ordem Alfabética: "+ cores);
	}

}
