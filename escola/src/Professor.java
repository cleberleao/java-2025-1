public class Professor extends Pessoa {
    private String uc;


    public Professor(String nome, String cpf, String uc) {
        super(nome, cpf);
        this.uc = uc;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Unidade Curricular: "+ uc);
    }
}
