
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI obj = new ICICI();
		obj.houseLoanFeature();
		System.out.println(obj.accBalance);
		
		RBI r = new ICICI(); //runtime polymorphism - inheritance
		
		ICICI i = (ICICI) new RBI();
	}

}
