package singleton.test;

import org.junit.jupiter.api.Test;
import singleton.main.Apostas;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApostasTest {

    @Test
    public void deveRetornarNomeEscola() {
        Apostas.getInstance().setSaldo(85.99);
        assertEquals(85.99, Apostas.getInstance().getSaldo());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Apostas.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", Apostas.getInstance().getUsuarioLogado());
    }

}