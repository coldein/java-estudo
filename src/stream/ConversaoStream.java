package stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ConversaoStream {

    public static void main(String[] args) {

        // =====================================
        // CRIANDO FUNCIONÁRIOS
        // =====================================

        Funcionario f1 = new Funcionario(
                "Carlos",
                LocalDate.of(1980, 5, 10),
                2500,
                "CLT"
        );

        Funcionario f2 = new Funcionario(
                "Joao",
                LocalDate.of(1988, 3, 20),
                4000,
                "CLT"
        );

        Funcionario f3 = new Funcionario(
                "Pedro",
                LocalDate.of(2005, 7, 15),
                8000,
                "CLT"
        );

        Funcionario f4 = new Funcionario(
                "Ana",
                LocalDate.of(2004, 2, 10),
                6500,
                "PJ"
        );

        Funcionario f5 = new Funcionario(
                "Marcos",
                LocalDate.of(1978, 8, 25),
                2800,
                "CLT"
        );


        // =====================================
        // CRIANDO EMPRESAS
        // =====================================

        Empresa empresa1 = new Empresa(
                "Empresa A",
                Arrays.asList(f1, f2, f3)
        );

        Empresa empresa2 = new Empresa(
                "Empresa B",
                Arrays.asList(f4, f5)
        );

        List<Empresa> empresas = Arrays.asList(
                empresa1,
                empresa2
        );


        // =====================================
        // EXERCÍCIO 1
        // =====================================

        System.out.println("EXERCICIO 1");
        System.out.println(
                "Nascidos entre 1975 e 1985 com salario <= 3000:"
        );

        List<Funcionario> resultado1 =
                EmpresaUtil.filtrarFuncionarios(empresas);

        resultado1.forEach(funcionario ->
                System.out.println(funcionario)
        );


        // =====================================
        // EXERCÍCIO 2
        // =====================================

        System.out.println();
        System.out.println("EXERCICIO 2");

        List<Integer> numeros = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8
        );

        int soma = EmpresaUtil.somarPares(numeros);

        System.out.println(
                "Soma dos numeros pares: " + soma
        );


        // =====================================
        // EXERCÍCIO 3
        // =====================================

        System.out.println();
        System.out.println("EXERCICIO 3");
        System.out.println(
                "Maiores salarios CLT com menos de 25 anos:"
        );

        List<Funcionario> resultado3 =
                EmpresaUtil.maioresSalarios(empresas);

        resultado3.forEach(funcionario ->
                System.out.println(funcionario)
        );
    }
}