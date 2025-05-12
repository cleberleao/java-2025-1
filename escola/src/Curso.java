public class Curso {
    private String nomeCurso;
    private int cargaHoraria;

    public Curso(String nomeCurso, int cargaHoraria){
        this.nomeCurso = nomeCurso;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void exibirCurso(){
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Carga Horaria: "+ cargaHoraria + " horas");
    }
}
