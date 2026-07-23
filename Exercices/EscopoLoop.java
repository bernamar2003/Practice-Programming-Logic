package Exercices;

public class EscopoLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            int quadrado = i * i;
            System.out.println("Quadrado de " + i + " = " + quadrado);
        }

        // Tentando acessar a variável fora do loop
      //    System.out.println(quadrado); Marca erro Quadrado.
    }
}

/*
Em Java, uma variável declarada dentro de um bloco (como um for) 
só existe naquele bloco. Se você tentar acessá-la fora dele, o código não compilará.
*/