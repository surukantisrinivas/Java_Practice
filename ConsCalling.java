class Test 
{
	Test()
	{ 
		this(10);
		this(10,20);
		System.out.println("0-arg cons");
	}
	Test(int a)
	{
		System.out.println("1-arg cons");

	}
	Test(int a, int b)
	{
		System.out.println("2-arg cons");
	}
	public static void main(String[] args) 
	{
		Test t1=new Test();
		//Test t2=new Test();
		//Test t3=new Test();
		
	}
}
