 package javaSessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		int i[] = new int[4];

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);

		}

		System.out.println(Arrays.toString(i));
		System.out.println("=============");
		for (int e : i) {
			System.out.println(e);
			if (e == 20) {
				System.out.println("Bye..");
				break;
			}
		}

		System.out.println("----------------");
		// double
		double d[] = new double[4];
		d[0] = 10.11;
		d[1] = 11.11;
		d[2] = 21.11;
		d[3] = 31.11;
		System.out.println(d[0] + d[1]);

		System.out.println(Arrays.toString(d));

		for (double dble : d) {
			System.out.println(dble);
		}
		System.out.println("----------------");
		char ch[] = new char[4];
		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
		ch[3] = 'd';
		System.out.println(Arrays.toString(ch));
		for (char c : ch) {
			System.out.println(c);
			System.out.println((int) c);
			// the above sysout will print the ascii values
		}
		// String array
		System.out.println("----------------");
		String str[] = new String[4];
		str[0] = "Java";
		str[1] = "Python";
		str[2] = "PERL";
		str[3] = "Groovy";

		System.out.println(str.length);

		System.out.println(Arrays.deepToString(str));

		for (String s : str) {
			System.out.println(s);
			if (s.equals("Java")) {
				System.out.println("I Love Java");
			}
		}
		System.out.println("=============");

		Object emp[] = new Object[5];
		emp[0] = "Gowtham";
		emp[1] = 25;
		emp[2] = 25.55;
		emp[3] = 'f';
		emp[4] = true;

		System.out.println(emp.length);
		System.out.println(Arrays.toString(emp));
		for (Object o : emp) {
			System.out.println(o);
			if (o.equals("Gowtham")) {
				System.out.println("Employee is from QA");
			}}
		System.out.println("=============");

		Object emp1[] = new Object[5];
		emp1[0] = "Tom";
		emp1[1] = 28;
		emp1[2] = 36.55;
		emp1[3] = 'f';
		emp1[4] = false;
		
		for(int m=0;m<emp1.length;m++) {
			System.out.println(emp1[m]);
			if (emp1[m].equals("Tom")) {
				System.out.println("Employee is from QA");
			}
			
		}
		System.out.println("=============");
		//Array Literals
		int num[] = {1,2,3,4,5,6,7};
		System.out.println(num.length);
		System.out.println(Arrays.toString(num));
		
		System.out.println("=============");
		
		String ss[] = {"Tom","Adam","Gill"};
		System.out.println(ss.length);
		
		System.out.println(Arrays.deepToString(ss));
		
		Object data[] = {"Gowtham",25,25.55,true};
		
		System.out.println(data.length);
		System.out.println(Arrays.toString(data));
		for(Object obj : data) {
			System.out.println(obj);
		}
		
		

	}
}
