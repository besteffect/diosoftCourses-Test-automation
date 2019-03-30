package com.diosoft.algorithms;

public class Algorithm {
	
	public static void firstExample(){
		int [] array = {21, 72, 100, -900, 24, 87};
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element from first example " + array[i]);
		}
	}
	
	public static void secondExample(){
		int count = 4;
		int [] array = new int[count];
		array[0] = 1;
		array[1] = 2;
		array[2] = 10;
		array[3] = -9;
		for (int i = 0; i < count; i++) {
			System.out.println("Element from second example " + array[i]);
		}
	}
	
	public static void thirdExample(){
		int [] array2 = {31, 92, 0, 1, 0};
		for (int element : array2) {
			System.out.println("Element from third example " + element);
		}
	}
	
	public static void main(String[] args) {
		firstExample();
		secondExample();
		thirdExample();
	}
}
