import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class SalarioFuncionario {
    public static void main(String[] args) {
        System.out.println("Calculo salário vendedor");

        String nome;
        double salario, vendas, salarioFinal;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        nome = entrada.nextLine();
        System.out.println("Digite o valor do salário: ");
        salario = parseDouble(entrada.next());
        System.out.println("Digite o valor das vendas: ");
        vendas = parseDouble(entrada.next());

        salarioFinal = (vendas * 0.15) + salario;

        System.out.println("Funcionário: "+ nome);
        System.out.println("Salario final é: " + salarioFinal);

    }
}