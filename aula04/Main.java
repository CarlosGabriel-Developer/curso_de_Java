package aula04;

public class Main {
    public static void main(String[] args) {


        //criando o objeto
        Carro opala = new Carro ("Marrom","SS",1978,0f);
        Carro ford = new Carro("azul", "Mustang", 1977, null);
        Carro ferrari = new Carro("Vermelho", "Puro-Sangue", 2022, null);

        opala.acelerar(70);
        opala.acelerar(20);
        opala.acelerar(30);

        ford.acelerar(130);

        ferrari.acelerar(140);

    }
}
