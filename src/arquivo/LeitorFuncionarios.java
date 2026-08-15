package arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorFuncionarios {

    public List<Funcionario> lerArquivo(String caminho) {

        List<Funcionario> funcionarios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String linha;

            while ((linha = br.readLine()) != null) {

                if (linha.trim().isEmpty()) {
                    continue;
                }

                // Separa os dados pelo ;
                String[] dados = linha.split(";");

                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String cargo = dados[2];
                double salario = Double.parseDouble(dados[3]);

                Funcionario funcionario = new Funcionario(
                        id,
                        nome,
                        cargo,
                        salario
                );

                funcionarios.add(funcionario);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return funcionarios;
    }
}
