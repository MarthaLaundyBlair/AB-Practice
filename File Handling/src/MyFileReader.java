import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyFileReader {
	
	public MyFileReader() {
		
	}
	
	public static void generateFile(String fileName) {
		
		try{
			   
		    FileWriter fw = new FileWriter(fileName);
		   
		    
			fw.write("Hello World \n");
			fw.write("This is a demo file! \n");

			
			System.out.println("File Created Successfully!!");
			
			fw.close(); 
		 
		 }
		 catch(FileNotFoundException e){
		 
		    System.out.println(e.getMessage());
		 }
		 catch(IOException e){
		 
		    System.out.println(e.getMessage());
		 }
		
		
	};
	
	public static void readAndPrint(String fileName) {

	     try{
		   
		    FileReader fr = new FileReader(fileName);
		   
		    BufferedReader br = new BufferedReader(fr);
			
			StringBuffer sb = new StringBuffer();
			
			String line;
			
			while((line = br.readLine()) != null){ 
			  
			  sb.append(line+" \n");
			
			}
			
			System.out.println(sb);
			
			fr.close(); 
		 
		 }
		 catch(FileNotFoundException e){
		 
		    System.out.println(e.getMessage());
		 }
		 catch(IOException e){
		 
		    System.out.println(e.getMessage());
		 }
		
	}
	
	
	public static void writeMyFile(String fileName) {

		FileWriter fw = null;
		BufferedWriter bw = null;
		try{
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);

			for (int i = 0; i <= 100; i++) {
				bw.append("This is line: " + i + "\n");
			}
			//create an error in line 101 to test file reader
			 bw.append("Hello hello hello hello");

			System.out.println("File Created Successfully!!");


		}
		catch(IOException e){

			System.out.println(e.getMessage());
		}
		finally {

			try{bw.close();}
			catch (IOException e) {
				e.printStackTrace();
			}
		}

	};
	
	public static void readMyFile(String fileName) throws BadLineException {
		
		try{  
		    FileReader fr = new FileReader(fileName);
		   
		    BufferedReader br = new BufferedReader(fr);
			
			String line;
			int count = 0;
			
			while((line = br.readLine()) != null){ 
			  
			  if (!(line.substring(0, 13)).equals("This is line:")) {
				  BadLineException ble = new BadLineException("Issue with line " + count +"!", line );
				  throw ble;
			  }
			
			  count++;
			}
			
			fr.close(); 
		 
		 }
		 catch(FileNotFoundException e){
		 
		    System.out.println(e.getMessage());
		 }
		 catch(IOException e){
		 
		    System.out.println(e.getMessage());
		 }
		
	}
	
	public static void main(String[] args){
		
		//MyFileReader.generateFile("new_file.txt");
		//MyFileReader.readAndPrint("new_file.txt");
		MyFileReader.writeMyFile("new_file_2.txt");
		
		try {
			MyFileReader.readMyFile("new_file_2.txt");
		} catch (BadLineException e) {
			e.printStackTrace();
		}
	}
}
