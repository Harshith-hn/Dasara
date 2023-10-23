package package1;

public class Driver {

	public static void main(String[] args) {
		Parent p= new Parent();
		p.pmethod1();
		p.pmethod2();
		System.out.println("----------------");
		//Parent.pmethod1();
		Parent.pmethod2();
		System.out.println("----------------");
		System.out.println(p.ps1);
		System.out.println(p.ps2);
		System.out.println("----------------");
		//System.out.println(Parent.ps1);
		System.out.println(Parent.ps2);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");
		
		Child c= new Child();
		c.pmethod1();
		c.pmethod2();
		System.out.println("----------------");
		//Child.pmethod1();
		Child.pmethod2();
		System.out.println("----------------");
		System.out.println(c.ps1);
		System.out.println(c.ps2);
		System.out.println("----------------");
		//System.out.println(Child.ps1);
		System.out.println(Child.ps2);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------");
		
		Parent pc = new Child();
		pc.pmethod1();
		pc.pmethod2();
		System.out.println("----------------");
		System.out.println(pc.ps1);
		System.out.println(pc.ps2);
	}

}
