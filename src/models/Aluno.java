package models;

public class Aluno {

    String nome;

    String email;

    String telefone;

	int codigoAluno;
	
	public void lerDados(String nome, String email, String telefone, int codigoAluno) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.codigoAluno = codigoAluno;
	}

	public void mostrarDados() {
		String out = "Nome: " + this.nome;
		out += " E-mail: " + this.email;
		out += " Telefone: " + this.telefone;
		out += " Código do Aluno: " + this.codigoAluno;
		System.out.println(out);
	}
}
