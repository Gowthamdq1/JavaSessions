package javaSessions;

public class Student {
	// As we dont need to write return below every condition
	public int getStudentMarks(String studentName) {
		int marks = -1;

		System.out.println("Getting student marks for : " + studentName);

		if (studentName.equals("Naveen")) {
			marks = 100;
		} else if (studentName.equals("Tom")) {
			marks = 90;
		} else if (studentName.equals("Adam")) {
			marks = 70;
		} else {
			System.out.println("Student is not found");

		}
		return marks;
	}

	public static void main(String[] args) {

		Student s = new Student();
		int m1 = s.getStudentMarks("Tom");
		System.out.println(m1);
		if (m1 == -1) {
			System.out.println("No need to print the marksheet...");
		}
	}

}
