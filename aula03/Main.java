package aula03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o primeiro numero : ");
    int num1 = teclado.nextInt();


    System.out.println("Digite o segundo numero : ");
    int num2 = teclado.nextInt();

    int soma = (num1 + num2) ; 

    System.out.printf("A soma dos numeros é de %d",soma);


    teclado.close();


    }
}