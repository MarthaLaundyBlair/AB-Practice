import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyConsoleReader {
	
	public static void readAndPrint() {
		String line;
		StringBuffer sb = new StringBuffer("");
		
		// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter something: ");  
		try {
			
			
			do {
				line = br.readLine();
				sb.append(line);
				sb.append(" ");
			}
			while (!line.equals("stop"));
		
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		System.out.println(sb);
	}
	public static void main(String[] args){
		
		MyConsoleReader.readAndPrint();
		
	}
}
