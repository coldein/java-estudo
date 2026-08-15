package arquivo;

public class FuncionarioXML {

    public String converter(Funcionario funcionario) {

        return "<funcionario>\n"
                + "    <id>" + funcionario.getId() + "</id>\n"
                + "    <nome>" + funcionario.getNome() + "</nome>\n"
                + "    <cargo>" + funcionario.getCargo() + "</cargo>\n"
                + "    <salario>" + funcionario.getSalario() + "</salario>\n"
                + "</funcionario>";
    }
}
