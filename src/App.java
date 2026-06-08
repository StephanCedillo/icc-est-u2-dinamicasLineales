import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        runLinkdedList();
        System.out.println();
        runQueue();
        System.out.println();
        runStack();

        Ejercicio1 cEjercicio = new Ejercicio1();


        System.out.println( " Ejercicio texto invertido: ");
        String texto = "COMPUTACION";
        System.out.println("Texto sin cambiar: "+ texto);
        System.out.println("Texto invertido :" + cEjercicio.invertString(texto));
    }

    private static void runStack() {
        System.out.println("Stack / Pila");
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");

        String elemento = pila.pop();

        System.out.println("Tamaño: " + pila.size());
        System.out.println("Ultimo elemento eliminado : " + elemento);

        Deque<String> pila2 = new ArrayDeque<>(); // Crea un ArrayInterno
        Deque<String> pila3 = new LinkedList<>(); // Cada elemento en un nodos

        pila2.push("a");
        pila3.push("A");

        pila.pop();
        pila.pop();

    }

    private static void runQueue() {
        System.out.println("Queue / Cola");
        Queue<String> cola = new ArrayDeque<String>();
        cola.offer("Jose");
        cola.offer("Andres");
        cola.offer("Ana");

        System.out.println("Esta vacia?: " + (cola.isEmpty() ? "Si" : "No"));
        System.out.println("Tamaño: " + cola.size());

        System.out.println("Primer elemento ingresado: " + cola.peek());
        System.out.println("Tamaño: " + cola.size());

        System.out.println("Primer elemento ingresado para eliminar: " + cola.poll());
        System.out.println("Tamaño: " + cola.size());

        while (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.out.println("Atendi a " + cliente);
        }
        System.out.println();
        System.out.println("Esta vacia?: " + (cola.isEmpty() ? "Si" : "No"));

        // offer --> agrega al final
        // peek --> devuelve el primero sin eliminar
        // poll --> devuelve el primero y lo elimina
    }

    private static void runLinkdedList() {
        System.out.println("Lista enlazada / LinkedList");
        LinkedList<String> nombres = new LinkedList<>();
        System.out.println("Esta vacia?: " + (nombres.isEmpty() ? "Si" : "No"));
        System.out.println("Tamaño: " + nombres.size());

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diego");

        System.out.println("Primer elemento: " + nombres.getFirst());
        System.out.println("Elemento por indice: " + nombres.get(2));
        System.out.println("Ultimo elemento: " + nombres.getLast());

        System.out.println("Primer elemento ingresado: " + nombres.peek());
        System.out.println("Tamaño: " + nombres.size());
    }
}
