package com.exercicio;

public class Notificador {
    private String canal;

    public Notificador(String canal) {
        this.canal = canal;
    }

    public String getCanal() {
        return canal;
    }

    public void enviarSaldo(Titular titular, double saldo) {
        System.out.println("[" + canal + "] Notificação para " + titular.getNome() + ": Saldo atual = R$ " + String.format("%.2f", saldo));
    }

    public void enviarAlerta(Titular titular, String msg) {
        System.out.println("[" + canal + "] Alerta para " + titular.getNome() + ": " + msg);
    }
}
