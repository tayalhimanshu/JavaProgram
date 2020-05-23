package Java_Program;
import java.util.Arrays;
public class secondHighestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };		
		
		int largest = arr[0];
		int secondLargest = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
			if (arr[i] > largest)
		    {
		        secondLargest = largest;
		        largest = arr[i];
		    }
		    else if (arr[i] > secondLargest && arr[i] != largest)
		    {
		        secondLargest = arr[i];
		    }
		}
		System.out.println("Second largest number is:" + secondLargest);
	}

}
