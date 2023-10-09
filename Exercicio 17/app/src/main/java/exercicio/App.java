
package exercicio;

import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numeroDePessoas = 75;

        for (int i = 1; i <= numeroDePessoas; i++) {

            System.out.println("Digite a idade da pessoa" + i + ": ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Pessoa" + i + ": Maior de idade");
            } else {
                System.out.println("Pessoa" + i + ": Menor de idade");
            }
        }

        scanner.close();

    }
}
