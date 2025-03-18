package singleton.main;

import java.util.List;

public class Jogador {

    private Jogador() {};
    private static Jogador instance = new Jogador();
    public static Jogador getInstance() {
        return instance;
    }

    private double saldo;
    private String usuarioLogado;

    private List<Aposta> apostas;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public List<Aposta> getApostas() { return apostas; }

    public void addApostas (Aposta ap) {apostas.add(ap);}
}