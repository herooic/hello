package com.yedam.lhw.classes;

import java.util.Scanner;

public class Ex0205 {
	public static void main(String[] args) {
		 int n;
		  Scanner sc = new Scanner(System.in);
		  n = sc.nextInt();
		  int []b = new int[32];
		   
		  int i = 0;
		  while(n != 1)
		  {
		   b[i++] = n%2;
		   n = n/2;
		  }
		  b[i] = n;
		   
		  for(int j = i; j >= 0; --j)
		  {
		   System.out.print(b[j]);
		  }  
		 }
		}

