import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ExceptionHandling2 {

	public static void main(String[] args) throws FileNotFoundException {
		String s = null;
		//s.charAt(2);
		
		Integer a = new Integer(10);
		System.out.println(a.doubleValue());
		System.out.println(a.floatValue()); 
		
		int b = 10;
		Integer b1 = b; //boxing
		int c = b1; // unboxing
	}

}
