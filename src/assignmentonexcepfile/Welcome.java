package assignmentonexcepfile;

import java.io.FileWriter;
import java.io.IOException;

public class Welcome {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("Welcome.txt");
			fw.write("Welcome on your onborading!");
			fw.write("Hello! Java file Handling!");
			fw.close();
			System.out.println("data is written to file successfully");
			
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}
