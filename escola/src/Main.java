//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(
                "Cleber Leão",
                "01010122699",
                "RA148579624"
        );
        Curso curso = new Curso(
                "Java OO",
                40
        );
        System.out.println("** Nome do Aluno **");
        aluno.exibirDados();
        System.out.println("** Nome do Curso **");
        curso.exibirCurso();
    }
}