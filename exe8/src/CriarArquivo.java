import java.util.Locale;
import java.util.Scanner;

public class CriarArquivo {
    public static void main(String[] args) {
        System.out.println("Criar Arquivo");
        int i;
        for(i=0; i==0;){
            System.out.println("Digite uma opção: ");
            System.out.println("N. Novo arquivo");
            System.out.println("A. Abrir arquivo");
            System.out.println("F. Fechar arquivo");
            System.out.println("S. Sair");

            Scanner entrada = new Scanner(System.in);
            String opcao = entrada.next().toUpperCase(Locale.ROOT);

            System.out.println("Digite sua opção");
            if (opcao.equals("N")){
                System.out.println("novo arquivo criado com sucesso!");
                i = 0;
            }
            else if (opcao.equals("A")){
                System.out.println("Abrindo arquivo!");
                i = 0;
            }
            else if (opcao.equals("F")){
                System.out.println("Arquivo fechado com sucesso!");
                i = 0;
            }
            else if (opcao.equals("S")){
                System.out.println("Obrigado por utilizar o sistema!");
                i= 1;
            }
            else{
                System.out.println ("Valor incorreto");
                i=0;
            }
        }
    }
}