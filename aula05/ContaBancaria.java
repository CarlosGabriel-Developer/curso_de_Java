package aula05;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldoInical) { 
        this.saldo = saldoInical;
    }
    
    public void depositar(double valor) {
        if (valor > 0){
            saldo += valor;
            System.out.printf("Deposíto realizado,No valor de R$%.2f%n",valor);
        }
    }    

    public void saque (double valor) { 
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.printf("Saque realizado,Saldo atual da sua conta é de R$%.2f%n",saldo);
        } else { 
            System.out.printf("Saque invalido%n");
        }

    }

    public double getSaldo() {
        return saldo;
    }

    
    
}
