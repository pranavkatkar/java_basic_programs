public class Factorial {
	private final static int FACTORIAL_OF = 5; 
	public static void main(String[] args) {
		int fact = 1;
		for (int i = FACTORIAL_OF; i > 1 ; i--) {
			fact = fact * i;
		}
		System.out.println("FACTORIAL OF " + FACTORIAL_OF + " is: " + fact);
	}	
}

/*-------------------------------- Output --------------------------------
FACTORIAL OF 5 is: 120
---------------------------------------------------------------------------*/
