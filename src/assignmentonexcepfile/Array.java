package assignmentonexcepfile;



public class Array extends Exception {
	public static void main(String[] args) {
		int[] prod = {101,103,105};
		
		try {
			System.out.println("the product ID is 5"+prod[5]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("the array is of size "+prod.length);
		}
		finally {
			System.out.println("the finally block is executed");
		}
	}

}
