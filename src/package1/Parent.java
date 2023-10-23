package package1;

public class Parent {
	public String ps1 = "parent non static";
	public static String ps2 = "parent static";

	public void pmethod1() {
		System.out.println("parent non static method");
	}
	
	public static void pmethod2() {
		System.out.println("parent staic method");
	}
}
