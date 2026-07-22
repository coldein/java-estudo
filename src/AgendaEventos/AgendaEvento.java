package AgendaEventos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AgendaEvento {
    public static void main(String[] args) {
        iniciarEvento();
    }

    public static void iniciarEvento() {
        ZoneId fusoManaus = ZoneId.of("America/Manaus");
        ZoneId fusoSP = ZoneId.of("America/Sao_Paulo");
        ZoneId fusoGMT = ZoneId.of("GMT");

        Evento evento = new Evento("Grande Premio da Bélgica", LocalDateTime.now(), DiaDaSemana.DOMINGO);

        System.out.println("Evento criado: ");
        evento.exibirEvento();
        System.out.println("----------------------------------------");

        System.out.println("\nEvento ( + 5 dias à data ): ");
        evento.dataHora = evento.dataHora.plusDays(5);
        evento.exibirEvento();
        System.out.println("----------------------------------------");

        System.out.println("\nHorários do evento com fuso aplicado:");

        System.out.println("São Paulo: " + evento.dataHora.atZone(fusoManaus).withZoneSameInstant(fusoSP));
        System.out.println("GMT:       " + evento.dataHora.atZone(fusoManaus).withZoneSameInstant(fusoGMT));
    }
}
