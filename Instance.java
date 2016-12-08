class Test
{
	Test()
	{
		System.out.println("0--arg cons");
	}
	Test(int a)
	{
		System.out.println("1-arg cons");
	}
	{
		System.out.println("instance block 1");
	}
	{
		System.out.println("instance block 2");
	}
	public static void main(String[] args) 
	{
		new Test();
		new Test(10);
	
	}
}
