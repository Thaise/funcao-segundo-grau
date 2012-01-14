package funcao.testes;

import java.util.Scanner;

import funcao.ANaoPodeSerZeroException;
import funcao.FuncaoSegundoGrau;
import funcao.Parabola;
import funcao.Vertice;

public class CalculandoFuncao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System .in);
		String continuar = "s";
		while(continuar.equalsIgnoreCase("s")){
			System.out.println("::Função do segundo grau::");
			
			System.out.print("Digite a: ");
			String aString = entrada.nextLine();
			System.out.print("Digite b: ");
			String bString = entrada.nextLine();
			System.out.print("Digite c: ");
			String cString = entrada.nextLine();
			
			double a = Double.parseDouble(aString);
			double b = Double.parseDouble(bString);
			double c = Double.parseDouble(cString);
			
			calculaFuncao(a,b,c);
			
			System.out.print("Deseja calcular mais funções? [S - sim / N - não]: ");
			continuar = entrada.nextLine();
		}

	}

	private static void calculaFuncao(double a, double b, double c) {
		FuncaoSegundoGrau funcao = new FuncaoSegundoGrau();	
		Vertice vertice = new Vertice();
		Parabola parabola = new Parabola();
		
		try {
			funcao.calculaDelta(a, b, c);
			funcao.calculaRaizes();
			parabola.defineConcavidade(funcao);
			parabola.defineRelacaoComEixoX(funcao);
			
			funcao.mostraResultadoDeDeltaERaizesDaFuncao();
			parabola.mostraConcavidadeERelacaoComEixoX();
			vertice.calculaCoordenadasVertice(funcao);
			
		} catch (ANaoPodeSerZeroException e) {
			System.out.println(e.getMessage());
		}
		


	}

}
