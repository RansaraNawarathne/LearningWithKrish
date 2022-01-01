public class Application {
	public static void main (String[] args) {
		System.out.println (StaticDemo.id);	
		int x = 10;
		StaticDemo.id = x;
		StaticDemo test = new StaticDemo ();
		test.id = 20;
		System.out.println ("StaticDemo.id = " + StaticDemo.id);
		System.out.println ("test.id = " + StaticDemo.id);
		test = null;
		System.out.println ("After dereferencing the test instance.....");
		System.out.println ("test.id = " + test.id);
	}
}