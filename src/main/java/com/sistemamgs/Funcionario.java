package com.sistemamgs;

public class Funcionario {
    private String id;
    private String nome;
    private String alergias;
    private String condicoesMedicas;
    private String telefoneContatoEmergencia;
    private String emailContatoEmergencia;

    public Funcionario(String id, String nome, String alergias, String condicoesMedicas, String telefoneContatoEmergencia, String emailContatoEmergencia) {
        this.id = id;
        this.nome = nome;
        this.alergias = alergias;
        this.condicoesMedicas = condicoesMedicas;
        this.telefoneContatoEmergencia = telefoneContatoEmergencia;
        this.emailContatoEmergencia = emailContatoEmergencia;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getCondicoesMedicas() {
        return condicoesMedicas;
    }

    public String getTelefoneContatoEmergencia() {
        return telefoneContatoEmergencia;
    }

    public String getEmailContatoEmergencia() {
        return emailContatoEmergencia;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nAlergias: " + alergias + "\nCondições Médicas: " + condicoesMedicas + "\nTelefone de Contato de Emergência: " + telefoneContatoEmergencia + "\nEmail de Contato de Emergência: " + emailContatoEmergencia;
    }
}



