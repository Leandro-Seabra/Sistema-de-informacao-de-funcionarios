package com.sistemamgs;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Funcionario> funcionarios;

    public Sistema() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public Funcionario obterFuncionarioPorId(String id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId().equals(id)) {
                return funcionario;
            }
        }
        return null;
    }

    public void exibirInformacoesFuncionario(String id) {
        Funcionario funcionario = obterFuncionarioPorId(id);
        if (funcionario != null) {
            System.out.println(funcionario);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}


