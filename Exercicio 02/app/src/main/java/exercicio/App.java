/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package exercicio;

import java.util.Scanner;

/*Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão 
dos dois números lidos */

public class App {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);     

        System.out.println("Digite o primeiro número");
        float numero1 = scanner.nextFloat();

        System.out.println("Digite o segundo número");
        float numero2 = scanner.nextFloat();

        float soma = numero1 + numero2;
        float subtracao = numero1 - numero2;
        float multiplicação = numero1 * numero2;
        
        if(numero2 != 0) {
            float divisao = numero1 / numero2;


        System.out.println("A soma dos numeros é: " + soma);
        System.out.println("A subtração dos numeros é: " + subtracao);
        System.out.println("A multiplicação dos numeros é: " + multiplicação);
        System.out.println("A divisão dos numeros é: " + divisao);

        } else {
            System.out.println("Não é possível dividir por zero.");
        }
    }

    public Object getGreeting() {
        return null;
    }
}