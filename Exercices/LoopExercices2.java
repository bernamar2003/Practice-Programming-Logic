package Exercices;

import java.util.Scanner;
public class LoopExercices2{

public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);

	boolean found = false;

	String [] marcasCarros = {
"Toyota", "Chevrolet", "Mercedez", "BMW", "Suzuki", "KIA", "Yundai"
	};

	System.out.println("Qual marca de carro procura?");
	String marca = scanner.nextLine();

	for(String procurar : marcasCarros){
	if (marca.equals(procurar)) {
		found = true;
		break;
	}
	}
	if (found) {
		System.out.println("Marca encontrada foi: " + marca);
	} else {
		System.out.println("Marca não encontrada.");
	}

}
}
