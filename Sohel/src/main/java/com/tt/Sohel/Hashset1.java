package com.tt.Sohel;

import java.util.HashMap;

public class Hashset1 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("1 st: ", "Vincent");
		map.put("2 st: ", "Evans");
		map.put("3 st: ", "Gomes");
		map.put("4 st: ", "Sumon");
		
		for(String x: map.keySet()) {
			System.out.println(x + map.get(x));
		
		}
		
	}
}