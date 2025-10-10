package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		System.out.println("fruits  : "+fruits);
		
		//add(index,element)
		fruits.add(1, "orange");
		System.out.println(fruits);
		
		
		System.out.println("size:"+fruits.size());
		
		
		System.out.println("is this empty "+fruits.isEmpty());
		fruits.remove(1);
		System.out.println(fruits);
		
		System.out.println("index of grapes : "+fruits.indexOf(0));
		
		
		System.out.println(fruits);
		
		
		
		
		
	}

}
