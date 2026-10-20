package com;

import java.util.Scanner;

public class MinNumber {
	public static void main(String args[]) {
		MinNumber obj = new MinNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array length:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter a array");
		for(int i=0; i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int minNumber= obj.checkNumber(arr);
		System.out.println(minNumber);
	}
	
	int checkNumber(int[] arr) {
		int min = arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
		return min;
		
	}

}
