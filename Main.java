package com.homework.daniel;

import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] array = new int[]{1,9,8,0,1,4,7};
        createNumberFromArray(array);

    }
    static int[] createNumberFromArray(int[] array){
        System.out.print("the new number from the array : ");
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i]);
        }
        return array;
    }
}
