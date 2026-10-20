package com;

import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MaxNumber obj = new MaxNumber();
		System.out.println("enter a arra size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter a array :");
		for(int i=0; i<size;i++) {
			 arr[i] = sc.nextInt();
		}
		int maxNumber = obj.checkMax(arr);
		System.out.println(maxNumber);
	}
	int checkMax(int arr[]) {
		int maxNum = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>maxNum) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}
	

}
