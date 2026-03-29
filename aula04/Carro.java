package aula04;

//criar a classe
public class Carro {
    
    String cor ;
    String modelo ;
    int ano ;
    int velocidade ; 

    //iniciar a classe com o construtor
    public Carro (String cor, String modelo, int ano, Float velocidade){

        this.cor = cor;
        this.modelo = modelo ;
        this.ano = ano ;
        this.velocidade = 0;

    }


    //metodo
    public void acelerar(int incremento) { 
    this.velocidade += incremento;
    System.out.format("O carro acelerou para %d Kl/H%n",velocidade);}
    
    //metodo
    public void frearcarro(int decremento)  {
        this.velocidade -= decremento;
        if (this.velocidade<0) {
            this.velocidade = 0;
        }


        System.out.println("O carro desacelerou para " + this.velocidade + " km/h.%n");
    }    

    

}
