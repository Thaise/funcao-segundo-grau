package funcao;
public class FuncaoSegundoGrau {

	private double a;
	private double b;
	private double delta;
	private double xPositivo;
	private double xNegativo;

	
	public void calculaDelta(double a, double b, double c) throws ANaoPodeSerZeroException {
		if(a != 0){
			this.a = a;
			this.b = b;
			this.delta = Math.pow(b, 2) - (4 * a * c);
		}else{
			throw new ANaoPodeSerZeroException("O número 'a' não pode ser zero!");
		}
	}

	public void calculaRaizes() {
		if (this.delta == 0) {
			this.xPositivo = (-(b) / (2 * a));
			this.xNegativo = (-(b) / (2 * a));

		} else if (this.delta > 0) {
			this.xPositivo = ((-b + Math.sqrt(delta)) / 2 * a);
			this.xNegativo = ((-b - Math.sqrt(delta)) / 2 * a);

		} else {
			System.out
					.println("O delta é negativo, a função não admite raízes reais!");
		}
	}
	
	public void mostraResultadoDeDeltaERaizesDaFuncao(){
		System.out.println("Delta = "+this.delta);
		if(delta >= 0){
			System.out.println("x1 = "+this.xPositivo);
			System.out.println("x2 = "+this.xNegativo);
		}
	}

	public double getDelta() {
		return this.delta;
	}
	
	public double getXPositivo() {
		return this.xPositivo;
	}
	
	public double getXNegativo() {
		return this.xNegativo;
	}
	
	public double getA() {
		return this.a;
	}

	public double getB() {
		return this.b;
	}
	


}
