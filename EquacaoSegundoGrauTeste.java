import static org.junit.Assert.*;

import org.junit.Test;


public class EquacaoSegundoGrauTeste {

	@Test
	public void equacaoSegundoGrau() {
		int resultado = CalculaEquaçao.equacaoPositiva(1, -2, -3);
		assertEquals(3, resultado);
	}
	
	@Test
	public void equacaoSegundoGrauNegativa() {
		int resultado = CalculaEquaçao.equacaoNegativa(1, -2, -3);
		assertEquals(-1,resultado);
	}
	
	@Test
	public void equacaoSegundoGrauDeltaZero() {
		double resultado = CalculaEquaçao.equacaoDeltaZero(4, -4, 1);
		assertEquals(0.5d, (double) resultado, 0.5d);
	}
	
	@Test
	public void equacaoSegundoGrauDeltaNegativo() {
		Object resultado = CalculaEquaçao.equacaoDeltaNegativo(1, -4, 5);
		assertEquals(null,resultado);
	}

}
