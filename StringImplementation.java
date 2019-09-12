
public class StringImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("WelcomEo");
		
		String b = "Welcome";
		
		String b1 = null;
		
		String b2 = "H";
		
		String b3 = "10"+"20";
		System.out.println(b3);
		
		System.out.println(b1==b);
		
		b = "Welcome" + "!";
		
		System.out.println(b1==b); //10, 4 
		//System.out.println(a.charAt(19));
	
		System.out.println("finish");
		
		System.out.println(b1.equalsIgnoreCase(b2));
		
	/*	System.out.println(b.compareTo(a));
		
		System.out.println(a.concat(" To Java"));
		System.out.println(a);
		System.out.println(a.contains("comE"));
		System.out.println(a.equalsIgnoreCase(b));
		
		System.out.println(a.lastIndexOf("o"));
		
		System.out.println(a.substring(3,6));
		
		System.out.println(a.trim());*/
	}

}
