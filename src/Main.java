import models.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        AlunoGraduacao aluno = new AlunoGraduacao();

        aluno.lerDados();
        aluno.mostrarDados();

        CursoGraduacao curso = new CursoGraduacao();

        curso.lerDados();
        curso.mostrarDados();

        Disciplina disciplina = new Disciplina();

        disciplina.lerDados();
        disciplina.mostrarDados();

        Professor professor = new Professor();

        professor.lerDadosProf();
        professor.mostrarDados();

        TecnicoAdministrativo tecnicoAdministrativo = new TecnicoAdministrativo();

        tecnicoAdministrativo.lerDadosTecnico();
        tecnicoAdministrativo.mostrarDados();
		ler.close();
    }
}
