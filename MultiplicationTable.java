public class MultiplicationTable {		
	private final static int TABLE_OF = 2; 
	public static void main(String[] args) {	
		for (int i = 1; i <= 10 ; i++) {			
			System.out.printf(TABLE_OF + " X " + i + " = " + (TABLE_OF * i));
		}
	}
}

/*-------------------------------- Output --------------------------------
2 X 1 = 2
2 X 2 = 4
2 X 3 = 6
2 X 4 = 8
2 X 5 = 10
2 X 6 = 12
2 X 7 = 14
2 X 8 = 16
2 X 9 = 18
2 X 10 = 20
---------------------------------------------------------------------------*/