import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        //adiciona um elemento a fila
        fila.offer("primeiro cliente");
        fila.offer("segundo cliente");
        fila.offer("terceiro cliente");
        //remove um elemento
        fila.poll();

        for (String cliente : fila) {

            System.out.println(cliente);
        }

    }
}