package javaSessions;

public class LoopsConcept {
	
	public static void main(String[] args) {
		
		 int i=1;
		 
		 while(i<=10) {
			 System.out.println(i);
			 i=1+i;
		 }
		 
		 while(true) {
		System.out.println("Hi Gowtham");
		break;
	}
		 int p=1;
		 while(p<=10) {
			 System.out.println(p);
			 
			 p=p+2;
		}
		 System.out.println("----------------------------");
		 
		 int num=1;
		 
		 while(num<=100) {
			 System.out.println(num);
			 if(num % 5 == 0) {
				 System.out.println(num +": Multiple of 5");
				 break;
			}
			 num++;
		}
		 
		 System.out.println("=====================");
		 
		 int score=0;
		 while(score<=100) {
			 
			switch (score) {
			
			case 25:
			System.out.println("25 score...YEs");
			break;
			
			case 50:
			System.out.println("HALF CENTURY");
			break;
			
			case 75:
			System.out.println("NEAR TO CENTURY");
			break;	
			
			case 100:
			System.out.println("CENTURY");
			break;	
			
			default:
			System.out.println(score);
			break;
			}
			score++;
			}
		 System.out.println("=======================");
		 
		 int count=1;
		 
		 while(count<=50) {
		 for(;;) {
			 
		System.out.println("bye");
		break;
		 }
		 count++;
		 }
		 
		 System.out.println("=================");
		 
		 for(int k=5;k<=50;k++) {
			 System.out.println(k);
			 if(k%5==0) {
				 System.out.println("Hii");
				 break;
			 }
		 }
		 System.out.println("==================");
		 
		 //a to z:
		 for(char a='a';a<='z';a++) {
			 System.out.println((int)a+" : "+a);
		 }
		 
		//A to Z:
		 for(char a='A';a<='Z';a++) {
			 System.out.println((int)a+" : "+a);
		 }
		 
		//0 to 9:
		 for(char a='0';a<='9';a++) {
			 System.out.println((int)a+" : "+a);
		 }
		
		 for(byte b1=1;b1<=5;b1++) {
			 System.out.println(b1);
		 }
		 System.out.println("--------------");
		 
		 for(double d=1.1;d<=10.0;d++) {
			 System.out.println(d);
		 }
		 System.out.println("--------------");
		 for(String name="gowtham";name.equals("gowtham");) {
			 System.out.println("Hi "+name);
			break;
		}
		 
		 
		 
		
	
	
	}}
