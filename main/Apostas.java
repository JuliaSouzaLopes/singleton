package singleton.main;

public class Apostas {

    private Apostas() {};
    private static Apostas instance = new Apostas();
    public static Apostas getInstance() {
        return instance;
    }

    private double saldo;
    private String usuarioLogado;

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
}