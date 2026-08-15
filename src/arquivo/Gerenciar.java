package arquivo;

import java.util.List;

public class Gerenciar {

    public static void main(String[] args) {

        String caminho = "funcionarios.txt";

        LeitorFuncionarios leitor = new LeitorFuncionarios();

        List<Funcionario> funcionarios = leitor.lerArquivo(caminho);

        FuncionarioXML conversorXML = new FuncionarioXML();

        for (Funcionario funcionario : funcionarios) {

            System.out.println("OBJETO JAVA:");
            System.out.println(funcionario);

            System.out.println("\nXML:");
            System.out.println(conversorXML.converter(funcionario));

            System.out.println("----------------------------------");
        }
    }
}
