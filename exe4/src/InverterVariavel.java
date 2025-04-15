import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class InverterVariavel {
    public static void main(String[] args) {
        System.out.println("Inverter valores de variáveis");

        Scanner entrada = new Scanner(System.in);
        int A, B, IvertidaA, IvertidaB;

        System.out.println("Digite um numero inteiro para A");
        A = entrada.nextInt();
        System.out.println("Digite um numero inteiro para B");
        B = parseInt(entrada.next());

        IvertidaA = B;
        IvertidaB = A;

        System.out.println("O Numero invertido de A: "+ IvertidaA);
        System.out.println("O Numero invertido de B: "+ IvertidaB);

    }
}