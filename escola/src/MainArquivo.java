import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainArquivo {
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
        File fileAluno = new File("C:\\Users\\cleber.almeida\\Documents\\PSC\\java-2025-1\\escola\\src\\file\\aluno.txt");
        File fileCurso = new File("C:\\Users\\cleber.almeida\\Documents\\PSC\\java-2025-1\\escola\\src\\file\\curso.txt");
        if (fileAluno.getName().equals("aluno.txt")) {
            System.out.println("Arquivo aluno existe, nome: " + fileAluno.getName());
            FileWriter meuAluno = null;
            try {
                meuAluno = new FileWriter("C:\\Users\\cleber.almeida\\Documents\\PSC\\java-2025-1\\escola\\src\\file\\aluno.txt");
                meuAluno.write(aluno.getNome() + " "
                                + aluno.getRa() + " "
                                + aluno.getCpf()
                );
                meuAluno.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Arquivo não existe.");
        }
        if (fileCurso.getName().equals("curso.txt")) {
            System.out.println("Arquivo curso existe, nome: " + fileAluno.getName());
            FileWriter meuCurso = null;
            try {
                meuCurso = new FileWriter("C:\\Users\\cleber.almeida\\Documents\\PSC\\java-2025-1\\escola\\src\\file\\curso.txt");
                meuCurso.write(curso.getNomeCurso() + " "
                        + curso.getCargaHoraria()
                );
                meuCurso.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Arquivo não existe.");
        }
    }
}
