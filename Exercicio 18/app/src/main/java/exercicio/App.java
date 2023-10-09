
package exercicio;

import java.util.Scanner;

public class App {
    
    /*Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou 
mulher. No final informe total de homens e de mulheres; */

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int totalHomens = 0;
        int totalMulheres = 0;

        // Loop para ler o nome e o sexo de 56 pessoas
        for (int i = 1; i <= 56; i++) {
            // Solicite ao usuário que insira o nome da pessoa
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.next();

            // Solicite ao usuário que insira o sexo da pessoa (M para masculino, F para feminino)
            System.out.print("Digite o sexo da pessoa (M para masculino ou F para feminino): ");
            String sexo = scanner.next();

            // Verifique se a pessoa é homem ou mulher e conte o total
            if (sexo.equalsIgnoreCase("M")) {
                System.out.println(nome + " é homem.");
                totalHomens++;
            } else if (sexo.equalsIgnoreCase("F")) {
                System.out.println(nome + " é mulher.");
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido para " + nome + ". Digite M para masculino ou F para feminino.");
                i--; // Decrementa o índice para que o usuário insira novamente os dados para esta pessoa.
            }
        }

        // Exiba o total de homens e mulheres
        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);

        // Feche o Scanner após a entrada
        scanner.close();
    }

        
    
}
