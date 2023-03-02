package view;

import controller.BinarioController;

public class Main {
	public static void main(String[] args) {
		int anyInteger = 30;
		
		BinarioController bCont = new BinarioController();
		
		String binary = bCont.intToBinary(anyInteger, "");
		
		System.out.println(binary);
	}
}
