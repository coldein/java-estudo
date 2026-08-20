package stream;

import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private LocalDate dataNascimento;
    private double salario;
    private String tipoContrato;

    public Funcionario(String nome, LocalDate dataNascimento,
                       double salario, String tipoContrato) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.tipoContrato = tipoContrato;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", salario=" + salario +
                ", tipoContrato='" + tipoContrato + '\'' +
                '}';
    }
}