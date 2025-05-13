import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainArquivoArray {
    static String path = "C:\\Users\\cleber.almeida\\Documents\\PSC\\java-2025-1\\escola\\src\\file\\";
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();

        alunos.add(new Aluno("Cleber Leão", "01012358977", "RA1548721"));
        alunos.add(new Aluno("José Leão", "01012358922", "RA1545555"));
        alunos.add(new Aluno("Leão Almeida", "01012358922", "RA1548888"));

        cursos.add(new Curso("Java OO", 40));
        cursos.add(new Curso("Python", 80));

        File fileAluno = new File(path + "aluno.txt");
        File fileCurso = new File(path + "curso.txt");
        gravaAluno(fileAluno, alunos);
        gravaCurso(fileCurso, cursos);

        mostrarLinhasConsole(fileAluno);
        mostrarLinhasConsole(fileCurso);
    }

    private static void mostrarLinhasConsole(File file) throws FileNotFoundException {
        Scanner lerArquivo = new Scanner(file);
        while (lerArquivo.hasNextLine()){
            String linha = lerArquivo.nextLine();
            System.out.println(linha);
        }
    }

    private static void gravaCurso(File fileCurso, ArrayList<Curso> cursos) {
        if (fileCurso.getName().equals("curso.txt")) {
            System.out.println("Arquivo curso existe, nome: " + fileCurso.getName());
            FileWriter meuCurso = null;
            try {
                meuCurso = new FileWriter(path + "curso.txt");
                for(Curso curso : cursos){
                    meuCurso.write(curso.getNomeCurso() + " "
                            + curso.getCargaHoraria() + "\n"
                    );
                }
                meuCurso.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Arquivo não existe.");
        }
    }

    private static void gravaAluno(File fileAluno, ArrayList<Aluno> alunos) {
        if (fileAluno.getName().equals("aluno.txt")) {
            System.out.println("Arquivo aluno existe, nome: " + fileAluno.getName());
            FileWriter meuAluno = null;
            try {
                meuAluno = new FileWriter(path + "aluno.txt");
                for (Aluno aluno : alunos){
                    meuAluno.write(aluno.getNome() + " "
                            + aluno.getRa() + " "
                            + aluno.getCpf() + "\n"
                    );
                }
                meuAluno.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Arquivo não existe.");
        }
    }
}
