abstract class Test
{
	Test()
	{
		System.out.println("abtsrct class cons");
	}
	abstract void m1();
}  
class Test1 extends Test
{
	void m1()
	{
		System.out.println("m1 method");
	}
	Test1()
	{System.out.println("normal class cons");
	}
	public static void main(String[] args) 
	{
	new Test1().m1();
	}
}
