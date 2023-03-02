package controller;

public class SerieController {

	double sum;
	
	public double somar(int n) {
		
		// Condição de parada
		if (n == 0) {
			return sum;
		} 
		
		sum = sum + 1 / (double) n;
		
		n = n - 1;
		
		// Ainda tem NUM (proxima chamada)
		return somar(n);
	}
}
