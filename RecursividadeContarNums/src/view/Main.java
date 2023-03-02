package view;

import controller.ContarNumsController;

public class Main {
	public static void main(String[] args) {
		int num = 33002;
		
		int numToFind = 5;
		
		ContarNumsController cNum = new ContarNumsController();
		
		System.out.println(cNum.countVezes(num, numToFind, Integer.toString(num).length()));
		
	}
}
