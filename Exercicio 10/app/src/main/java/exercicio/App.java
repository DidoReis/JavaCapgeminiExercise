/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    
    /*A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. Faça um 
      algoritmo que receba um valor de uma compra e mostre o valor das prestações */

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        scanner.close();

        double valorPrestacao = valorCompra / 5;
        DecimalFormat formato = new DecimalFormat("0.00");

        System.out.println("O valor de cada prestação é: R$ " + formato.format(valorPrestacao));

    }
}
