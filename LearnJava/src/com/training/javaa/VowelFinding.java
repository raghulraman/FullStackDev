package com.training.javaa;

import java.util.Scanner;

public class VowelFinding {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String str1=input1.nextLine();
		VowelFinding vowel = new VowelFinding();
		vowel.vowelFind(str1);
	}

	void vowelFind(String str) {
		int j=0;
		str=str.toLowerCase();
		char[] ch=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
			switch (ch[i]) {
			case 'a':
				j++;
				break;
			case 'e':
				j++;
				break;
			case 'i':
				j++;
				break;
			case 'o':
				j++;
				break;
			case 'u':
				j++;
				break;
			}
		}
		System.out.println(j);
	}
}
