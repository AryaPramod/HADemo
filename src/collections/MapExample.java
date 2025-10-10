package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> employees=new HashMap<>();
		
		//put()
		employees.put(101, "John");
		employees.put(102, "Alice");
		employees.put(103, "Bob");
		
		System.out.println("employees :"+employees);
		
		//get(key)
		
		System.out.println("Employee 101 :"+employees.get(101));
		
		//remove(key)
		employees.remove(103);
		
		System.out.println("After removing"+employees);
		
		//containskey
		System.out.println("has key 101 ?"+employees.containsKey(101));
		
		//containvalues
		System.out.println("has value Alice"+employees.containsValue("Alice"));
		
		//size()
		
		System.out.println("Size :"+employees.size());
		
		//isempty
		
		System.out.println("is empty"+employees.isEmpty());
		
		//keyset
		
		System.out.println("keys:"+employees.keySet());
		
		//values
		System.out.println("Values :"+employees.values());
		
		//entryset
		System.out.println("iterating entries:");
		for (Map.Entry<Integer, String> entry : employees.entrySet()) {
			System.out.println("ID :"+entry.getKey()+", Name: "+entry.getValue());
			
		}
		
	}

}
