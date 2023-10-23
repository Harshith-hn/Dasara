package package2;

import package1.Child;

public class Demo1 extends Child {
	String d1 = "demo1 non static";
	static String d2 = "demo1 static";

	public void dmethod1() {
		System.out.println("non static d1 method");
	}
	public static void dmethod2() {
		System.out.println("static d1 method");
	}
}

