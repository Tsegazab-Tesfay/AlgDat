package com.company;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

// Her var main klassen

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
