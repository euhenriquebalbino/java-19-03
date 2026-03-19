package com.exercicio;

public class Titular {
    private String nome, cpf, email;

    public Titular(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void exibir() {
        System.out.println("Titular: " + nome + " | CPF: " + cpf + " | Email: " + email);
    }
}
