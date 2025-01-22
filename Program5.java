

package task7;

import java.util.ArrayList;

public class Program5 {

	public static void main(String[] args) {
		ArrayList<String> alS=new ArrayList<>();
		alS.add("Rose"); //adding element in arrayList
		alS.add("Jasmine");
		alS.add("Lotus");
		alS.add("Lily");
		//Displaying the Array list
	System.out.println("ArrayList is : " +alS);
	alS.remove(1);
	//removing 1 element in arraylist
	System.out.println("ArrayList is : " +alS);
	alS.removeAll(alS); //removing all elements in arraylist
	System.out.println("ArrayList is : " +alS);
	}

}
