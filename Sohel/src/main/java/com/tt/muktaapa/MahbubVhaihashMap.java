package com.tt.muktaapa;

import java.util.HashMap;

public class MahbubVhaihashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		hmap.put(1, "ab");
		hmap.put(2, "cd");
		hmap.put(3, "ef");
		
		System.out.println(hmap.get(2));
		
		
		System.out.println(hmap.remove(1));

	}

}
