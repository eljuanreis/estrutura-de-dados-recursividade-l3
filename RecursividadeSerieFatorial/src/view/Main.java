package view;

import controller.SerieFatorialController;

public class Main {

	public static void main(String[] args) {
		int n = 5;
		
		SerieFatorialController sFat = new SerieFatorialController();
		
		System.out.println(sFat.somar(n));
	}
	
}
