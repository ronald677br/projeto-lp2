package models;

public class AlunoPosGraduacao extends Aluno {

    private String graduacao;

    private String instituicao;

    private String anoInicio;

    private String anoFinal;

    private Curso curso;

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setAnoInicio(String anoInicio) {
        this.anoInicio = anoInicio;
    }

    public String getAnoInicio() {
        return anoInicio;
    }

    public void setAnoFinal(String anoFinal) {
        this.anoFinal = anoFinal;
    }

    public String getAnoFinal() {
        return anoFinal;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }
}
