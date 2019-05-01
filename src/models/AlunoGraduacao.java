package models;

import java.util.Scanner;

public class AlunoGraduacao {

    private String nome;

    private String email;

    private String telefone;

	private int codigoAluno;

	private Byte situacao;

	private CursoGraduacao curso;

	public CursoGraduacao getCurso() {
		return curso;
	}

	public void setCurso() {
		curso.lerDados();
	}

	public String getNome() {
		return nome;
	}

	public boolean setNome(String nome) {
		if("".equals(nome)) {
			return false;
		}
		this.nome = nome;
		return true;
	}

	public String getEmail() {
		return email;
	}

	public boolean setEmail(String email) {
		if("".equals(email)) {
			return false;
		}
		this.email = email;
		return true;
	}

	public String getTelefone() {
		return telefone;
	}

	public boolean setTelefone(String telefone) {
		if("".equals(telefone)) {
			return false;
		}
		this.telefone = telefone;
		return true;
	}

	public int getCodigoAluno() {
		return codigoAluno;
	}

	public boolean setCodigoAluno(int codigoAluno) {
		if (codigoAluno == 0) {
			return false;
		}
		this.codigoAluno = codigoAluno;
		return true;
	}

	public void lerDados() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Cadastro do aluno:");
		System.out.println("Digite o nome:");
		this.setNome(scanner.nextLine());

		System.out.println("Digite o email:");
		this.setEmail(scanner.nextLine());

		System.out.println("Digite o telefone:");
		this.setTelefone(scanner.nextLine());

		System.out.println("Digite o codigo:");
		this.setCodigoAluno(scanner.nextInt());
		scanner.close();
	}

	public void mostrarDados() {

		System.out.println("-------Aluno-------");
		String out = "Nome: " + this.getNome();
		out += " \nE-mail: " + this.getEmail();
		out += " \nTelefone: " + this.getTelefone();
		out += " \nCódigo do Aluno: " + this.getCodigoAluno();
		System.out.println(out);

	}

	public boolean setSituacao(Character situacao) {
		switch (situacao) {
			case 'M':
				this.situacao = 1;
				break;
			case 'T':
				this.situacao = 2;
				break;
			case 'D':
				this.situacao = 3;
				break;
			default:
				return false;
		}
		return true;
	}

	public Character getSituacao() {
		switch (situacao) {
			case 1:
				return 'M';
			case 2:
				return 'T';
			case 3:
				return 'D';
			default:
				return 'n';
		}
	}
}
