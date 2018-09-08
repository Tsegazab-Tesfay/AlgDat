package com.company;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {





    public static void main(String[] args){

        //int [] a = new int[]{6, 5, 4, 3, 2, 1};
        int[] a = new int[]{4, 9, 3, 6, 1, 5, 7, 8, 10, 2};
        //int[] c = new int[]{4, 9, 3, 6, 1, 5, 7, 8, 10, 2};
        //int[] d = new int[]{2, 5, 8, 4, 3, 10, 1, 7, 6, 9};


        int largest_num = maks(a);
        System.out.println("Størst tallet er " + largest_num);

        //int ombytt = ombyttinger(a);
        //System.out.println("Antall ombyting er " + ombytt);

    }


    public static int maks(int[] a){
        int temp = 0;
        if (a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        }
        for (int i =0; i<a.length; i++){
            for (int j = 1; j < a.length ; j++){
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[j] = temp;
                    a[i] = a[j];
                }
            }
        }
        return a[a.length-1];
    }


    public static int ombyttinger(int[] a ){

        int bytting = 0;

        if (a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom!");
        }

        for (int i = 0; i < a.length-1; i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i] > a[j])
                    bytting++;
            }
        }
        return bytting;
    }

}
