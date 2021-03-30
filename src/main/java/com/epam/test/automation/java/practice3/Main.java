package com.epam.test.automation.java.practice3;

public class Main {

   
    public static int[] task1(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0, z = array.length - 1; i <= z; i++, z--) {
            if (array[i]%2==0 && array[z]%2==0){
                result[z] = array[i];
                result[i] = array[z];
            }else{
            result[i] = array[i];
            result[z] = array[z];
            }
        }
        return result;
    }

    
    public static int task2(int[] array) {
		int maxNum = 0;
		int maxIndex1 = 0;
        int maxIndex2 = maxIndex1;
		for (int i = 0; i < array.length-1; i++) {
			if (array[i]>array[i+1]){
             maxNum = array[i];
            } else {
             maxNum = array[i+1];
            }
        }
		for(int i=0; i < array.length; i++){
	        if(array[i] == maxNum){
	         maxIndex1=i;
	         break;
	        }
	    }
	    for(int i=array.length-1; i>=0; i--){
	        if(array[i] == maxNum){
	         maxIndex2=i;
	         break;
	        }
	    }
	    return maxIndex2 - maxIndex1;
	}


    public static int[][] task3(int[][] matrix) {
        //TODO: Delete line below and write your own solution;
        throw new UnsupportedOperationException();
    }

}
