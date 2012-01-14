package tdd;
import static org.junit.Assert.*;

import org.junit.Test;

import funcao.ANaoPodeSerZeroException;
import funcao.FuncaoSegundoGrau;
import funcao.Parabola;
import funcao.Vertice;



public class EquacaoSegundoGrauTeste {
	
	@Test
	public void testaResultadoDelta() throws ANaoPodeSerZeroException{
		FuncaoSegundoGrau es = new FuncaoSegundoGrau();
		es.calculaDelta(1, -6, 8);

		assertEquals(4,es.getDelta(), 0);	
	}

	@Test
	public void testaResultadoRaizesFuncao() throws ANaoPodeSerZeroException {
		FuncaoSegundoGrau es = new FuncaoSegundoGrau();
		es.calculaDelta(1, -6, 8);
		es.calculaRaizes();
		es.mostraResultadoDeDeltaERaizesDaFuncao();
		
		assertEquals(2,es.getXNegativo(),0);
		assertEquals(4,es.getXPositivo(),0);
	}
	
	@Test
	public void testaResultadoCoordenadasVertice() throws ANaoPodeSerZeroException{
		FuncaoSegundoGrau es = new FuncaoSegundoGrau();
		es.calculaDelta(1, -6, 8);
		
		Vertice v = new Vertice();
		v.calculaCoordenadasVertice(es);
	
		assertEquals(3,v.getXv(),0);
		assertEquals(-1,v.getYv(),0);
	}
	
	@Test
	public void testaResultadoConcavidadeERelacaoEixoXParabola() throws ANaoPodeSerZeroException{
		FuncaoSegundoGrau es = new FuncaoSegundoGrau();
		es.calculaDelta(1, -6, 8);
		
		Parabola p = new Parabola();

		assertEquals("A parábola intercepta o eixo x em dois pontos.",p.defineRelacaoComEixoX(es));
		assertEquals("A concavidade da parábola está voltada para cima, pois a > 0.",p.defineConcavidade(es));
	}
}
