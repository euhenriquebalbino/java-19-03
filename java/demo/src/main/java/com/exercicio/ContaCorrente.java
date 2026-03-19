package com.exercicio;

public class ContaCorrente extends Conta {
    private double limite;
    private int diaVencimento;

    public ContaCorrente(String numero, Titular titular, Notificador notif, double limite) {
        super(numero, titular, notif);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    /** Saca usando o limite de crédito além do saldo */
    public boolean sacarComLimite(double valor) {
        if (valor > 0 && (getSaldo() + limite) >= valor) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    public void cobrarTarifa() {
        double tarifa = 12.50;
        setSaldo(getSaldo() - tarifa);
        getNotificador().enviarAlerta(getTitular(),
                "Tarifa de R$ " + String.format("%.2f", tarifa) + " cobrada na conta corrente.");
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("  Tipo: Conta Corrente | Limite: R$ " + String.format("%.2f", limite));
    }
}
