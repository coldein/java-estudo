package produto;

import java.util.ArrayList;
import java.util.List;

public class Ordenar {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Audi TT", 200000));
        produtos.add(new Produto("Audi RS6", 600000));
        produtos.add(new Produto("Audi A1", 80000));
        produtos.add(new Produto("Audi Q7", 350000));

        ListaUtil ordenador = new ListaUtil();

        ordenador.ordenarExibir(produtos);
    }
}
