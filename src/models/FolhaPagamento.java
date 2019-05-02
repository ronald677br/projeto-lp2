package models;

import java.util.List;

public class FolhaPagamento {

    private float totalFolha = 0;

    private double totalEncargos;

    public void somarFolha(List<Funcionario> funcionarios) {
        for(Funcionario funcionario : funcionarios) {
            this.totalFolha += funcionario.getSalario();
        }
    }

    public double calcularIRRF(Funcionario f) {
        if(f.getSalario() <= 190398) {
            return 0;
        }

        if(f.getSalario() >= 190399 && f.getSalario() <= 282665) {
            return (f.getSalario() * 7.5) / 100;
        }

        if(f.getSalario() >= 282666 && f.getSalario() <= 375105) {
            return (f.getSalario() * 15) / 100;
        }

        if(f.getSalario() >= 375106 && f.getSalario() <= 466468) {
            return (f.getSalario() * 22.5) / 100;
        }

        if(f.getSalario() > 466468) {
            return (f.getSalario() * 27.5) / 100;
        }

    }
    
}
