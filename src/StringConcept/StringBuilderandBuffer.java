package StringConcept;

public class StringBuilderandBuffer {
	
	public static void main(String[] args) {
		
		//String builder is Mutable
		StringBuilder sb = new StringBuilder("selenium");
		//This will not create any object in String constant pool 
		//It will create object only in heap
		
		sb.append(" testing");
		System.out.println(sb);//selenium testing

		
		
		
		
	}

}
