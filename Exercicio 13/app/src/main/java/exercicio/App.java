/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package exercicio;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número> ");
        int numero = scanner.nextInt();

        scanner.close();

        if (numero > 10) {
            System.out.println("O número é maior que 10.");
        } else {
            System.out.println("O número não é maior que 10.");
        }

    }
}
