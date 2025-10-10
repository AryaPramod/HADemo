package assignmentonexcepfile;

import java.util.Scanner;

public class Validation extends Exception{
	public static void main(String[] args) throws Exception {
		
		
		
		try {
			String password = "assdd" ;
			if(password.length() > 6) {
				throw new Exception("input cannot be greater than 6");
				
				
			}
		}
		catch(Exception e) {
			System.out.println("the exception handled");
		}
		
	}
	

}
