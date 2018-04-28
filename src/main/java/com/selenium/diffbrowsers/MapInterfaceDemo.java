package com.selenium.diffbrowsers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterfaceDemo {
	/* HashMap details 
	 * Duplicate keys not allowed,
	 * Multiple null values allowed in Hash Map 
	 * Allows one null key value
	 * Insertion order not maintained
	 * faster, works in single thread, not synchronized.
	 */
	
	public static void main(String[] args){
		
		
		Map<String, String> employeename = new HashMap();
		employeename.put("employee1", "QA"); 
		employeename.put("employee2", "Dev"); 
		employeename.put("employee3", "NOC team");
		employeename.put("employee4", "Admin");
		
		//System.out.println(employeename.get("employee3"));
		employeename.put(null, "Support"); 
		
		employeename.put("employee6", null);
		employeename.put("employee7", null);
		employeename.put("employee7", null);

		Set<String> employeedetails = employeename.keySet();
		Iterator<String> iterate = employeedetails.iterator();
		/*while (iterate.hasNext()) {
			
			type type = (type) iterate.nextElement();
			
		}*/
		
		for (String data : employeedetails) {
			System.out.println(data + " , "+employeename.get(data));
		}
		
		
		
		
	}

}
