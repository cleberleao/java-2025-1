import java.util.ArrayList;

public class MainArray {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();

        alunos.add(new Aluno("Cleber Leão", "01012358977", "RA1548721"));
        alunos.add(new Aluno("José Leão", "01012358922", "RA1545555"));
        alunos.add(new Aluno("Leão Almeida", "01012358922", "RA1548888"));

        cursos.add(new Curso("Java OO", 40));
        cursos.add(new Curso("Python", 80));

        System.out.println("** Lista de Alunos **");
        for(Aluno aluno: alunos){
            aluno.exibirDados();
        }
        for(Curso curso: cursos){
            curso.exibirCurso();
        }
    }
}
