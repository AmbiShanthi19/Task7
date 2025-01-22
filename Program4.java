

package task7;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program4 {

	public static void main(String[] args) {
		try {
			FileReader file=new FileReader("test.txt");
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();
			System.out.println("File not exist");
		}

	}

}
