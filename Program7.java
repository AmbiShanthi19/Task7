

package task7;

import java.util.LinkedList;

public class Program7 {

	public static void main(String[] args) {
		LinkedList<String> flo=new LinkedList<>();
		
		
		flo.add("Rose");
		flo.add("Sunflower");
		flo.add("Lotus");
		// Storing it inside array of strings
        String[] arr = new String[flo.size()];

        // Converting ArrayList to Array
        // using get() method
        for (int i = 0; i < flo.size(); i++)
        {
        	arr[i] = flo.get(i);
        }

        // Printing elements of array on console
        for (String x : arr)
        {
        	System.out.print(x + " ");
        }
    }

	}

