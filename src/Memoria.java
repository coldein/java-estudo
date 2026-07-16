import java.util.HashSet;
import java.util.Set;

public class Memoria {
    public static void main(String[] args) {
        Memoria.create();

        String explain = "Ao final do passo 4, mesmo tendo sido adicionado ao HashSet 4 objetos iguais da classe Pessoa, " +
                "oque foi impresso no console, foi apenas um unico registro, por ter sido utilziados o Override em equals e hashCode, garantindo a comparação" +
                "correta do Objeto Pessoa, se estes dois metodos não forem implementados, a comporação falhara, e sera impresso 4 registros";

        System.out.println(explain);
    }

    public static void create() {
        Set<Pessoa> pessoas = new HashSet<>();

        pessoas.add(new Pessoa("Victor", 24));
        pessoas.add(new Pessoa("Victor", 24));
        pessoas.add(new Pessoa("Victor", 24));
        pessoas.add(new Pessoa("Victor", 24));

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.nome + " Idade: " + pessoa.idade);
        }
    }

}
