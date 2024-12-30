package com.array;

import java.util.Arrays;

public class ArrayDeletion {
	
	public static void main(String [] args) {
		
		int[] originalArray = {1,2,3,4,5,6};
		int postion=2;// Position jahan se element remove karna hai
		
		int[] newArray=new int[originalArray .length-1];// Ek naya array banate hain ek kam size ke saath
		
		for(int i=0;i<postion;i++) {// Pehle ke elements ko nayi array me copy karte hain
			newArray[i]=originalArray [i];
	
		}
		
		for(int i=postion;i<newArray.length; i++) {// Baaki ke elements ko copy karte hain nayi array me
			newArray[i]=originalArray[i+1];
 }
        
        System.out.println("Array after deletion: " + Arrays.toString(newArray)); // Nayi array ko print karte hain
    }
}