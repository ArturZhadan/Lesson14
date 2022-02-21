package com.home;

public class Main {

    public static void main(String[] args) {
        int [] array = {24, 13, -1, 2, 4, 70, 44};
        arrayPrint(array);
        minimumElementInArray(array);
        maximumElementInArray(array);
        int [] arrayTwo = {-54, 65, 27, -10, 5, 19, 50};
        arrayPrint(arrayTwo);
        minimumElementInArray(arrayTwo);
        maximumElementInArray(arrayTwo);
    }

    public static void maximumElementInArray(int [] array){
        int maximumValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if (maximumValue < array[i]){
                maximumValue = array[i];
            }
        }
        System.out.println("max = " + maximumValue);
    }

    public static void minimumElementInArray(int [] array){
        int minimumValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if(minimumValue > array[i]){
                minimumValue = array[i];
            }
        }
        System.out.print("min = " + minimumValue + ", ");
    }

    public static void arrayPrint(int [] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            if(i > 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
