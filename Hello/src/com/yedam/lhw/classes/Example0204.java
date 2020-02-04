package com.yedam.lhw.classes;

public class Example0204 {
	  public static void main(String[] args) {
	      int[][] ary = new int[5][5];

	      for (int i = 0; i < ary.length; i++) {
	         for (int j = 0; j < ary[i].length; j++) {
	            if (i+j >= 4) {
	               System.out.print("*");
	            } else if (i+j < 4) {
	               System.out.print(" ");
	            }
	         
	         }System.out.println();

	      }//for1
	   }//main
	}//class
