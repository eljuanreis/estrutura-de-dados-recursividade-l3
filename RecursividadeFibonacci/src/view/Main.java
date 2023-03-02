package view;

import controller.FibController;

public class Main {

	public static void main(String[] args) {
		FibController fibController = new FibController();
		
		System.out.println(fibController.fibByPosition(5));
	}
	
}
