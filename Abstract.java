abstract class Test 
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4(){System.out.println("m4 method");}
}
class Test1 extends Test
{
	void m1(){System.out.println("m1 method");}
	void m2(){System.out.println("m2 method");}
	void m3(){System.out.println("m3 method");}
	public static void main(String[] args) 
	{
		//Test t= new Test();
		/*Test1 t= new Test1();
		t.m1();
		t.m2();
		t.m3();
		t.m4();*/
		Test t1=new Test1();
		t1.m1();
		t1.m2();
		t1.m3();
		t1.m4();
	}
}
