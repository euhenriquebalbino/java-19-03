package com.exercicio;

public abstract class Conta {
    private String numeroConta;
    private double saldo;
    private Titular titular;
    private Notificador notificador;

    public Conta(String numero, Titular titular, Notificador notif) {
        this.numeroConta = numero;
        this.titular = titular;
        this.notificador = notif;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numeroConta;
    }

    public Titular getTitular() {
        return titular;
    }

    public void exibir() {
        System.out.println("Conta: " + numeroConta + " | Titular: " + titular.getNome() + " | Saldo: R$ " + String.format("%.2f", saldo));
    }

    public void consultarSaldo() {
        notificador.enviarSaldo(titular, saldo);
    }

    protected Notificador getNotificador() {
        return notificador;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
