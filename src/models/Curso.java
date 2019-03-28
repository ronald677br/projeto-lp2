package models;

public class Curso {

    private String nome;

    private int codigo;

    private String duracao;

	public void lerDados(String nome, int codigo, String duracao) {
		this.nome = nome;
		this.duracao = duracao;
		this.codigo = codigo;
	}

	public void mostrarDados() {

		System.out.println("-------Curso-------");
		String out = "Nome: " + this.nome;
		out += " \nCódigo: " + this.codigo;
		out += " \nDuração: " + this.duracao;
		System.out.println(out);

	}

}
