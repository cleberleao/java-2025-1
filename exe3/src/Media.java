import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Media {
    public static void main(String[] args) {
        System.out.println("Calculo Média nota");
        Scanner entrada = new Scanner(System.in);
        double media, nota1, nota2, nota3;
        String nome;

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite a nota 1: ");
        nota1 = parseDouble( entrada.nextLine());
        System.out.println("Digite a nota 2: ");
        nota2 = entrada.nextDouble();
        System.out.println("Digite a nota 3: ");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Aluno: "+ nome);
        System.out.println("A média da sua nota é: " + media);

    }
}