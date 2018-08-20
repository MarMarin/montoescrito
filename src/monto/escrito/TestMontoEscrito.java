package monto.escrito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMontoEscrito {

	@Test
	public void test1Unidades() {
		MontoEscrito tested = new MontoEscrito();
		String resultado = tested.noletra(9);
		String esperado = "Nueve";
		assertEquals(esperado, resultado);
		}	
	
	@Test
	public void test2Decenas() {
		MontoEscrito tested = new MontoEscrito();
		String resultado = tested.noletra(29);
		String esperado = "Veinte y Nueve";
		assertEquals(esperado, resultado);
		}
	
	@Test
	public void test3Centenas() {
		MontoEscrito tested = new MontoEscrito();
		String resultado = tested.noletra(341);
		String esperado = "Trecientos Cuarenta y Uno";
		assertEquals(esperado, resultado);
		}	
	
	@Test
	public void test4UnidadesdeMil() {
		MontoEscrito tested = new MontoEscrito();
		String resultado = tested.noletra(2345);
		String esperado = "Dosmil Trecientos Cuarenta y Cinco";
		assertEquals(esperado, resultado);
		}	
}
