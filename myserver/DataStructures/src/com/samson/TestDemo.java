package com.samson;

import org.ietf.jgss.GSSManager;

import java.util.Arrays;

public class TestDemo {

   static int smallest(int[] A) {
        //sort the array
         Arrays.sort(A);
        //traverse through the sorted array
        for(int k=0; k<A.length; k++){

            //if in last element, smallest element = last array element +1
            if(k == A.length -1){
                break;
            }

            //if similar elements follow each other, skip to the last similar element
            if(A[k] == A[k+1]){
                continue;
            }


            //compare subsequent elements
            if((A[k] +1 ) == (A[k+1])){

            } else if(A[k+1] <= 0){
                continue;
            } else{

                retu A[k]+1;
            }
        }

        //if not found
        return A[A.length -1] +1;
    }


    public static void main(String[] args){

        int[] b = new int[]{ -1, -3};

        System.out.println("Smallest number not available in  the array is: " + smallest(b));
    }





        }
