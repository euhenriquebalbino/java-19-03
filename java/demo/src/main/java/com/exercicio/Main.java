package com.exercicio;

public class Main {
    public static void main(String[] args) {
        // Criando titular e notificador
        Titular titular = new Titular("Maria Silva", "123.456.789-00", "maria@email.com");
        Notificador notif = new Notificador("Email");

        // Conta Corrente
        ContaCorrente cc = new ContaCorrente("001-1", titular, notif, 500.0);
        cc.depositar(1000.0);
        cc.exibir();
        cc.consultarSaldo();
        cc.cobrarTarifa();
        cc.sacarComLimite(1400.0);
        cc.exibir();

        System.out.println("---");

        // Conta Poupança
        Titular titular2 = new Titular("João Santos", "987.654.321-00", "joao@email.com");
        Notificador notif2 = new Notificador("SMS");

        ContaPoupanca cp = new ContaPoupanca("002-2", titular2, notif2, 0.005);
        cp.depositar(2000.0);
        cp.exibir();
        cp.renderJuros();
        cp.exibir();
        cp.consultarSaldo();
    }
}