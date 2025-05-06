import java.util.Arrays;
public class Ordenado {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 3};

        Arrays.sort(numeros);

        System.out.println("Array ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
