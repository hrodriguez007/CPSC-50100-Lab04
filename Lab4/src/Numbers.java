import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
	public static int nextLargest(int array[], int element) {
		int nextLargestElement = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > element) {
				nextLargestElement = array[i];
				
				break;
		
			}
		}
		
		return nextLargestElement;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int array[];
		int sortedArray[];
			System.out.print("Enter the desired size for the array:");
			
			
		size = sc.nextInt();
		array = new int[size];
		sortedArray = new int[size];
			System.out.println("Enter desired array elements:");
			
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			sortedArray[i] = array[i];
	
		}
		{	
			sc.close();
			
		}
			
		
		Arrays.sort(sortedArray);
		int max = Arrays.stream(array).max().getAsInt();
			System.out.println();
			System.out.println("Output");
			
		for(int i = 0; i < size; i++) {
			int nextLargestElement = nextLargest(sortedArray, array[i]);
			
		
			if(nextLargestElement != -1) {
			System.out.println(array[i] + ":" + nextLargestElement);
			
		}else {
			System.out.println(array[i] + ":" + Integer.MAX_VALUE);
		}
		}
		
		
	}
}