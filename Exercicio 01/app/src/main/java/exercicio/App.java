
package exercicio;

import java.util.Scanner;

public class App {
   
    // exercicio 1 - Faça um algoritmo que receba dois números e exiba o resultado da sua soma

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        int numero2 = scanner.nextInt();

        scanner.close();

        int resultado = numero1 + numero2;

        System.out.println("A soma do resultado é: " + resultado);

    }

    public Object getGreeting() {
        return null;
    }
}
