package com;

import java.util.Scanner;

public class countDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int size = sc.nextInt();
		System.out.println("enter array:");
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		countDigit obj = new countDigit();
		obj.checkDigitsForEachNum(arr);
	}
	void checkDigitsForEachNum(int[] arr) {
		
		for (int i=0;i<arr.length;i++) {
			int temp = arr[i];
			int count = 0;
			while(temp != 0) {
				temp = temp/10;
				count ++;
			}
			System.out.println(arr[i] + ":"+ count );
		}
	}

}
