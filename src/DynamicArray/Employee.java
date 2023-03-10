package DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {
	public static void main(String[] args) {
		
		//Child class object referred by parent class ref variable
		List<String> namesList = new ArrayList<String>();
		namesList.add("Tom");
		namesList.add("Gowtham");
		namesList.add("Adam");
		namesList.add("Harsha");
		namesList.add("Harshitha");
		
		System.out.println(namesList);
		//[Tom, Gowtham, Adam, Harsha, Harshitha]
		
		System.out.println(namesList.size());//5
		
		for(String e:namesList) {
			System.out.println(e);
			if(e.equals("Gowtham")) {
				System.out.println("He is a Test Engineer");
				break;
			}}
		System.out.println("=================================");
		//To avoid data creation using add method since it is tedious process
		List<String> browserList = Arrays.asList("Chrome","Safari","IE","Edge");
		System.out.println(browserList.size());
		System.out.println(browserList);
		
		List<Integer> numbersList = Arrays.asList(100,200,300,400);
		
		//Convert static array to Dynamic array
		
		String Country[] = {"India","USA","Germany","Brazil"};//static array
		List<String> countryList = Arrays.asList(Country);//dynamic array
		System.out.println(countryList);
		
		countryList.add("France");
		System.out.println(countryList);//UnsupportedOperationException
		//asList is immutable in java and we cannot add any value once it is declaredc
		//But we should not think this behaves like static array
		//static array is represented by [] array 
		//asList is still dynamic array
		
		
		
		
	}
}
