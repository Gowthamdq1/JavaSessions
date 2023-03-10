package DynamicArray;

import java.util.HashMap;

public class HashMapConcept {
	
	public static void main(String[] args) {
		
		//<k,v> key and value pair 
		//name(key) = gowtham(value)
		//marks(key) = 100(value)
		//seller(key) = seller@gmail.com(value)
		//HashMap is a class
		//HashMap is unordered collection and it doesn't maintain the order
		
		HashMap<String, String> empMap = new HashMap<String,String>();
		empMap.put("Gowtham", "Automation Tester");
		empMap.put("Tom", "SDET");
		empMap.put("Harshita", "SDET 2");
		empMap.put("Makee", "SDET Manager");
		empMap.put("Adam", "VP");
		empMap.put("Adam", "CEO");
		empMap.put("Clark", null);
		empMap.put(null, "PM");
		empMap.put(null, null);
		
		System.out.println(empMap.get("Gowtham"));
		System.out.println(empMap.get("Adam"));//CEO
		//The latest value will always be printed incase if there is duplicate keys
		System.out.println(empMap.get("abc"));
		//null: The default value will be printed
		System.out.println(empMap.get("Clark"));
		//null will be printed
		System.out.println(empMap.get(null));
		//PM: We are providing the key anyway so it will giving result
		
		System.out.println(empMap);
		//{Adam=CEO, null=null, Tom=SDET, Clark=null, 
		//Harshita=SDET 2, Gowtham=Automation Tester, Makee=SDET Manager}
		//Since it is unordered collection it is not sorted, doesn't maintain the order
		
		HashMap<String, Integer> browserMap = new HashMap<String,Integer>();
		browserMap.put("Chrome", 100);
		browserMap.put("Firefox", 90);
		browserMap.put("IE", 80);
		browserMap.put("Edge", 70);
		
		System.out.println(browserMap);
		
		
		
		
		
		
		
	}

}
