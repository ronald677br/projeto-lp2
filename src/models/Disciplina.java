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
		System.out.println("-------Disciplina-------");
		String out = "Nome: " + this.nome;
		out += " \nCódigo: " + this.codigo;
		out += " \nDuração: " + this.duracao;
		System.out.println(out);
	}
}