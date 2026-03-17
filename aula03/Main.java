package aula03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o seu nome:");
    String nome = teclado.nextLine();

    System.out.println("Digite a sua nota:");
    Float nota = teclado.nextFloat();

    System.out.format("O meu nome é %s, e minha nota é %.2f \n",nome,nota);

    teclado.close();

    }
}

