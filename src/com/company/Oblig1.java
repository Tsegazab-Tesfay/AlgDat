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
    
  /////////7/ for bredet oppgave 6
       
         public static void rotasjon(char[] a) {

        if (a.length > 1) {
            char temp = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
        }
    }



    public static void rotasjonleft(char[] a) {

        if (a.length > 1) {
            char temp = a[0];
            for (int i = 0; i < a.length-1; i++) {
                a[i] = a[i +1];
            }
            a[a.length-1] = temp;
        }
    }

    public static void rotasjon(char[] a, int k) {

        int x = Math.abs(k);
        
        for (int j = 0; j < x; j++){
            if (k<0){
                rotasjonleft(a);
            }else {
                rotasjon(a);
            }
        }
    }
    
 /// ////////////////////// Oppgave 7.A //////////////////////////////
    
    
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
        //System.out.println(Arrays.toString(a));
    }
    
 /// ////////////////////// Oppgave 7.B //////////////////////////////
    
     public static String flett(String... s){

        String a ="";
        int maxLength = 0;

        for (int h=0; h < s.length ;h++)    //length of longest string
            if ( s[h].length() > maxLength) {
                maxLength = s[h].length();
            }



        for (int j = 0; j < maxLength; j++) {   // loops char in string
         for (int i=0; i < s.length ;i++) {  //loops strings in parameter
           if (s[i].length() <= j) {
               continue;                      //breaks off when string is traversed
           }
              // System.out.print(s[i].charAt(j));
               a += s[i].charAt(j);
           }
        }
       return a;
    }

   
    
    //     ////////Oppgave 8//////////////////////////////////


    public static int[] indekssortering(int[]  a){
        int temp = 0;
        int[] b = Arrays.copyOfRange(a,0,a.length);
        int[] sortertindex = new int[a.length];
        //System.arraycopy(a,0, b,a.length,a.length);


        for (int i =0; i<b.length-1; i++){
            for (int j = 1; j < b.length ; j++){
                if (b[j-1] > b[j]) {
                    temp = b[j-1];
                    b[j-1] = b[j];
                    b[j] = temp;
                }
            }
        }
         for (int i = 0; i< a.length; i++){
             for (int j = 0; j< a.length ; j++){
                 if (b[i] == a[j]){
                     sortertindex[i] = j;
                 }
             }
         }
         return sortertindex;
    }
    
    
    
////////////////////////

/////////////////////////  Oppgave 9

    public static int[] tredjeMin(int[] a) // ny versjon
     {
         if (a.length < 3) {
             throw new java.util.NoSuchElementException("Tabellen a er tom!");
         }

        int b[] = new int[3];
        System.arraycopy(a, 0, b, 0, 3);

        int c[] = indekssortering(b);


        int m = c[0];
        int nm = c[1];
        int tm = c[2];



        int minverdi = a[m];
        int nestminsverdi = a[nm];
        int tredjeminverdi = a[tm];



        for (int i = 3; i < a.length; i++)
        {
                

            if (a[i] < minverdi)
            {
                tm = nm;
                tredjeminverdi = nestminsverdi;

                nm = m;
                nestminsverdi = minverdi;

                m = i;
                minverdi = a[i];
            }

                
            else if (a[i] < nestminsverdi)
            {
                tm = nm;
                tredjeminverdi = nestminsverdi;
                nm = i;
                nestminsverdi = a[i];
            }

            else if (a[i] < tredjeminverdi)
                tm= i;
                tredjeminverdi = a[tm];
        }

        return new int[]{m, nm, tm};


    }
    
    
    /////////////////////////  Oppgave 10

    public  static boolean inneholdt(String  a,  String  b){

       char[]c = b.toCharArray();
       int x = 0;




        boolean inneholdt= false;
x:
        for (int i =0; i< a.length();i++){
            for (int j =0; j< c.length;j++){
                if (a.charAt(i)==c[j]){
                    c[j]='-';
                    x++;
                    continue x;
                }
            }
        }

        if(x== a.length()){
            inneholdt=true;
        }


        return inneholdt;
    }
    
    
   
    
    
    

}



