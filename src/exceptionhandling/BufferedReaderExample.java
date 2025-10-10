package exceptionhandling;


	

	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;


	public class BufferedReaderExample {
		public static void main(String[] args) throws IOException {
			try {
				BufferedReader br=new BufferedReader(new FileReader("Example.txt"));
				String line;
				System.out.println("Reading file using ");
				while ((line = br.readLine()) != null) {
					System.out.println(line);
					
					
				}
				br.close();
			}
			catch(IOException e) {
				e.printStackTrace();			
			}
			FileWriter fw =new FileWriter("exampleoutput.com");
			BufferedWriter bw= new BufferedWriter(fw);
			bw.write("Example of buffered writer");
			bw.close();
		}

	}



