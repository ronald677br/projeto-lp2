package models;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Funcionario {

    private String titulacao;

    private String areaPesquisa;

	private ArrayList<Disciplina> disciplinas;

	public addDisciplina(int codigo, String nome, String duracao) {
		Disciplina disciplina = new Disciplina();
		disciplina.setCodigo(codigo);
		disciplina.setNome(nome);
		disciplina.setDuracao(duracao);

		disciplinas.add(disciplina);
	}

	public String getTitulacao() {

        return titulacao;

    }

    public boolean setTitulacao(String titulacao) {

        if("".equals(titulacao)) {
            return false;
        }

        this.titulacao = titulacao;
        return true;

    }

    public String getAreaPesquisa() {

        return areaPesquisa;

    }

    public boolean setAreaPesquisa(String areaPesquisa) {

        if("".equals(areaPesquisa)) {
            return false;
        }

        this.areaPesquisa = areaPesquisa;
        return true;

    }

    public void lerDadosProf() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro do professor:");
        this.lerDados();
        System.out.println("Digite a titulação:");
        this.setTitulacao(scanner.nextLine());
        System.out.println("Digite a área de pesquisa:");
        this.setAreaPesquisa(scanner.nextLine());

    }

    public void mostrarDados() {

        System.out.println("-------Professor-------");
        System.out.println("Nome: " + this.getNome() + "\nEndereço: " + this.getEndereco() +
                           "\nTelefone: " + this.getTelefone() + "\nCPF: " + this.getCpf() +
                           "\nnumCTPS: " + this.getNumCTPS() + "\nSalário: " + this.getSalario() +
                           "\nTitulação: " + this.getTitulacao() + "\nAreá de Pesquisa: " + this.getAreaPesquisa());

    }

}
