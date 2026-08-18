package lambdas;

import java.util.Arrays;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList(
                "Ana",
                "Bruno",
                "Carlos",
                "Amanda",
                "Beatriz");

        FiltroNome filtro = nome -> nome.startsWith("A");

        nomes.stream()
                .filter(nome -> filtro.testar(nome))
                .forEach(nome -> System.out.println(nome));
    }
}
