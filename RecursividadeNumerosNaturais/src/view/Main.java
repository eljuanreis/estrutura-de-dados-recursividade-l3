package view;

import controller.NumeroNaturalController;

public class Main {

	public static void main(String[] args) {
		int[] nums = {4,4,4,4};
		int lenght = nums.length - 1;
				
		NumeroNaturalController nCont = new NumeroNaturalController();
		
		int result = nCont.sum(nums, lenght);
		System.out.println(result);
	}

}
