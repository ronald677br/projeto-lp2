package models;

public abstract class Aluno extends Pessoa {

	protected String nome;

	protected String email;

	protected String telefone;

	protected int codigoAluno;

	protected Byte situacao;

	public abstract String getNome();

	public abstract boolean setNome(String nome);

	public abstract String getEmail();

	public abstract boolean setEmail(String email);

	public abstract String getTelefone();

	public abstract boolean setTelefone(String telefone);

	public abstract int getCodigoAluno();

	public abstract boolean setCodigoAluno(int codigoAluno);

	public abstract void lerDados();

	public abstract void mostrarDados();

	public abstract boolean setSituacao(Character situacao);

	public abstract Character getSituacao();

}