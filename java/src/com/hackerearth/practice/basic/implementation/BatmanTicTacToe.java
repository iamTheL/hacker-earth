package com.hackerearth.practice.basic.implementation;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class BatmanTicTacToe {

	public static void main(String[] args) {
		/*File f = new File("D:/Codes/Hackathons/HackerEarth/hacker-earth/java/src/com/hackerearth/practice/basic/implementation/sample/test/BatmanTicTacToe.txt");
		List<String> stringList = new ArrayList<String>();
		try {
			BufferedReader b = new BufferedReader(new FileReader(f));
			
			String readLine = "";

	        System.out.println("Reading file using Buffered Reader");

	        while ((readLine = b.readLine()) != null) {
	        	stringList.add(readLine);
	            System.out.println(readLine);
	        }
	        b.close();
		}catch(Exception e) {
			e.getMessage();
		}
		finally {
		}*/
		Scanner s = new Scanner(System.in);
		int noOfTests = Integer.parseInt(s.nextLine());
		int i = 0;
		while ( i < noOfTests) {
			List<String> firstRow = new ArrayList<String>(Arrays.asList(s.nextLine().split("")));
			List<String> secondRow = new ArrayList<String>(Arrays.asList(s.nextLine().split("")));
			List<String> thirdRow = new ArrayList<String>(Arrays.asList(s.nextLine().split("")));
			List<String> fourthRow = new ArrayList<String>(Arrays.asList(s.nextLine().split("")));
		}
		
	}

}
