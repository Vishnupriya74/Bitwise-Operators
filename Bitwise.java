
public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			       byte num1 = 53;   
			       byte num2 = 79;
			       int result;
					       
			       result = num1 & num2;  
			       System.out.println("num1 & num2 = " + result);

			       result = num1 | num2;
			       System.out.println("num1 | num2 = " + result);

			       result = num1 ^ num2;
			       System.out.println("num1 ^ num2 = " + result);

			       result = ~num1;  /* 11001010(-54, 2's complement form) = ~00110101 */
			       System.out.println("~num1 = " + result );
			   }
			 	
	

}
