
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String a1 = new String("WelcomEo");
			System.out.println(a1.charAt(19));
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("Index that yu are trying to use if outside the string length");
			System.out.println(e.getMessage());
		}
		try{
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println("Exception is caught");
		}
		System.out.println("Finish");		
	}

}
