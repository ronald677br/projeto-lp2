package models;

public class Professor extends Funcionario {

    String titulacao;

    String areaPesquisa;

    public void lerDados(String nome, String endereco, String telefone, String cpf, String numCTPS, float salario, String titulacao, String areaPesquisa) {

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.numCTPS = numCTPS;
        this.salario = salario;
        this.titulacao = titulacao;
        this.areaPesquisa = areaPesquisa;

    }

    public void mostrarDados() {

        System.out.println("-------Professor-------");
        System.out.println("Nome: " + this.nome + "\nEndereço: " + this.endereco +
                           "\nTelefone: " + this.telefone + "\nCPF: " + this.cpf +
                           "\nnumCTPS: " + this.numCTPS + "\nSalário: " + this.salario +
                           "\nTitulação: " + this.titulacao + "\nAreá de Pesquisa: " + this.areaPesquisa);

    }

}
