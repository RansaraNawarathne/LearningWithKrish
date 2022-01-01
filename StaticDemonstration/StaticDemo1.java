public class StaticDemo1 {

	{
		System.out.println ("Empty block executed.....");
	}
	
	static {
		System.out.println ("Static block executed.....");
	}

	public StaticDemo1 () {
		System.out.println ("Constructor executed......");
	}

	public static void main (String[] args) {
		StaticDemo1 staticDemo1 = new StaticDemo1 ();
	}
}