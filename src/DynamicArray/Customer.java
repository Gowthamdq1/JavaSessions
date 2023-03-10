package DynamicArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {
	
	public static void main(String[] args) {
		
		List<String> namesList = new ArrayList<String>();
		namesList.add("Tom");//0
		namesList.add("Gowtham");//1
		namesList.add("Adam");//2
		namesList.add("Harsha");//3
		namesList.add("Harshitha");//4
		//This will print the array list data in the reverse order
		for(int i=namesList.size()-1;i>=0;i--) {
			System.out.println(namesList.get(i));
		}
		System.out.println("============================");
		System.out.println(namesList);//[Tom, Gowtham, Adam, Harsha, Harshitha]
		Collections.reverse(namesList);//This method will only reverse the datas 
		System.out.println(namesList);//[Harshitha, Harsha, Adam, Gowtham, Tom]
		
		System.out.println("=============================");
		System.out.println(namesList);//[Harshitha, Harsha, Adam, Gowtham, Tom]
		Collections.sort(namesList);
		System.out.println(namesList);//[Adam, Gowtham, Harsha, Harshitha, Tom]
		
		System.out.println("=============================");
		System.out.println(namesList);//[Adam, Gowtham, Harsha, Harshitha, Tom]
		Collections.swap(namesList, 2, 3);
		System.out.println(namesList);//[Adam, Gowtham, Harshitha, Harsha, Tom]
		
		System.out.println("=============================");
		System.out.println(namesList);
		namesList.add("Makee");
		namesList.add(0,"Kathy");//This will add the data in 0th index so the next value will be moved to 1st index
		System.out.println(namesList);
		
//		System.out.println("=============================");
//		System.out.println(namesList);
//		namesList.add("Makee");
//		namesList.add(10,"Kathy");//IndexOutOfBoundsException
//		//Array list is ordered based collection and if it is adding the data on some other position it will result in IndexOutOfBoundsException
//		//Since this is continuous memory allocation 
//		System.out.println(namesList);
		
		//System.out.println(namesList.get(10));//IndexOutOfBoundsException
		
		System.out.println("=============================");
		System.out.println(namesList);
		namesList.remove(1);
		System.out.println(namesList.get(1));
		System.out.println(namesList);
		
	}

}
