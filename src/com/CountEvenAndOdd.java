package com;

import java.util.Scanner;

public class CountEvenAndOdd {
public static void main(String[] args) {
	CountEvenAndOdd obj = new CountEvenAndOdd();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a array size:");
	int size = sc.nextInt();
	System.out.println("enter a array :");
	int[] arr = new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	obj.checkEvenAndOdd(arr);
	
}
void checkEvenAndOdd(int arr[]) {
	int countEven = 0;
	for(int i=0; i<arr.length;i++) {
		if(arr[i]%2 == 0) {
		countEven++	;
		}
	}
	int EvenNumberCount = countEven;
	System.out.println(" Even number count" + EvenNumberCount);
	int oddNumberCount = arr.length - EvenNumberCount;
	System.out.println(" odd number number count" + oddNumberCount);
	return;
}
}
