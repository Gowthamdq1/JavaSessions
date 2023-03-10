package ExceptionHandling;

public class FinallyBlock {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		try {
			int i = 9/0;
		}
		catch(Exception e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("bye");
		
	}

}
