package view;

import controller.SerieController;

public class Main {

	public static void main(String[] args) {
		int n = 3;
		
		SerieController sCont = new SerieController();
		
		System.out.println(sCont.somar(n));
	}
}
