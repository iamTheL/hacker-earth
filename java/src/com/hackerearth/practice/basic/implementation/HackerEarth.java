package com.hackerearth.practice.basic.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class HackerEarth {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
//		int arraySize = Integer.parseInt(s.nextLine());
		
		String targetWord = "hackerearth";
		Map<Character,Integer> lookUpMap = new HashMap<Character, Integer>();
		Map<Character,Integer> testStringMap = new HashMap<Character, Integer>();
/*		for (int i = 0; i < targetWord.length(); i ++) {
					if(lookUpMap.putIfAbsent(targetWord.charAt(i), 1) == null)
						continue;
					lookUpMap.computeIfPresent(targetWord.charAt(i), (k,v) -> v+1);
		}*/
		
		/*{a=2, r=2, c=1, t=1, e=2, h=2, k=1}*/
		lookUpMap.put('t', 1);
		lookUpMap.put('c', 1);
		lookUpMap.put('k', 1);
		lookUpMap.put('a', 2);
		lookUpMap.put('h', 2);
		lookUpMap.put('e', 2);
		lookUpMap.put('r', 2);

		
		char[] keysList = {'t','c','k','e','r','a','h'};
		/*{a=5, r=3, c=3, t=9, e=4, h=4, k=4}*/
		String testString = s.nextLine();
		for ( int i = 0; i < testString.length(); i ++) {
			if(lookUpMap.containsKey((testString.charAt(i)))) 
				
				if (testStringMap.containsKey(testString.charAt(i)))
					testStringMap.computeIfPresent(testString.charAt(i), (k,v) -> v+1);
				else
					testStringMap.put(testString.charAt(i), 1);
			
		}
		System.out.println("done");
		
			if( testStringMap.containsKey(keysList[0]) && testStringMap.containsKey(keysList[1]) && testStringMap.containsKey(keysList[2])&& testStringMap.containsKey(keysList[3])
					&& testStringMap.containsKey(keysList[4]) && testStringMap.containsKey(keysList[5]) && testStringMap.containsKey(keysList[6])) {
				int threshold = Math.min(Math.min(testStringMap.get('t'), testStringMap.get('c')), testStringMap.get('k'));
				if(threshold < 1){
					System.out.println("0");
				}
				else
				while ( threshold >= 1) {
					int eCount = testStringMap.get('e') / threshold;
					int rCount = testStringMap.get('r') / threshold;
					int aCount = testStringMap.get('a') / threshold;
					int hCount = testStringMap.get('h') / threshold;
					
					int threshold2 = Math.min(Math.min(eCount,rCount), Math.min(aCount,hCount));
					if(threshold2 >= 2) {
						System.out.println(threshold);
						break;
					}
					/*This condition has to be checked in a better way. One test condition fails.
					 * 
					 * else if(threshold2 < 2) {
						System.out.println("0");
						break;
					}*/
						
					threshold--;
				}
			}
			else {
				System.out.println("0");
			}
		
		
		s.close();
	}

	private static Integer updateTestStringMap(Map<Character, Integer> testStringMap, Character key) {
		/*if(testStringMap.putIfAbsent(key, 1) == null)
			return null;
		testStringMap.computeIfPresent(key, (k,v) -> v+1);
		return null;*/
		if (testStringMap.containsKey(key)) {
			Integer value = testStringMap.get(key);
			testStringMap.replace(key, value);
		}
		else {
			testStringMap.put(key, 1);
		}
		return 1;
//		return null;
	}

}
