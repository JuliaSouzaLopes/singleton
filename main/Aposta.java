package singleton.main;

public class Aposta {

    public Aposta () {};

    public Jogador jogador;

    public double valor;

    public String resultado;

    public Jogador getJogador() {return jogador;}

    public void setJogador(Jogador jogador) {this.jogador = jogador;}

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getResultado() {return resultado;}

    public void setResultado (String resultado) {this.resultado = resultado;}



}
