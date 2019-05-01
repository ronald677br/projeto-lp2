package models;

import java.util.Scanner;

public class CursoGraduacao extends Curso {

	public void lerDados() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Cadastro do curso:");
		System.out.println("Digite o nome:");
		this.setNome(scanner.nextLine());

		System.out.println("Digite o codigo:");
		this.setCodigo(scanner.nextInt());

		scanner.nextLine();
		System.out.println("Digite a duracao:");
		this.setDuracao(scanner.nextLine());
		scanner.close();
	}

	public void mostrarDados() {

		System.out.println("-------Curso-------");
		String out = "Nome: " + this.getNome();
		out += " \nCódigo: " + this.getCodigo();
		out += " \nDuração: " + this.getDuracao();
		System.out.println(out);

	}

	public String getNome() {
		return nome;
	}

	public boolean setNome(String nome) {
		if (nome.equals("")) {
			return false;
		}
		this.nome = nome;
		return true;
	}

	public int getCodigo() {
		return codigo;
	}

	public boolean setCodigo(int codigo) {
		if (codigo < 0) {
			return false;
		}
		this.codigo = codigo;
		return true;
	}

	public String getDuracao() {
		return duracao;
	}

	public boolean setDuracao(String duracao) {
		if (duracao.equals("")) {
			return false;
		}
		this.duracao = duracao;
		return true;
	}
}