package funcao;

public class Parabola {

	private String relacaoComEixoX;
	private String concavidade;

	public String defineRelacaoComEixoX(FuncaoSegundoGrau funcao){
		double delta = funcao.getDelta();
		
		if(delta > 0) {
			this.relacaoComEixoX = "A parábola intercepta o eixo x em dois pontos.";
		} else if(delta == 0) {
			this.relacaoComEixoX = "A parábola tangencia o eixo x.";
		} else {
			this.relacaoComEixoX = "A parábola não intercepta nem tangencia o eixo x.";
		}
		
		return this.relacaoComEixoX;
	}
	
	public String defineConcavidade(FuncaoSegundoGrau funcao){
		double a = funcao.getA();
		
		if(a > 0) {
			this.concavidade = "A concavidade da parábola está voltada para cima, pois a > 0.";
					
		} else {
			this.concavidade = "A concavidade da parábola está voltada para baixo, pois a < 0.";			
		}	
		
		return this.concavidade;
	}
	
	public void mostraConcavidadeERelacaoComEixoX(){
		System.out.println("Parábola em relação ao eixo x: "+this.relacaoComEixoX);
		System.out.println("Concavidade da parábola: "+this.concavidade);
	}
}
