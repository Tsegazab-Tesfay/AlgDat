package com.company;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

// Her var main klassen

///////////// Oppgave 1
    
    
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
    
    
  //////////

 ////////// Opggave2
    
    
     public static int antallUlikeSortert(int[] a){

       int antallUlike= 0;
       int counter=1;
         

       for (int i = 0; i < a.length - 1; i++) {
           
           if (a[i] > a[i + 1]) {
               throw new IllegalStateException("Tabellen a er ikke sortert !");
           } else if (a[i] != a[i + 1]) {
               counter++;
           }
       }

       if (a.length >= 1){
           antallUlike=counter;
       }

       return antallUlike;
   }

  /////////////

    ////////// Opggave -->3 //////////////////////////////////////////


    public static int antallUlikeUsortert(int[] a) {
        int antallUlikeUsortert = 0;

        x:
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j])
                    continue x ;
            }
            antallUlikeUsortert++;
        }
        return antallUlikeUsortert;
    }


    //////////////// Oppgave -> 4 ///////////
    public static void delsortering(int[] a) {
        int temp = 0;

        if (a.length == 0) {

        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length; j++) {
                if (Math.abs(a[j - 1]) % 2 == 0 && Math.abs(a[j]) % 2 == 1) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
    /////////// Opgave 5
        public static void rotasjon(char[] a){

        char temp = 0;
        int last = a.length-1;
        if (a.length == 0 || a.length == 1){

        }else

            for (int i = 0; i< a.length;i++){

                temp = a[i];
                a[i] = a[last];
                a[last] = temp;
            }
            System.out.println(Arrays.toString(a));
    }
    
    ////////////////////////////////////Oppgave-6
    
        public static void rotasjon(char[] a){

        char temp = 0;

        int last = a.length-1;
        //System.out.print(Arrays.toString(a));
        //System.out.println();
        if (a.length == 0 || a.length == 1){
        }else
            for (int i = 0; i< a.length;i++){

                temp = a[i];
                a[i] = a[last];
                a[last] = temp;
                //System.out.print(a[i] + " ");
            }
        System.out.println(Arrays.toString(a));
    }


    public static void rotasjon(char[] a, int k) {
        char temp = 0;
        int last = a.length - 1;

        if (a.length == 0 || a.length == 1) {

        } else if (k < 0 && k !=0) {
            for (int i = 0; i < k; i--) {
                rotasjon(a);
            }
            //System.out.println("2 " + Arrays.toString(a));
        } else if (k >= 0 && k!= 0) {
            for (int i = 1; i < k; i++) {
                rotasjon(a);
            }
            //System.out.println("4 " + Arrays.toString(a));
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}



