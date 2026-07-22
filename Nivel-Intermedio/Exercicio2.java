import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("Nenhum número foi encontrado");
        } else {
            int maior = numero;
            int menor = numero;
        
            while (numero != 0) {
                numero = scanner.nextInt();
                if (numero > maior) {
                    maior = numero;
                } else if (numero < menor) {
                    menor = numero;
                }
            }
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
        }
        }
    }
