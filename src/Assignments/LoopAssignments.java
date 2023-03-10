package Assignments;

public class LoopAssignments {
	
	public static void assignmentOne() {
		for (int i=0;i<4;i++) {
			System.out.println("I am Batman﻿");
		}}
	public static void assignmentTwo() {
			for (int i=1;i<10;i++) {
				System.out.println("I am Batman﻿ "+i);
			}} 
	public static void assignmentThree_for() {
		for (int i=10;i>=1;i--) {
			System.out.println(i);
		}} 
	public static void assignmentThree_while() {
		int a=10;
		while(a>=1) {
			System.out.println(a);
			a--;
		}}
	public static void assignmentThree_dowhile() {
		int a=10;
		do {
			System.out.println(a);
			a--;
		} 
		while (a>=1);
	}
	public static void assignmentFour() {
		int a=1;
		while(a<=10) {
			System.out.println("Hello World : "+a);
			a++;
		}}
	public static void assignmentFive() {
		int a=1;
		while(a<=10) {
			System.out.println(a);
			a++;
		}}
	public static void assignmentSix() {
	int num1=100;
	int num2=200;
	int num3=300;
	
	
	
	}
	public static void main(String[] args) {
		System.out.println("To Print I am Batman");
		assignmentOne();
		System.out.println("To Print I am Batman 1 to 9");
		assignmentTwo();
		System.out.println("printling 10 to 1 using for loop");
		assignmentThree_for();
		System.out.println("printling 10 to 1 using while loop");
		assignmentThree_while();
		System.out.println("printling 10 to 1 using do while loop");
		assignmentThree_dowhile();
		System.out.println("printling Hello world ten times using while loop");
		assignmentFour();
		System.out.println("printling 1 to 10 using while loop");
		assignmentFive();
	}

}
