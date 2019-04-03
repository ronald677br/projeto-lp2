import models.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.lerDados();
        aluno.mostrarDados();

        Curso curso = new Curso();

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

    }
}
