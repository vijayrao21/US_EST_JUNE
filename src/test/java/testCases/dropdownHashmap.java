package testCases;

import java.awt.Robot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dropdownHashmap {
	
	static ArrayList<String> expModuleDropdownValues=new ArrayList<String>();
	ArrayList<String> actModuleDropdownValues=new ArrayList<String>();

	public static void main(String[] args) {
		List<String> expModuleDropdown= Arrays.asList("--None--", "Compliance Risk Assessments (CRA)", "Control Testing (CMP)", 
				"Enterprise Loss Management (LSM)", "GRC Library / BO Reporting", "Issue Management (ISM)", 
				"Policy & Document Management (PDMS)", "Regulatory Change Management (RCM)", "Regulatory Exam Management (RGX)", 
				"Risk Assessments (RA)", "Survey (ICFR Attestation, Inside Trading, Volcker Attestation)", "TPRM", "TurboRisk (TR)");
		
		List<String> expTurboRiskRoleDropdown= Arrays.asList("BCM Approver","COSA Risk Approver", "Enterprise Risk Approver", 
				"General User", "View Only");			
		
		expModuleDropdownValues.addAll(expModuleDropdown);
		// create map to store
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		// create list one and store values
		List<String> valSetOne = new ArrayList<String>();
		valSetOne.add("Apple");
		valSetOne.add("Aeroplane");
		// create list two and store values
		List<String> valSetTwo = new ArrayList<String>();
		valSetTwo.add("Bat");
		valSetTwo.add("Banana");
		// create list three and store values
		List<String> valSetThree = new ArrayList<String>();
		valSetThree.add("Cat");
		valSetThree.add("Car");
		// put values into map
		map.put("A", valSetOne);
		map.put("B", valSetTwo);
		map.put("C", valSetThree);
		// iterate and display values
		System.out.println("Fetching Keys and corresponding [Multiple] Values n");
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			String key = entry.getKey();
			List<String> values = entry.getValue();
			System.out.println("Key = " + key);
			System.out.println("Values = " + values + "n");
		}
	}
}