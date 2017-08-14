package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalavraPrimaTest {

	@Test
	public void testConverteLetraAMinusculo() {
		int valor = PalavraPrima.converteEmNumero("a");
		assertEquals(1, valor);
	}

	@Test
	public void testConverteLetraBMinusculo() {
		int valor = PalavraPrima.converteEmNumero("b");
		assertEquals(2, valor);
	}

	@Test
	public void testConverteLetraCMinusculo() {
		int valor = PalavraPrima.converteEmNumero("c");
		assertEquals(3, valor);
	}

	@Test
	public void testConverteLetraAMaisculo() {
		int valor = PalavraPrima.converteEmNumero("A");
		assertEquals(27, valor);
	}

	@Test
	public void testConverteLetraZMinusculo() {
		int valor = PalavraPrima.converteEmNumero("z");
		assertEquals(26, valor);
	}

	@Test
	public void testConverteLetraZMaiusculo() {
		int valor = PalavraPrima.converteEmNumero("Z");
		assertEquals(52, valor);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConverteLetraInvalida() {
		int valor = PalavraPrima.converteEmNumero("Ç");
	}

	@Test
	public void test2EhNumeroPrimo() {
		boolean resultadoTeste = PalavraPrima.ehPrimo(2);
		assertEquals(true, resultadoTeste);
	}

	@Test
	public void test26EhNumeroPrimo() {
		boolean resultadoTeste = PalavraPrima.ehPrimo(26);
		assertEquals(false, resultadoTeste);
	}

	@Test
	public void test1NaoEhNumeroPrimo() {
		boolean resultadoTeste = PalavraPrima.ehPrimo(1);
		assertEquals(false, resultadoTeste);

	}

	@Test
	public void testConverteTextoAAMinusculo() {
		int valor = PalavraPrima.converteEmNumero("aa");
		assertEquals(2, valor);

	}

}
