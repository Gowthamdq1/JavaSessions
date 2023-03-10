package javaSessions;

public class DataTypes {

	public static void main(String[] args) {
		
		//post increment ++
		
		int a=1;
		int b = a++;
		
		System.out.println(a);
		System.out.println(b);
		//1 2

		int c=-99;
		int d = c++;
		
		System.out.println(c);
		System.out.println(d);
		//-98
		//-99
		
		int x=10;
		int y =x++;
		System.out.println(x);//11
		System.out.println(y);//10
		
		System.out.println("----------------");
		
		int t=1;
		int u=++t;
		
		System.out.println(t);//2
		System.out.println(u);//2
		
		int a1=-99;
		int b1=++a1;
		
		System.out.println(a1);//-98
		System.out.println(b1);//-98
		
		int g=-1001;
		int h=++g;
		
		System.out.println(g);//-1000
		System.out.println(h);//-1000
		
		System.out.println("Decrement");
		
		int a2 = 2;
		int b2=a2--;
		
		System.out.println(a2);//1
		System.out.println(b2);//2
		
		int l1=-199;
		int l2=l1--;
		
		System.out.println(l1);//-200
		System.out.println(l2);//-199
		
		int r1=2;
		int r2=--r1;
		
		System.out.println(r1);//1
		System.out.println(r2);//1
		
		float f1=2.5f;
		float g3=f1++;
		
		System.out.println(f1);//3.5
		System.out.println(g3);//2.5
		
		
		char ch='a';//97
		
		System.out.println(++ch);//b
		
		
		char th='1';
		
		System.out.println((int)++th);
		
		System.out.println((int)th);
		
		
		
	
		
		
		
		
		
		

	}

}
