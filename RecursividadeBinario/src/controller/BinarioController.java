package controller;

public class BinarioController {
	
	public String intToBinary(int anyInteger, String bin) {
		
		// Condição de parada
		if (anyInteger <= 2) {
			bin = (anyInteger % 2) + bin;
		} else {
			bin = (anyInteger % 2) + bin;
			
			// Ainda é possível dividir
			return intToBinary(anyInteger / 2, bin);
		}
		
		return bin;
		
	}
}
