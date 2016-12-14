interface It1
{
	int a=10;
	void m1();
	}
class  Test implements It1
{
	public void m1()
		{
		a=a+10;
		System.out.println(a);
		}
	public static void main(String[] args) 
	{
		new Test().m1();
	}
}
