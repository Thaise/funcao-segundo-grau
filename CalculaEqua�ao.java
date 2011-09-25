
public class CalculaEquaçao {

	public static int equacaoPositiva(int i, int j, int k) {
		int delta = (int) ((Math.pow(j, 2))- (4 * i * k));
		int x = (int) ((-j + Math.sqrt(delta)) / 2 * i);
		
		return x;
	}

	public static int equacaoNegativa(int i, int j, int k) {
		
		int delta = (int) ((Math.pow(j, 2))- (4 * i * k));
		int x = (int) ((-j - Math.sqrt(delta)) / 2 * i);
		
		return x;
	}
	
	public static int equacaoDeltaZero(int i, int j, int k) {
		
		int x = (-j / (2 * i));
		
		return x;
	}

	public static Object equacaoDeltaNegativo(int i, int j, int k) {
				
		return null;
	}
}
