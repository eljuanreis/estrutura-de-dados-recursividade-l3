package controller;

public class FibController {
	
	public int fibByPosition(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		
		return fibByPosition(n-1) + fibByPosition(n-2);
	}
}
