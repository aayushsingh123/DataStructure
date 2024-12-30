package com.array;


import java.util.Arrays;

public class ArrayInsertion {
	
	public static void main (String [] args) {
		
		int [] originalArray= {1,2,3,4,5,6};			
			int newElement =7;
			int position=2;
		
	int[] newArray=new int[originalArray.length+1];
    for(int i=0; i<position; i++) {
    	newArray[i] = originalArray[i];
    	
    }
    
    newArray[position]=newElement;
    
    for(int i=position; i<originalArray.length;i++) {
    	newArray[i+1]= originalArray[i];
    }
    System.out.println("Array after insertion: " + Arrays.toString(newArray));	
				
			}
			
			
			
			
			
}