import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.println("Write a number");
        int number = scanner.nextInt();
        int resultado = 1;

for (int i = number; i >= 1; i--){
	 resultado *= i;
    }
    System.out.println("O fatorial de " + number + " é: " + resultado);
}
}