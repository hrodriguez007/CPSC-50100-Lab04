
public class Box {

	int size = 0;
	
	public void printBox() { //method printBox
		
		for(int c1 = 0; c1 < size; c1++) { //nested for loop represents columns
			
			for(int r = 0; r < size; r++) { //nested for loop represents rows
		
			System.out.print("*"); //printing "*"
		
		}
		
		System.out.println();
	
		}
	
	}	
	
	public void printBox(char c) { //added overload
		for (int c1 = 0; c1 < size; c1++) { //nested loop for columns
			for(int r = 0; r< size; r++) { //nested loop for rows
				System.out.print(c); //printing "c"
			}
			
		System.out.println();
		
		}
	}
	
	public static void main(String[] args) { //main method
		Box box = new Box(); //new object for Box class
			box.size = 5; // dot operator
			box.printBox(); //printBox method invoked
			
			System.out.println();
			System.out.println("New Overload Method Output:");//replacing the '*'
			
			box.printBox('c'); //replaced with c

	}

}
