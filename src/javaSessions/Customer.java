package javaSessions;

import java.util.Arrays;

public class Customer {

	public String[] getEmployeeDevices(String empName) {
		System.out.println("Getting devices information for employee : " + empName);
		String devices[] = null;

		if (empName.equals("gowtham")) {
			devices = new String[] { "Macbook", "I-Mac", "I Phone" };
			// new String is memory allocation for the array
		} else if (empName.equals("Tom")) {
			devices = new String[] { "samsung s10", "A8", "A 52" };

		} else if (empName.equals("Adam")) {
			devices = new String[] { "redmi s10", "note 4", "Note 5" };

		} else {
			System.out.println("Employee name not found");

		}
		return devices;
	}

	public static void main(String[] args) {
		Customer obj = new Customer();
		String g[] = obj.getEmployeeDevices("Adam");
		System.out.println(Arrays.toString(g));
//		System.out.println(g.length);

	}

}
