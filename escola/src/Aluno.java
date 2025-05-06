

public class Aluno extends Pessoa {
    private String ra;

    public Aluno(String nome, String cpf, String ra) {
        super(nome, cpf);
        this.ra = ra;
    }

    public String getRa(){
        return ra;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula RA: "+ ra);
    }
}
