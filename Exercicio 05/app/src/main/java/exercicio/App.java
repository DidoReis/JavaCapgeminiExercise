/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package exercicio;

import java.util.Scanner;

public class App {
    
    /*Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
    No finalinformar o nome do aluno e a sua média (aritmética); */

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno");
        String name = scanner.nextLine();

        System.out.println("Digite a nota da primeira prova");
        int nota1 = scanner.nextInt();

        System.out.println("Digite a nota da primeira prova");
        int nota2 = scanner.nextInt();

        System.out.println("Digite a nota da primeira prova");
        int nota3 = scanner.nextInt();

        float calculoMedia = nota1 + nota2 + nota3 / 3;
 
        System.out.println("O nome do aluno é " + name);
       if (calculoMedia >= 8) {
        System.out.println("Aluno aprovado");
       } else if (calculoMedia >= 5) {
        System.out.println("Aluno em recuperação");
       } else {
        System.out.println("Aluno reprovado");
       }

        
    }
}
