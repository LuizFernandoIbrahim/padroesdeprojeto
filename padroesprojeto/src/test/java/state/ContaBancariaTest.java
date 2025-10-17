package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    ContaBancaria conta;

    @BeforeEach
    void setUp() {
        conta = new ContaBancaria();
        conta.setTitular("José da Silva");
    }

    @Test
    void devePermitirBloquearContaAtiva() {
        assertTrue(conta.bloquear());
        assertEquals("Bloqueada", conta.getNomeEstado());
    }

    @Test
    void devePermitirEncerrarContaAtiva() {
        assertTrue(conta.encerrar());
        assertEquals("Encerrada", conta.getNomeEstado());
    }

    @Test
    void devePermitirSuspenderContaAtiva() {
        assertTrue(conta.suspender());
        assertEquals("Suspensa", conta.getNomeEstado());
    }

    @Test
    void devePermitirTornarContaInadimplente() {
        assertTrue(conta.inadimplir());
        assertEquals("Inadimplente", conta.getNomeEstado());
    }

    @Test
    void naoDeveEncerrarContaJaEncerrada() {
        conta.encerrar();
        assertFalse(conta.encerrar());
        assertEquals("Encerrada", conta.getNomeEstado());
    }

    @Test
    void devePermitirReativarContaBloqueada() {
        conta.bloquear();
        assertTrue(conta.reativar());
        assertEquals("Ativa", conta.getNomeEstado());
    }

    @Test
    void devePermitirReativarContaInadimplente() {
        conta.inadimplir();
        assertTrue(conta.reativar());
        assertEquals("Ativa", conta.getNomeEstado());
    }

    @Test
    void devePermitirReativarContaSuspensa() {
        conta.suspender();
        assertTrue(conta.reativar());
        assertEquals("Ativa", conta.getNomeEstado());
    }

    @Test
    void devePermitirEncerrarContaBloqueada() {
        conta.bloquear();
        assertTrue(conta.encerrar());
        assertEquals("Encerrada", conta.getNomeEstado());
    }

    @Test
    void devePermitirEncerrarContaSuspensa() {
        conta.suspender();
        assertTrue(conta.encerrar());
        assertEquals("Encerrada", conta.getNomeEstado());
    }

    @Test
    void devePermitirEncerrarContaInadimplente() {
        conta.inadimplir();
        assertTrue(conta.encerrar());
        assertEquals("Encerrada", conta.getNomeEstado());
    }

    @Test
    void naoDeveReativarContaEncerrada() {
        conta.encerrar();
        assertFalse(conta.reativar());
        assertEquals("Encerrada", conta.getNomeEstado());
    }

    @Test
    void naoDeveBloquearContaEncerrada() {
        conta.encerrar();
        assertFalse(conta.bloquear());
        assertEquals("Encerrada", conta.getNomeEstado());
    }

    @Test
    void deveManterEstadoInicialAtivoAoCriarConta() {
        assertEquals("Ativa", conta.getNomeEstado());
    }

    @Test
    void naoDeveInadimplirContaEncerrada() {
        conta.encerrar();
        assertFalse(conta.inadimplir());
        assertEquals("Encerrada", conta.getNomeEstado());
    }

    @Test
    void naoDeveSuspenderContaEncerrada() {
        conta.encerrar();
        assertFalse(conta.suspender());
        assertEquals("Encerrada", conta.getNomeEstado());
    }

}