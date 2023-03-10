package javaSessions;

import java.util.Arrays;

public class Task_Array {
	
	public String[] getDevices(String Brand) {
		String[] devices=null;
		
		System.out.println("Getting device list for Brand : "+Brand);

		if(Brand.equals("Apple")){
			devices = new String[] {"I phone 13","I Phone 12"};
			//return devices;
		}
		else if(Brand.equals("Samsung")) {
			devices = new String[] {"A 52","A 8"};
			//return devices;
		}
		else if(Brand.equals("Redmi")) {
			devices = new String[] {"A 80","A 21"};
			//return devices;
		}
		else {
			System.out.println("Invalid brand input");
		}
		return devices;
	}
	public static void main(String[] args) {
		Task_Array t = new Task_Array();
		String[] m = t.getDevices("App");
		System.out.println(Arrays.toString(m));
	}
}
