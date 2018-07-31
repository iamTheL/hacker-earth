package com.hackerearth.practice.basic.implementation;

import java.util.Scanner;

public class PsychicPowers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String inputBinary = sc.nextLine();
		System.out.println(pyshicFn(inputBinary));
	}

	private static String pyshicFn(String inputBinary) {
		int seriesCount = 0;
		char previousValue = '0';
		for ( int i = 0; i < inputBinary.length(); i++) {
			if( inputBinary.charAt(i) == previousValue) {
				seriesCount ++;
				if(seriesCount == 6) {
					return "Sorry, sorry!";
				}
			}
			else {
				seriesCount = 1;
				previousValue = inputBinary.charAt(i);
			}
		}
		return "Good luck!";
	}

}
