import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectToFile {
	
	

	
	public static void main(String[] args) {
		
		ArrayList<String> eventsArrayList = new ArrayList<>();
		//eventsArrayList.add("hi");
		/*
		try (
				FileOutputStream fos = new FileOutputStream("object.dat");
			     ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			    oos.writeObject(eventsArrayList);

			} catch (IOException ex) {
			    ex.printStackTrace();
			}
		
		eventsArrayList.add("hello");
		System.out.println(eventsArrayList);
		*/
		try {
			 
            FileInputStream fileIn = new FileInputStream("object.dat");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
 
           eventsArrayList = (ArrayList<String>) objectIn.readObject();
 
            objectIn.close();
            System.out.println(eventsArrayList);
         
        } catch (Exception ex) {
            ex.printStackTrace();
          
        }
		
		
	}

}
