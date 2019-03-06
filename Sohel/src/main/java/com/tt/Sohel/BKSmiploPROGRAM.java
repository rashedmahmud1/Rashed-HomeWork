package com.tt.Sohel;

public class BKSmiploPROGRAM {

	public static void main(String[] args) {
		double amount;
		double principle = 10000;
		double rate = .01;
		for(int day=1;day<=20;day++) {
			amount = principle*Math.pow(1 + rate, day);
			System.out.println(day + "    "+amount);
		}
		
		

	}//END OF MAIN METHOD

}//end of class
