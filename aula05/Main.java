package aula05;

public class Main { 

    public static void main(String[] args) {
        

        ContaBancaria conta = new ContaBancaria(0);
        ContaBancaria conta2 = new ContaBancaria(50000);


        conta.depositar(5000);
        conta.depositar(400);

        conta.saque(2400);

        conta2.saque(4000);

        

  
    }


}