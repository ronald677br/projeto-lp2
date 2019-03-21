package models;

public class Disciplina {
    int codigo;

    String nome;

	String duracao;

	public void lerDados(int codigo, String nome, String duracao) {
		this.codigo = codigo;
		this.nome = nome;
		this.duracao = duracao;
	}

	public void mostrarDados() {
		String out = "Nome: " + this.nome;
		out += " Código: " + this.codigo;
		out += " Duração: " + this.duracao;
		System.out.println(out);
	}
}