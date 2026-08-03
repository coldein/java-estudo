package loja;

public class Compra {

    private Produto produto;
    private int quantidade;

    public Compra(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotal() {
        return produto.calcularPreco(quantidade);
    }

}