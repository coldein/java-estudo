package produto;

import java.util.Collections;
import java.util.List;

public class ListaUtil {
    public void ordenarExibir(List<Produto> lista) {
        Collections.sort(lista);

        for (Produto elemento : lista) {
            System.out.println(elemento.toString());
        }
    }
}
