package models;

import validators.CPFValidate;

import java.util.Scanner;

public class Funcionario {

    private String nome;

    private String endereco;

    private String telefone;

    private String cpf;

    private String numCTPS;

    private float salario;

    protected void lerDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        this.setNome(scanner.nextLine());
        System.out.println("Digite o endereço:");

        this.setEndereco(scanner.nextLine());
        System.out.println("Digite o telefone:");

        this.setTelefone(scanner.nextLine());

        System.out.println("Digite o CPF:");
        while (!this.setCpf(scanner.nextLine())) {
            System.out.println("Digite o CPF:");
        }


        System.out.println("Digite o CTPS:");

        this.setNumCTPS(scanner.nextLine());
        System.out.println("Digite o Salário:");

        this.setSalario(scanner.nextFloat());
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if ("".equals(nome)) {
            return false;
        }
        this.nome = nome;
        return true;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean setEndereco(String endereco) {
        if (endereco.equals("")) {
            return false;
        }
        this.endereco = endereco;
        return true;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean setTelefone(String telefone) {
        if ("".equals(telefone)) {
            return false;
        }
        this.telefone = telefone;
        return true;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean setCpf(String cpf) {
		if (CPFValidate.isCPF(cpf)) {
			this.cpf = cpf;
			return true;
		}

		return false;
    }

    public String getNumCTPS() {
        return numCTPS;
    }

    public boolean setNumCTPS(String numCTPS) {
        if ("".equals(numCTPS)) {
            return false;
        }
        this.numCTPS = numCTPS;
        return true;
    }

    public float getSalario() {
        return salario;
    }

    public boolean setSalario(float salario) {
        if (salario < 0) {
            return false;
        }

        this.salario = salario;
        return true;
    }
}
