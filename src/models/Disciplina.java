package models;

import java.util.Scanner;

public class Disciplina {

    private int codigo;

    private String nome;

	private String duracao;

	public void lerDados() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro da disciplina:");
        System.out.println("Digite o codigo:");
		this.setCodigo(scanner.nextInt());

		scanner.nextLine();
		System.out.println("Digite o nome:");
		this.setNome(scanner.nextLine());

		System.out.println("Digite a duracao:");
		this.setDuracao(scanner.nextLine());
	}

	public void mostrarDados() {
		System.out.println("-------Disciplina-------");
		String out = "Nome: " + this.getNome();
		out += " \nCódigo: " + this.getDuracao();
		out += " \nDuração: " + this.getDuracao();
		System.out.println(out);
	}

	public boolean setCodigo(int codigo) {
		if (codigo < 0) {
			return false;
		}
		this.codigo = codigo;
		return true;
	}

	public int getCodigo() {
		return codigo;
	}

	public boolean setNome(String nome) {
		if ("".equals(nome)) {
			return false;
		}
		this.nome = nome;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public String getDuracao() {
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