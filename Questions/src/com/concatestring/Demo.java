package com.concatestring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	
	public static void main(String[] args) {
		String s1 = "Ujjawal";
		String s2 = "Prakash";
		
//		first method;
		String s3 = s1+ " " + s2;
		System.out.println(s3);
		
//		Second method;
//		String  s3 = s1.concat(" "+ s2);
//			System.out.println(s3);
		
//		third method 
		StringBuilder sb = new StringBuilder();
		sb.append(s1+" ");
		sb.append(s2);
		System.out.println(sb);
		
//		fourth method
//		String s3 = String.join(" ",s1,s2);
//		System.out.println(s3);
	
//		 two other approach but it is not concate method;
		
		List<String> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		System.out.println(list);
//		it can seperate by comma and it show inside a array
		
		
		List<String> list1 = Stream.of(s1,s2).collect(Collectors.toList());
		System.out.println(list1);
//		it can seperate by comma and it show inside a array
		
	}
}
