package com.hackerrank.collections;

import java.util.*;

public class JavaMap {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		Map<String,Integer> pb = new HashMap<String,Integer>();
		for(int i = 0; i < n; i ++) {
			String name = sc.nextLine();
			int phone = sc.nextInt();
			pb.put(name, phone);
			sc.nextLine();
		}
		while(sc.hasNext()) {
			String s = sc.nextLine();
			if(pb.containsKey(s)) {
				System.out.println(s + "=" + pb.get(s));
			}
			else {
				System.out.println("Not found");
			}
		}
	}
	
}
