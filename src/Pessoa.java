import java.util.Objects;

public class Pessoa {
    public String nome;
    public int idade;

     public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Ao comentar (equals e  hashCode) a comparação do objeto não e feita corretamente.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
}
