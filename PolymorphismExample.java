public class PolymorphismExample {
	int a;
	static String s;
	private float b = 4;

	public void area() { // method definition or called method

	}

	/*public void area(int a) { // method definition or called method
		System.out.println("Square");
		System.out.println(a*a);
	}*/
	
	public void area(float a) { // method definition or called method
		System.out.println("Equilateral Triangle");
		int ar = (int) ((Math.sqrt(3) / 4) * (Math.pow(a, 2)));
		System.out.println(ar);
	}
	
	/*public void area(int h,int b) { // method definition or called method
		System.out.println("Triangle");
		int ar = (int) (0.5*h*b);
		System.out.println(ar);
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismExample pe = new PolymorphismExample();
		pe.area(2);
		/*pe.area(4, 5);
		pe.area(3.5f);*/
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}
	
	

}
