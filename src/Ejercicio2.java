import java.util.Stack;

public class Ejercicio2 {


     public Boolean esPalindromo(String texto){
        Stack<Character> pila = new Stack<>();
        char[] textoArray = texto.toCharArray();
        for (char letra : texto.toCharArray()) {
            pila.push(letra);
        }
       
        int i=0;
        while (!pila.isEmpty()) {
            char variable= pila.pop();
            if (textoArray[i] != variable) {
                return false;
            }
            i++;
        }
        return true;
    }
}
