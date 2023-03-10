package DynamicArray;

import java.util.ArrayList;

public class ArrayListGenerics {
	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(100);
		numList.add(200);
		numList.add(300);
		
		System.out.println(numList.size());
		
		//for each loop
		for(Integer e:numList) {
			System.out.println(e);
		}
		
		ArrayList<String> empNamesList = new ArrayList<String>();
		empNamesList.add("Gowtham");
		empNamesList.add("Tom");
		empNamesList.add("Peter");
		
		for(String e:empNamesList) {
			System.out.println(e);
		}
		System.out.println(empNamesList);
		
		//GENERICS
		ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("Tom");
		empDataList.add(20);
		empDataList.add(true);
		empDataList.add(12.33);
		empDataList.add('m');
		
		System.out.println(empDataList);
		
		//foreach
		
		for(Object e:empDataList) {
			System.out.println(e);
			if(e.equals(20)) {
				System.out.println("Fresher");
			}
		}
	}
}
