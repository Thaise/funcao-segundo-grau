package funcao;

public class Vertice {

	private double xv;
	private double yv;
	
	public void calculaCoordenadasVertice(FuncaoSegundoGrau funcao){	
		this.xv = -(funcao.getB() / (2 * funcao.getA()));
		this.yv = -(funcao.getDelta() / (4 * funcao.getA()));
		
		System.out.println("V = {"+xv+";"+yv+"}");
		maximoEMinimo(funcao);
	}

	public void maximoEMinimo(FuncaoSegundoGrau funcao){
		if(funcao.getA() > 0){
			System.out.println("A função tem um mínimo definido por "+ yv);
		}else{
			System.out.println("A função tem um máximo definido por "+ yv);
		}
	}
	
	public double getXv(){
		return this.xv;
	}
	
	public double getYv(){
		return this.yv;
	}
}
