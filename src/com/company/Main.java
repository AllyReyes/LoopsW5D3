package com.company;
import java.io.OptionalDataException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Arrays ArrayList;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Write a program that does the following:
        //Asks the user for 5 numbers
        //Stores them in an array list
        //Finds the sum, product, largest, and smallest of those numbers


        System.out.println("Can you give me 5 numbers, please");
        Integer nums = input.nextInt();
        ArrayList<Integer> fiveNums = new ArrayList<Integer>(5);
        int[] i = new int[0];
        int[] outputs = new int[5];
        System.out.println(Arrays.toString(i));
    }
        public static int Product(int[]; int n){
            int amount = 1;
            for (int i = 0; i < n; i++) ;
            amount = amount * ArrayList[i];

            int arr[] = new int[]{8, 9, 7, 4, 0};
            int n = arr.length;
            System.out.printf("%d", Product(arr[i], n));
        } // I think Im close but I am not getting it. =(
    }

    //Trying to return the largest but its returning int(0) -shrugs-
//        int[] arr = {nums};
//        int largest = Integer.MIN_VALUE;
//        int index = 0;
//        while (index < arr.length) {
//            if (largest < arr[index]) largest = arr[index];
//            {
//            }
//            index++;
//
//
//            System.out.println("The largest number is : " + largest);
//    }

