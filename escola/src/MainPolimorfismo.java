import java.util.ArrayList;

public class MainPolimorfismo {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Aluno("José Leão", "010252451", "RA1565489"));
        pessoas.add(new Professor("Cleber Leão", "01021545220", "Programação"));

        for (Pessoa p: pessoas){
            p.exibirDados();
        }
    }
}
