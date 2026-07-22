/*Counting even and odd numbers
Read 20 whole numbers.
State how many are even and how many are odd. */

public class Exercicio1{
    public static void main(String [] args){
        int pares = 0;
        int impares = 0;
        int number [] = {10, 45, 12, 48, 58, 95, 44, 86, 47, 98};

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}