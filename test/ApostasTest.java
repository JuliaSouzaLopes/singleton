package singleton.test;

import org.junit.jupiter.api.Test;
import singleton.main.Jogador;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApostasTest {

    @Test
    public void deveRetornarNomeEscola() {
        Jogador.getInstance().setSaldo(85.99);
        assertEquals(85.99, Jogador.getInstance().getSaldo());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Jogador.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", Jogador.getInstance().getUsuarioLogado());
    }

}