package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalavraPrimaTest {

	@Test
	public void testConverteLetraAMinusculo() {
		int valor = PalavraPrima.converteEmNumero("a");
		assertEquals(1, valor);
	}

}
