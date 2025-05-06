import java.util.ArrayList;
import java.util.Collections;

public class ArrayListJava {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(9);
        numeros.add(1);
        numeros.add(3);

        numeros.remove(2);
        numeros.add(4);

        numeros.sort(null);
        // Ordenando a lista
//        Collections.sort(numeros);

        // Exibindo os dados
        System.out.println("ArrayList ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}

