package OOP_Interface;

public class TestHospital {
	
	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.neuroServices();
		fh.physioServices();
		fh.entServices();
		fh.dentalServices();
		fh.oncologyServices();
		
		fh.emergencyServices();
		
		fh.medicalInsurance();
		fh.medicalTraining();
		
		fh.medicalResearch();
		fh.medicalNews();
		
		//WHO
		fh.covidVaccination();
		
		//Printing interface variables
		//Can be accessed by class name or interface name 
		System.out.println(FortisHospital.min_fee);
		System.out.println(USMedical.min_fee);
		
		//USMedical.min_fee=20;
		//The above is not possible since it is final in nature and cannot be modified
		
		//NA
		//USMedical us = new USMedical();
		
		USMedical.taxCalculation();
		//method hiding - method calling
		FortisHospital.taxCalculation();
		
		fh.getMedicalServices();
		
		//Top Casting
		//child class object can be referred by parent interface ref variable
		
		USMedical us = new FortisHospital();
		//we are able to access methods in USMedical interface
		//Since the reference type check will be failed
		us.cardioServices();
		us.physioServices();
		us.neuroServices();
		us.emergencyServices();
		
		UKMedical uk = new FortisHospital();
		uk.dentalServices();
		uk.entServices();
		uk.emergencyServices();
		
		indianMedical in = new FortisHospital();
		in.oncologyServices();
		in.gynicServices();
		in.emergencyServices();
		
		//down casting? at the compile time?
		//FortisHospital fh1 = new USMedical();
		
		//USE Constants
		System.out.println(Constants.OK_MSG_200);
		System.out.println(Constants.DEFAULT_TIME_OUT);
		System.out.println(Constants.DEFAULT_PAGE_LOAD_TIME_OUT);
	}

}
