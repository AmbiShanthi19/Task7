

package task7;

public class Program2 {

	public static void main(String[] args) {
		String[] s = {"Rose" , "Jasmine"};
		try 
		{
			System.out.println(s[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index does not exit");
		}
		String name="Anu";
		try {
		String sub=name.substring(2,8);
	}
	catch(StringIndexOutOfBoundsException e)
		{
		System.out.println("String Index Out of Bounds Exception Occured");
		}

	}

}
