package aula06;

public class Produto {

    private String nome;

    private double preco;

    private int quantidade;

    // Construtor para inicializar o produto

    public Produto(String nome, double preco, int quantidade) {

        this.nome = nome;

        this.preco = preco;

        this.quantidade = quantidade;

    }

    // Métodos getters

    public String getNome() {

        return nome;

    }

    public double getPreco() {

        return preco;

    }

    public int getQuantidade() {

        return quantidade;

    }

    // Métodos setters

    public void setNome(String nome) {

        this.nome = nome;

    }

    public void setPreco(double preco) {

        this.preco = preco;

    }

    public void setQuantidade(int quantidade) {

        this.quantidade = quantidade;

    }

    // Método para exibir os detalhes do produto

    public void exibirDetalhes() {

        System.out.println("Nome do Produto: " + nome);

        System.out.println("Preço: " + preco);

        System.out.println("Quantidade em Estoque: " + quantidade);

    }

}