package models;

public class TecnicoAdministrativo extends Funcionario {

	private float valorHoraExtra;

	private int numeroHoraExtra;

	private float salarioBase;

	public void lerDadosTecnico() {
		System.out.println("Cadastro do tecnico:");

		this.lerDados();
	}

	public float calcularSalario() {
		return salarioBase + numeroHoraExtra * valorHoraExtra;
	}

	public void mostrarDados() {

		System.out.println("-------Técnico Administrativo-------");
		System.out.println("Nome: " + this.getNome() + "\nEndereço: " + this.getEndereco() +
				"\nTelefone: " + this.getTelefone() + "\nCPF: " + this.getCpf() +
				"\nnumCTPS: " + this.getNumCTPS() + "\nSalário: " + this.getSalario());
	}
}