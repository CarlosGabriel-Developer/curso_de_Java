package aula04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner javascan = new Scanner(System.in);

    System.out.println("Digite a primeira nota : ");
    Float nota1 = javascan.nextFloat();

    System.out.println("Digte a segunda nota : ");
    Float nota2 = javascan.nextFloat();

    System.out.println("Digite a terceira nota : ");
    Float nota3 = javascan.nextFloat();

    System.out.println("Digite o quarto valor : ");
    Float nota4 = javascan.nextFloat();

    Float soma_notas = (nota1+nota2+nota3+nota4) ;
    Float media_notas = soma_notas /4 ;

    System.out.printf("A media das suas notas é de : [ %.2f ] ",media_notas);

    javascan.close();



    }
}
