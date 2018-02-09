
public class Foothill {
	public static void main(String[] args) {
		//default constructor
		InternetUser TestUser1 = new InternetUser();
		System.out.println("Default InternetUser constructor output: ");
		System.out.println(TestUser1.toString());
		
		//testing constructor overrider
		System.out.println("Constructor 'set' override method: ");
		TestUser1.set("TestUser1", "192.168.4.20");
		System.out.println(TestUser1.toString());
		
		//getName() method test
		System.out.println("getName() method test:");
		System.out.println(TestUser1.getName() + " \n");
		
		//getIP() method test
		System.out.println("getIP() method test:");
		System.out.println(TestUser1.getIP() + " \n");
		
		//constructor 'set' override ERROR test
		System.out.println("Constructor 'set' override ERROR test: ");
		TestUser1.set("gucci_gang$gucci_gang$gucci_gang$gucci_gang$gucci_gang$", "9001_9001_9001_9001_");
		System.out.println(TestUser1.toString());
	}
}
