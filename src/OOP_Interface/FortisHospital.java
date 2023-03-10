package OOP_Interface;

public class FortisHospital extends Hospital implements USMedical,UKMedical,indianMedical{
	//we are having same value created in USMedical , So to call latest value we need to call by its object ref name
	//int min_fee=50;
	
	//US
	@Override
	public void cardioServices() {
		System.out.println("FH----cardioServices");
	}
	@Override
	public void neuroServices() {
		System.out.println("FH----neuroServices");
	}
	@Override
	public void physioServices() {
		System.out.println("FH----physioServices");
	}
	//UK
	@Override
	public void entServices() {
		System.out.println("FH----entServices");
	}
	@Override
	public void dentalServices() {
		System.out.println("FH----dentalServices");
	}
	//India
	@Override
	public void oncologyServices() {
		System.out.println("FH----oncologyServices");
	}
	@Override
	public void gynicServices() {
		System.out.println("FH----gynicServices");
	}
	@Override
	public void orthoServices() {
		System.out.println("FH----orthoServices");
	}
	//Individual Methods in class and cannot be overriden
	public void medicalTraining() {
		System.out.println("FH----Medical Training");
	}
	public void medicalInsurance() {
		System.out.println("FH----Medical Insurance");
	}
	//Same methods in all hospital interfaces possible ? :
	//common
	@Override
	public void emergencyServices() {
		System.out.println("FH----emergencyServices");
	}
	//Same method but overloading takes place here
	/*
	 * @Override public void emergencyServices(int i) {
	 * 
	 * }
	 */
	@Override
	public void covidVaccination() {
		System.out.println("FH----Covid Vaccination");
	}
	@Override
	public void pandemicPolicy() {
		
	}
	@Override
	public void childCareServices() {
		System.out.println("FH----Child care services");
	}
	//method hiding
	public static void taxCalculation() {
		System.out.println("FH----Tax calculation");
	}
	//override default interface method
	//we are changing default to public due to Cannot reduce the visibility of the inherited method from USMedical
	@Override // It is like violation since we are changing the signature
	public void getMedicalServices() {
		System.out.println("FH--Medical Services");
		
	}
	
	
	
}
