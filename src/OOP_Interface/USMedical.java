package OOP_Interface;

public interface USMedical extends WHO ,USHG{

	//Interface variables
	int min_fee = 10;
	//They are static or final by default in interface
	
	public void cardioServices();
	
	public void neuroServices();
	
	public void physioServices();
	
	public void emergencyServices();
	
	//After DK 1.8
	//1. We can have static method with method body
	
	public static void taxCalculation() {
		System.out.println("US----Tax calculation");
	}
	//default methods: not static
	default void getMedicalServices() {
		System.out.println("US--Medical Services");
		
	}
	
	
	
	
}
