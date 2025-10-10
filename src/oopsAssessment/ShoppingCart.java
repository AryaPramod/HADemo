package oopsAssessment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	public static void main(String[] args) {
		List<String> cart=new ArrayList<>();
		cart.add(1,"pen");
		cart.add(2,"Bread");
		cart.add(3,"pencil");
		cart.add(4,"book");
		cart.add(5,"scale");
		cart.add(6,"fruits");
		cart.add(7,"curd");
		cart.add(8,"milk");
		cart.add(9,"chocolate");
		cart.add(10,"workbook");
		
		System.out.println(cart);
		cart.remove(1);
		System.out.println("removed item :"+cart);
	}

}
