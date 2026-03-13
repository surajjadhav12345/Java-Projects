package com.suraj.javapractice.map;

import java.util.HashMap;

public class Declaration {
	public static void main(String[] args) {
		HashMap<String,Integer>names=new HashMap<>();
		names.put("Suraj", 533);
		names.put(null, 5343);
		names.put(null, 533);
		
		System.out.println(names);
		
	}

}
