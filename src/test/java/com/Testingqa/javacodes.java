package com.Testingqa;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class javacodes {

	public static void main(String[] args) {
		//		largestarray();
		//		removespace();
		//		removespace2();
		//		occurenceofstring();
		//		getdigit();
		//		reversearray();
//		armstrongnum();
//		pyramid();
		dulicatewords();

	}

	public static void removespace() {
		String str="hello java learning";
		System.out.println(str.replaceAll(" ",""));

	}

	public static void reversearray() {
		Integer[]num= {666,827,777,1000,101};
		List<Integer> lst=Arrays.asList(num);
		Collections.reverse(lst);
		for(Integer e: lst) {
			System.out.println(e);
		}

		System.out.println("After sort-----");
		Collections.sort(lst);
		for(Integer no: lst) {
			System.out.println(no);
		}
	}

	public static void getdigit() {
		String str="hd767hhs7";
		for(int i=0;i<str.length();i++) {
			char charAt = str.charAt(i);
			boolean digit = Character.isDigit(charAt);
			boolean letter = Character.isLetter(charAt);
			if(digit==true) {
				System.out.print(str.charAt(i));
			}

			if(letter==true) {
				System.out.print(str.charAt(i));
			}
		}

	}



	public static void occurenceofstring() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.next();
		String input= "Automation";
		String replaceAll = input.replaceAll(str, "");
		int occurence=input.length()-replaceAll.length();
		System.out.println(occurence);
	}
	public static void removespace2() {
		String str="hello java learning";
		String[] newstr=str.split(" ");
		String output="";
		for(int i=0;i<newstr.length;i++) {
			output=output+newstr[i];
		}
		System.out.println(output);
	}
	public static void largestarray() {
		Integer num[]= {777,883,100,10,6};
		List<Integer> asList = Arrays.asList(num);


		System.out.println(Collections.max(asList));
		System.out.println(Collections.min(asList));

		//		int largest=num[0];
		//		for(int i=0;i<num.length;i++) {
		//			if(num[i]>largest) {
		//				largest=num[i];
		//			}
		//		}
		//		System.out.println(largest);

	}


	public static void duplicatearray() {
		int[]arr= {100,66,2625,66,100,99};


	}

	public static void armstrongnum() {
		int num=370;
		int temp=num;
		int output=0;
		int a;
		while(num>0) {
			a=num%10;//35
			output=output+a*a*a;//27+125+1
			num=num/10;//1
		}
		if(output==temp) {
			System.out.println("given num"+temp+" is armstrong");
		}
		else
			System.out.println("given num"+temp+" is NOT a armstrong");


	}


	public static void reversestring() {
		String input="India is my country";
		//		for(int i=input)
	}

	
	public static void dulicatewords() {
		String input="India my is my is country";
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		int count=1;
		String[] str = input.split(" ");
		for(int i=0;i<str.length;i++) {
			if(!hm.containsKey(str[i])) {
				hm.put(str[i],count);
			}
			else
				hm.put(str[i],hm.get(str[i])+1);
		}
	
		for(String lst: hm.keySet()) {
//		
			if(hm.get(lst)>1) {
				hm.remove(lst, 1);
				System.out.println(lst + "--duplicate words repeated "+ hm.get(lst));
			}
			
		}
		for( String e: hm.keySet()) {
			System.out.print(e);
		}
		
//		System.out.println(lst + "repeated "+ hm.get(lst));
		
		
	}
	
	
	public static void duplicateword1() {
		 String input= "India is is my my is country";
		 
		 String[] str = input.split(" ");
		 
		 Set<String> obj= new LinkedHashSet<String>();
		 for(String sample: str) {
		 obj.add(sample);
		 }
		 
		 for (String string : obj) {
			 System.out.print(string+ " ");
			
		}
		 
		 }
		
	
	public static void pyramid() {
		int rowscnt=4;
	
		for(int i=1;i<=rowscnt;i++) { //no of rows
			for(int j=rowscnt-1;j>=1;j--) { //add space
				System.out.print(" ");
			}
				for(int k=i;k<=1;k++) { //add *
					System.out.print("*");
				}
			}
		System.out.println();

		}

	}
