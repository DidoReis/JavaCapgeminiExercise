/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package exercicio;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int totalAptos = 0;
        int totalInaptos = 0;

        // Solicite ao usuário o número de pessoas a serem verificadas
        System.out.print("Digite o número de pessoas a serem verificadas: ");
        int totalPessoas = scanner.nextInt();

        // Loop para ler os dados de cada pessoa
        for (int i = 1; i <= totalPessoas; i++) {
            // Solicite ao usuário que insira o nome da pessoa
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.next();

            // Solicite ao usuário que insira o sexo da pessoa (M para masculino, F para feminino)
            System.out.print("Digite o sexo da pessoa (M para masculino ou F para feminino): ");
            String sexo = scanner.next();

            // Solicite ao usuário que insira a idade da pessoa
            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();

            // Solicite ao usuário que insira a saúde da pessoa (S para saudável ou N para não saudável)
            System.out.print("A pessoa está saudável? (S para saudável ou N para não saudável): ");
            String saude = scanner.next();

            // Verifique se a pessoa está apta ou não para o serviço militar
            if (sexo.equalsIgnoreCase("M")) {
                if (idade >= 18 && saude.equalsIgnoreCase("S")) {
                    System.out.println(nome + " está apto para o serviço militar obrigatório.");
                    totalAptos++;
                } else {
                    System.out.println(nome + " não está apto para o serviço militar obrigatório.");
                    totalInaptos++;
                }
            } else {
                System.out.println("O serviço militar obrigatório não se aplica a " + nome + ".");
            }
        }

        // Exiba o total de pessoas aptas e inaptas
        System.out.println("Total de pessoas aptas: " + totalAptos);
        System.out.println("Total de pessoas inaptas: " + totalInaptos);

        // Feche o Scanner após a entrada
        scanner.close();
    }
}
