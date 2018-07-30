package com.hackerearth.practice.basic.implementation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int arraySize = Integer.parseInt(s.nextLine());
		List<String>arrayList1 = new ArrayList<String>(Arrays.asList(s.nextLine().split("\\s")));
		
		BigInteger sum = BigInteger.ZERO ;
		int i = 0;
		while ( i < arraySize ) {
			sum = sum.add(new BigInteger(arrayList1.get(i)));
			i++;
		}
		System.out.println(sum);
		s.close();
	}

}
