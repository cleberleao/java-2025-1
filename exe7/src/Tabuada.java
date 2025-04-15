import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Tabuada");

        int num, cont, result;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        num = parseInt( entrada.next());
        cont = 1;

        while (cont <= 10) {
            result = num * cont;
            System.out.println(num + " * " + cont + "= " + result);
            cont++;
        }

    }
}