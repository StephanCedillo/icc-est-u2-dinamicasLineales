import java.util.Stack;

public class Ejercicio1 {
    // Metodo que devuelve la cadena de texto invertida
    // texto --> COMPUTACION
    // return --> NOICATUPMOC   
    // USANDO SOLO PILAS
    public String invertString(String texto){
        Stack<Character> pila = new Stack<>();
        for (char letra : texto.toCharArray()) {
            pila.push(letra);
        }
       
        String resultado= "";
        while (!pila.isEmpty()) {
            resultado+= pila.pop();
        }
        return resultado;
    }
}
