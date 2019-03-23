package models;

public class TecnicoAdministrativo extends Funcionario {

	public void lerDados(String nome, String endereco, String telefone, String cpf, String numCTPS, float salario) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.numCTPS = numCTPS;
		this.salario = salario;

	}

	public void mostrarDados() {

		System.out.println("-------Técnico Administrativo-------");
		System.out.println("Nome: " + this.nome + "\nEndereço: " + this.endereco +
				"\nTelefone: " + this.telefone + "\nCPF: " + this.cpf +
				"\nnumCTPS: " + this.numCTPS + "\nSalário: " + this.salario);
	}
}