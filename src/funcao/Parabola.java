package funcao;

public class Parabola {

	private String relacaoComEixoX;
	private String concavidade;

	public String defineRelacaoComEixoX(FuncaoSegundoGrau funcao){
		double delta = funcao.getDelta();
		
		if(delta > 0) {
			this.relacaoComEixoX = "A par�bola intercepta o eixo x em dois pontos.";
		} else if(delta == 0) {
			this.relacaoComEixoX = "A par�bola tangencia o eixo x.";
		} else {
			this.relacaoComEixoX = "A par�bola n�o intercepta nem tangencia o eixo x.";
		}
		
		return this.relacaoComEixoX;
	}
	
	public String defineConcavidade(FuncaoSegundoGrau funcao){
		double a = funcao.getA();
		
		if(a > 0) {
			this.concavidade = "A concavidade da par�bola est� voltada para cima, pois a > 0.";
					
		} else {
			this.concavidade = "A concavidade da par�bola est� voltada para baixo, pois a < 0.";			
		}	
		
		return this.concavidade;
	}
	
	public void mostraConcavidadeERelacaoComEixoX(){
		System.out.println("Par�bola em rela��o ao eixo x: "+this.relacaoComEixoX);
		System.out.println("Concavidade da par�bola: "+this.concavidade);
	}
}
