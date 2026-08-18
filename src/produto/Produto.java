package produto;

public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return "Produto: " + this.nome + " | Valor: " + this.preco;
    }

    @Override
    public int compareTo(Produto produto) {
        return Double.compare(this.preco, produto.getPreco());
    }
}
