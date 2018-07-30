package com.hackerearth.practice.basic.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] firstLine = s.nextLine().split("\\s");
		int arraySize = Integer.parseInt(firstLine[0]);
		int noOfQueries = Integer.parseInt(firstLine[1]);
		List<String> arrayList = new ArrayList<String>(Arrays.asList(s.nextLine().split("\\s")));
		List<String> query = null;
		Integer sum = 0;
		int i = 0;
		while (i < noOfQueries) {
			sum = 0;
			query = new ArrayList<String>(Arrays.asList(s.nextLine().split("\\s")));
			if (query.get(0).equals("1")) {
				arrayList.set(Integer.parseInt(query.get(1)), query.get(2));
			} else if (query.get(0).equals("2")) {
				Integer startIndex = Integer.parseInt(query.get(1));
				Integer lastIndex = Integer.parseInt(query.get(2));
				if (startIndex >= 0 && startIndex <= arraySize && lastIndex <= arraySize) {
					while (startIndex <= lastIndex) {
						sum = sum + Integer.parseInt(arrayList.get(startIndex));
						startIndex++;
					}
					System.out.println(sum);
				} else
					System.out.println("-1");
			} else
				System.out.println("-1");
			i++;
		}
		s.close();
	}

}
