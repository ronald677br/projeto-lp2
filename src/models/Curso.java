package models;

public class Curso {

    String nome;

    int codigo;

    String duracao;

	public void lerDados(String nome, int codigo, String duracao) {
		this.nome = nome;
		this.duracao = duracao;
		this.codigoAluno = codigo;
	}

	public void mostrarDados() {
		String out = "Nome: " + this.nome;
		out += " Código: " + this.codigo;
		out += " Duração: " + this.duracao;
		System.out.println(out);
	}
}
