/*Exercício de Escopo: Escreva um método que declare uma variável x no escopo do método e, 
em seguida, declare outra variável xdentro de um if bloco. 
Imprima o valor de ambas xas variáveis ​​dentro do if bloco e após o if bloco. Explique a saída.
 */

package Exercices;

public class Escopo {

    public static void exemploEscopo() {
        int x = 10; // Variável do método

        if (true) {
            int y = 20; // Variável do bloco if

            System.out.println("Dentro do if:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        System.out.println("\nFora do if:");
        System.out.println("x = " + x);
    }
    public static void main(String[] args) {
        exemploEscopo();
    }
}

/*
Em Java, não é permitido declarar duas variáveis com o mesmo nome (x) 
em escopos sobrepostos (como um if dentro do mesmo método). 
Portanto, o exercício, escrito dessa forma, gera erro de compilação.
*/