

package task6;

import task6.InvalidageExceptions;

public class InvalidageExceptions extends Exception {
 	
		public InvalidageExceptions(String s)
		{
			super(s);
			
		}
		public class CustomException1  
		{  
		  
		    // method to check the age  
		    static void validate (int age) throws InvalidageExceptions {    
		       if(age < 18){  
		  
		        // throw an object of user defined exception  ;
		        throw new InvalidageExceptions("age is not valid to vote");    
		    }  
		       else {   
		        System.out.println("welcome to vote");   
		        }   
		    }
		public static void main(String[] args) {
			
			 try  
		        {  
		            // calling the method   
		            validate(13);  
		        }  
		        catch (InvalidageExceptions ex)  
		        {  
		            System.out.println("Caught the exception");  
		    
		            // printing the message from InvalidAgeException object  
		            System.out.println("Exception occured: " + ex);  
		        }  
		  
		        System.out.println("rest of the code...");
		}

		

		}

	}

