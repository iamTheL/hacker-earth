package com.hackerearth.practice.basic.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PlusPlus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String firstLine = sc.nextLine();
		Integer rows = Integer.parseInt(firstLine.split("\\s")[0]);
		Integer columns = Integer.parseInt(firstLine.split("\\s")[1]);
		
		int[][] matrix = new int[rows][columns];
		
		for (int i = 0; i < rows; i ++) {
			List<String> rowList = new ArrayList<String>(Arrays.asList(sc.nextLine().split("\\s")));
			for(int k = 0; k < rowList.size(); k ++) {
				matrix[i][k] = Integer.parseInt(rowList.get(k));
			}
		}
		System.out.println("Done");
	}

}
