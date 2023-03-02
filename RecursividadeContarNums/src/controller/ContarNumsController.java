package controller;

public class ContarNumsController {

	static int sumCount;
	
	public int countVezes(int num, int numToFind, int tamanhoString) {
		
		// Condição de parada (fim da string)
		if (tamanhoString == 0) {
			return sumCount;
		}
		
		String numStr = String.valueOf(num);
		
		// Pega um digito
		numStr = numStr.substring(tamanhoString - 1, tamanhoString);
		
		// Compara com o numero
		if (Integer.parseInt(numStr) == numToFind) {
			sumCount++;
		}
		
		// Aqui ainda tem caracteres para serem contados
		return countVezes(num, numToFind, tamanhoString - 1);
	}
}
