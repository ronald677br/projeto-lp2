package models;

import validators.CPFValidate;

public class Funcionario {

    private String nome;

    private String endereco;

    private String telefone;

    private String cpf;

    private String numCTPS;

    private float salario;

    public boolean setNome(String nome) {
        if ("".equals(nome)) {
            return false;
        }
        this.codigo = codigo;
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

    public String getNumCTPS(String numCTPS) {
        return numCTPS;
    }

    public boolean setNumCTPS(String numCTPS) {
        if ("".equals(numCTPS)) {
            return false;
        }
        this.numCTPS = numCTPS;
        return true;
    }

    public String getSalario() {
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
