
public class Account {

	static int numAccounts = 0; //static variable initialized to 0
	
	Account() { //constructor method
	numAccounts=numAccounts + 1;
	}
	
	private static int getNumAccounts() { //static method getNumAccounts
		return numAccounts;
	}
	
	
	public static void main(String[] args) {
		Account obj1 = new Account(); //Account objects listed 
		Account obj2 = new Account();
		Account obj3 = new Account();
		Account obj4 = new Account();
			System.out.println("The Number of Accounts is: " +getNumAccounts()); //printing
				

	}

}
