package AgendaEventos;

import java.text.Format;
import java.time.LocalDateTime;

public class Evento {
    String nome;
    LocalDateTime dataHora;
    DiaDaSemana diaDaSemana;

    Evento(String nome, LocalDateTime dataHora, DiaDaSemana diaDaSemana) {
        this.nome = nome;
        this.dataHora = dataHora;
        this.diaDaSemana = diaDaSemana;
    }

    public void exibirEvento() {
        String conteudo = "Nome: " + nome + "\nData/Hora: " + dataHora;
        System.out.println(conteudo);
    }
}
