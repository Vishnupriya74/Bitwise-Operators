
public class Rightshift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 60;          
		int b = -60;        
		int c = 0;
	      System.out.println("60  = " + Integer.toBinaryString(a));
	      System.out.println("-60 = " + Integer.toBinaryString(b));
	      c = a >> 1;              
	      System.out.println("60 >> 1  = " + Integer.toBinaryString(c)); //signed shift
          c = a >>> 1;            
	      System.out.println("60 >>> 1 = " + Integer.toBinaryString(c) );   //unsigned shift

	      c = b >> 1;              
	      System.out.println("-60 >> 1  = " + Integer.toBinaryString(c) );

	      c = b >>> 1;            
	      System.out.println("-60 >>> 1 = " + Integer.toBinaryString(c));
	}

}
