package models;

import java.util.Scanner;

public class TecnicoAdministrativo extends Funcionario {

	public void lerDadosTecnico() {
		System.out.println("Cadastro do tecnico:");

		this.lerDados();
	}

	public void mostrarDados() {

		System.out.println("-------Técnico Administrativo-------");
		System.out.println("Nome: " + this.getNome() + "\nEndereço: " + this.getEndereco() +
				"\nTelefone: " + this.getTelefone() + "\nCPF: " + this.getCpf() +
				"\nnumCTPS: " + this.getNumCTPS() + "\nSalário: " + this.getSalario());
	}
}