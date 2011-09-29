import static org.junit.Assert.*;

import org.junit.Test;


public class EquacaoSegundoGrauTeste {

	@Test
	public void equacaoSegundoGrau() {
		double[] resultado = CalculaEquacao.equacaoSegundoGrau(1, -2, -3);
		assertArrayEquals(new double[] {3, -1}, resultado, 0);
	}
	
	@Test
	public void equacaoSegundoGrauDeltaNegativo() {
		Object resultado = CalculaEquacao.equacaoDeltaNegativo(1, -4, 5);
		assertEquals(null,resultado);
	}
}
