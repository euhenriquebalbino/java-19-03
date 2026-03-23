package com.exercicio;

public class ContaPoupanca extends Conta {
    private double taxaJuros;
    private int diaAniversario;

    public ContaPoupanca(String numero, Titular titular, Notificador notif, double taxa) {
        super(numero, titular, notif);
        this.taxaJuros = taxa;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxa) {
        this.taxaJuros = taxa;
    }

    public void renderJuros() {
        double juros = getSaldo() * taxaJuros;
        setSaldo(getSaldo() + juros);
        getNotificador().enviarAlerta(getTitular(), "Rendimento de R$ " + String.format("%.2f", juros) + " creditado na poupança.");
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    @Override
    public boolean sacar(double valor) {
        return super.sacar(valor);
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("  Tipo: Conta Poupança | Taxa de Juros: " + String.format("%.2f%%", taxaJuros * 100));
    }
}
