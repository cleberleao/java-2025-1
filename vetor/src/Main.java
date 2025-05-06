import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 3};

        for (int i=0; i<numeros.length; i++){
            int ref = numeros[i];
            int j;
            for (j = i - 1; j>=0 && numeros[j] > ref; j--){
                numeros[j+1] = numeros[j];
            }
            numeros[j + 1] = ref;
//            System.out.println("Numeros: " + numeros[i]);
        }
        for(int l = 0; l<numeros.length; l++){
            System.out.println("numero: "+ numeros[l]);
        }

//        // Ordenando o array nativo
//        Arrays.sort(numeros);
//
//        // Exibindo os dados
//        System.out.println("Array ordenado:");
//        for (int num : numeros) {
//            System.out.print(num + " ");
//        }
    }
}