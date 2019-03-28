package models;

public class Aluno {

    private String nome;

    private String email;

    private String telefone;

	private int codigoAluno;


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

	public boolean setEmail() {

		if("".equals(email)) {
			return false;
		}

		this.email = email;
		return true;

	}

	public String getTelefone() {

		return telefone;

	}

	public boolean setTelefone() {

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

		if("".equals(codigoAluno)) {
			return false;
		}

		this.codigoAluno = codigoAluno;
		return true;
	}

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
