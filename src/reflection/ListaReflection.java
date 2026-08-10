package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

public class ListaReflection {

    private List<String> lista;

    public static void main(String[] args) throws Exception {

        ListaReflection programa = new ListaReflection();

        Class<?> classeLista = Class.forName("java.util.ArrayList");

        Constructor<?> construtor = classeLista.getDeclaredConstructor();

        programa.lista = (List<String>) construtor.newInstance();

        Method metodoAdd = classeLista.getMethod("add", Object.class);

        // Adiciona elementos utilizando Reflection
        metodoAdd.invoke(programa.lista, "Marcos");
        metodoAdd.invoke(programa.lista, "João");
        metodoAdd.invoke(programa.lista, "Maria");
        metodoAdd.invoke(programa.lista, "Carlos");

        Method metodoIterator = classeLista.getMethod("iterator");

        Iterator<?> iterator =
                (Iterator<?>) metodoIterator.invoke(programa.lista);

        Method metodoHasNext = Iterator.class.getMethod("hasNext");
        Method metodoNext = Iterator.class.getMethod("next");

        while ((boolean) metodoHasNext.invoke(iterator)) {

            Object valor = metodoNext.invoke(iterator);

            System.out.println(valor);
        }
    }
}
