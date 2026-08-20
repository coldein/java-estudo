package stream;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class EmpresaUtil {

    public static List<Funcionario> filtrarFuncionarios(List<Empresa> empresas) {

        return empresas.stream()
                .flatMap(empresa -> empresa.getFuncionarios().stream())
                .filter(funcionario ->
                        funcionario.getDataNascimento().getYear() >= 1975
                        && funcionario.getDataNascimento().getYear() <= 1985)
                .filter(funcionario ->
                        funcionario.getSalario() <= 3000)
                .collect(Collectors.toList());
    }

    public static int somarPares(List<Integer> numeros) {

        return numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .mapToInt(numero -> numero)
                .sum();
    }

    public static List<Funcionario> maioresSalarios(List<Empresa> empresas) {

        return empresas.stream()
                .flatMap(empresa -> empresa.getFuncionarios().stream())

                .filter(funcionario ->
                        funcionario.getTipoContrato().equalsIgnoreCase("CLT"))

                .filter(funcionario -> {

                    int idade = Period.between(
                            funcionario.getDataNascimento(),
                            LocalDate.now()
                    ).getYears();

                    return idade < 25;
                })

                .sorted((f1, f2) -> Double.compare(f2.getSalario(), f1.getSalario()))

                .limit(30)

                .collect(Collectors.toList());
    }
}