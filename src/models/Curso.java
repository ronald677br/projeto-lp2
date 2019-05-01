package models;

public abstract class Curso {

	protected String nome;

	protected int codigo;

	protected String duracao;

	public abstract void lerDados();

	public abstract void mostrarDados();

	public abstract String getNome();

	public abstract boolean setNome(String nome);

	public abstract int getCodigo();

	public abstract boolean setCodigo(int codigo);

	public abstract String getDuracao();

	public abstract boolean setDuracao(String duracao);
}
