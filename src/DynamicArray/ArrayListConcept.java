package DynamicArray;

import java.util.ArrayList;

public class ArrayListConcept {
	
	public static void main(String[] args) {
		int i[] = new int[3];
		int a[]= {1,2,3,4,5};
		//With the above scenario the array size is fixed
		
		ArrayList ar = new ArrayList();
		//The above arraylist is raw type and it should have generics like any specific data to be added
		System.out.println(ar.size());//0
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		System.out.println(ar.size());//3
		ar.add(400);//3
		ar.add(500);//4
		System.out.println(ar.size());//5
		ar.add("testing");//5
		ar.add(23.44);//6
		ar.add(true);//7
		ar.add('g');//8
		ar.add(1000);//9
		System.out.println(ar.size());//10
		ar.add(1200);
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(9));
		System.out.println(ar.get(6));
		//System.out.println(ar.get(11));
		//IndexOutOfBoundsException
		
		System.out.println(ar.get(8));
		ar.remove(8);
		System.out.println(ar.get(8));
		System.out.println(ar);
		System.out.println("==================");
		ArrayList empData = new ArrayList();
		empData.add("tom");//0
		empData.add("Bangalore");//1
		empData.add(1000);//2
		empData.add(true);//3
		
		System.out.println(empData.size());
		System.out.println(empData.get(1));
		System.out.println(empData);
		//To print all the values which is stored in arraylist
		
		//Using for loop to print all the values stored in arraylist
		for(int j=0;j<empData.size();j++) {
			System.out.println(empData.get(j));
		}
	}
}
