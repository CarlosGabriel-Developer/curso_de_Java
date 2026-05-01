package aula02;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um numero :");
    Integer num = teclado.nextInt();

    System.out.printf("O numero informado foi [ %d ]",num);

    teclado.close();

    }

}
