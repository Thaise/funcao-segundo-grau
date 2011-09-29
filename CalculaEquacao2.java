public class CalculaEquacao {

	public static double[] equacaoSegundoGrau(double i, double j, double k) {
		int delta = (int) ((Math.pow(j, 2))- (4 * i * k));
		
		if(delta == 0){
			
			double x = (double)(-(j) / (2 * i));
			
			double DoisValoresDeX[] = new double [2];
			
			DoisValoresDeX[0] = x;
			DoisValoresDeX[1] = x;
			
			return DoisValoresDeX;
		}else{
			
			int x1 = (int) ((-j + Math.sqrt(delta)) / 2 * i);
			int x2 = (int) ((-j - Math.sqrt(delta)) / 2 * i);
			
			double DoisValoresDeX[] = new double [2];
			
			DoisValoresDeX[0] = x1;
			DoisValoresDeX[1] = x2;
			
			return DoisValoresDeX; 	
		}
	}

	public static Object equacaoDeltaNegativo(int i, int j, int k) {
		int delta = (int) ((Math.pow(j, 2))- (4 * i * k));
		return null;
	}
}
