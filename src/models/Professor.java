package models;

public class Professor extends Funcionario {

    String titulacao;

    String areaPesquisa;

    public void lerDados(String nome, String endereco, String telefone, String cpf, String numCTPS, float salario) {

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.numCTPS = numCTPS;
        this.salario = salario;

    }

    public  void mostrarDados() {

        System.out.println("Nome: " + nome + "\nEndereço: " + endereco +
                           "\nTelefone: " + telefone + "\nCPF: " + cpf +
                           "\nnumCTPS: " + numCTPS + "\nSalário: " + salario);

    }

}
