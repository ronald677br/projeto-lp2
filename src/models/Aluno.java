package models;

public class Aluno {

    private String nome;

    private String email;

    private String telefone;

	private int codigoAluno;
	
	public void lerDados(String nome, String email, String telefone, int codigoAluno) {

		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.codigoAluno = codigoAluno;

	}

	public void mostrarDados() {

		System.out.println("-------Aluno-------");
		String out = "Nome: " + this.nome;
		out += " \nE-mail: " + this.email;
		out += " \nTelefone: " + this.telefone;
		out += " \nCódigo do Aluno: " + this.codigoAluno;
		System.out.println(out);

	}
}
