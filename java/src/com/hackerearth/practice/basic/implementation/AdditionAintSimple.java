package com.hackerearth.practice.basic.implementation;

import java.util.Scanner;

public class AdditionAintSimple {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int noOfTests = Integer.parseInt(s.nextLine());
	int i  = 0;
	while ( i < noOfTests ) {
		char[] inputString = s.nextLine().toCharArray();
		char[] outputString = new char[inputString.length];
		for (int j = 0; j < inputString.length; j ++) {
			int temp = (int) inputString[j] - 97 + (int) inputString[inputString.length -1 - j] - 97;
			while(temp > 25) {
				temp = (temp% 25);
			}
			outputString[j] = (char) (temp+98);
		}
		for(int k = 0; k < outputString.length; k ++)
		System.out.print(outputString[k]);
	}
	s.close();
	}
}
