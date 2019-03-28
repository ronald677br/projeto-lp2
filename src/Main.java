import models.*;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.lerDados("Matheus", "EueRona@gnos.com", "54-3333-5555", 12345);
        aluno.mostrarDados();

        Curso curso = new Curso();

        curso.lerDados("Javologia",12345, "1200h");
        curso.mostrarDados();

        Disciplina disciplina = new Disciplina();

        disciplina.lerDados(12345, "Java", "1230h");
        disciplina.mostrarDados();

        Professor professor = new Professor();

        professor.lerDados("Penaldo","Rua dos Brabo", "(54)3332-2222", "111.222.333-44", "00004", 15000, "oBrabo", "Todas");
        professor.mostrarDados();

        TecnicoAdministrativo tecnicoAdministrativo = new TecnicoAdministrativo();

        tecnicoAdministrativo.lerDados("Neymar","Rua dos Brabo", "(54)3332-2222", "111.222.333-44", "00004", 15000);
        tecnicoAdministrativo.mostrarDados();

    }
}
