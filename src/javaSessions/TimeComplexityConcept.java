package javaSessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {

		// BIG O : O(n)

		int n = 1;
		System.out.println(n);
		// O(1) Because it is getting executed only once

		String s = "hello";
		System.out.println(s);
		// O(1) Because it is getting executed only once

		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println(c);
		// O(1)Since all the line are executed only once so the result is 1 only

		for (int p = 1; p <= 10; p++) {
			System.out.println(p);
		}
		// O(n)Because it is getting executed n number of times based on condition
		// provided
		// 1(p=1) + n (p<=10) + n (print(p)) + n (p++)
		// 1 + 3n
		// 3n+1 => Linear Equation
		// 3n
		// O(3n)
		// O(n)

		for (int v = 1; v <= 10; v++) {
			for (int u = 1; u <= 5; u++) {
				System.out.println("Hello");
			}
		}
		// (1+n+n)(1+n+n+n)
		// (1+2n)(1+3n)=>1+2n+3n+6n^2 => 6n^2+5n+1 ==> Quadratic Equation
		// 6n^2+5n+1 ==>6n^2+5n==> n(6n+5) ==> n(6n)==> n^2 ==> O(n^2)
		// 1 is constant 5 is constant
		// We need to removing the constant

		for (int v = 1; v <= 10; v++) {
			for (int u = 1; u <= 5; u++) {
				for (int l = 1; l <= 10; l++) {
					System.out.println("Hello");
				}
			}
		}
		// (1+n+n)(1+n+n)(1+n+n+n)
		// (1+2n)(1+2n)(1+3n)
		// (1+2n+2n+4n^2)(1+3n)
		// (1+4n+4n^2)(1+3n)
		// (4n+4n^2)(1+3n)
		// 4n+12n+4n^2+12n^3
	}
}
