package models;

public class TecnicoAdministrativo extends Funcionario {

	String funcao;

	String codigo;

	public void lerDados(String funcao, String codigo) {
		this.funcao = funcao;
		this.codigo = codigo;
	}

	public void mostrarDados() {
		System.out.println("Função: " + this.funcao + " Código: " + this.codigo);
	}
}