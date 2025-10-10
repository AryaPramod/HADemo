package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
public static void main(String[] args) {
	Set<String> names=new HashSet<>();
	names.add("Alice");
	names.add("Bob");
	names.add("Charlie");
	names.add("Alice");
	System.out.println("Names :"+names);
	
	//remove 
	names.remove("bob");
	System.out.println("After removing Bob :"+names);
	
	//contains
	System.out.println("Conatins Alice? "+names.contains("Alice"));
	
	//size
	
	System.out.println("Size :"+names.size());
	
	//isempty
	
	System.out.println("is Empty? "+names.isEmpty());
	
	//clear
	names.clear();
	System.out.println("After clear: "+names);
}
}
