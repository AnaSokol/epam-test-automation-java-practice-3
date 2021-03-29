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

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int[] array) {
        //TODO: Delete line below and write your own solution;
        throw new UnsupportedOperationException();
    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int[][] task3(int[][] matrix) {
        //TODO: Delete line below and write your own solution;
        throw new UnsupportedOperationException();
    }

}
