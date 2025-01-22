

package task7;

import java.util.TreeMap;

public class Program6 {

	public static void main(String[] args) {
		TreeMap<Integer,String> Employee=new TreeMap<Integer,String>();
		Employee.put(71,"Jaspher");
		Employee.put(32,"Deepa");
		Employee.put(53,"Santhiya");
		Employee.put(64,"Devi");
		Employee.put(15, "Varsha");
		
		System.out.println("Employee details : " +Employee);
		
		//Print in ascendending order
		System.out.println("Displaying Employee name in alphabatical order");
		//Stream method is called on the collection return by values
		//sorted methods are used to return elements in natural order
		//For each is terminal operation on the stream
		Employee.values().stream().sorted().forEach(System.out::println);
			
	}

}
