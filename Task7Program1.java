

package task7;

public class Task7program1 {

	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		try
		{
			int c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occured ");
		
		}
		System.out.println("Rest of the code");
	}

}
