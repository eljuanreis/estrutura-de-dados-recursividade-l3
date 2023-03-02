package controller;

public class NumeroNaturalController {
	
	public int sum(int[] nums, int tamanho) {
		
		// Ponto de parada
		if (tamanho == 0) {
			return nums[0];
		}
				
		// Condição para somar o número anterior com o novo
		int sum = 0;
		
		if (nums[tamanho] > 0) {
			sum += nums[tamanho];
		}
		
		if (nums[tamanho - 1] > 0) {
			sum += nums[tamanho - 1];
		}
		
		nums[tamanho-1] = sum;

		return sum(nums, tamanho - 1);
	}
	
}
