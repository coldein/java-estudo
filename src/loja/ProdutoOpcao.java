package loja;

public enum ProdutoOpcao {

    TELEVISAO("Televisão"),
    RADIO("Rádio"),
    VIDEOGAME("Videogame"),
    TABLET("Tablet"),
    CELULAR("Celular");

    private final String descricao;

    ProdutoOpcao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}