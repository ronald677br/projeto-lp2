package models;

public class Disciplina {

    private int codigo;

    private String nome;

	private String duracao;

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

	public boolean setCodigo(int codigo) {
		if (codigo < 0) {
			return false;
		}
		return this.codigo = codigo;
	}

	public void getCodigo() {
		return codigo;
	}

	public boolean setNome(String nome) {
		if ("".equals(nome)) {
			return false;
		}
		this.nome = nome;
		return true;
	}

	public void getNome() {
		return nome;
	}

	public void getDuracao() {
		return duracao;
	}

	public boolean setDuracao(String duracao) {
		if ("".equals(duracao)) {
			return false;
		}
		this.duracao = duracao;
		return true;
	}
}