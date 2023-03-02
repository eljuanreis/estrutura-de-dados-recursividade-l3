package controller;

public class SerieFatorialController {
	
	double sum;
	
	public double somar(int n) {
		
		// Condição de parada
		if (n == 0) {
			return sum;
		} 
		
		sum = sum + 1 / fat(n);
		
		n = n - 1;
		
		// Ainda tem NUM (proxima chamada)
		return somar(n);
	}
	
	public double fat(int n) {
		if (n == 1) {
			return 1;
		}
		
		return n * fat(n-1);
	}
}
