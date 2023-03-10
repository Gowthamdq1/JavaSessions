package ExceptionHandling;

public class Student {
	
	public static int getMarks(String name) {
		System.out.println("getting marks for :"+name);
		
		if(name.equals("Gowtham")) {
			try {
			int i=9/0;
			}
			catch(ArithmeticException e) {
				System.out.println("AE is coming");
				return 85;
			}
			finally {
				System.out.println("Print mark sheet");
				return 70;
			}
			//return 90;
		}
		else if(name.equals("Tom")) {
			return 80;
		}
		else if(name.equals("Makee")) {
			return 70;
		}
		else {
			System.out.println("Student not found");
			return -1;
		}
	}
	public static void main(String[] args) {
		int m1 = getMarks("Gowtham");
		System.out.println(m1);
		System.out.println("BYE");
		
		
		
		
	}

}
