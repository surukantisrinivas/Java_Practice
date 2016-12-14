class ExampleArray
{
	int[] m1()
	{
	int[] a={10,20,30};
	System.out.println("m1 method");
	return a;
	}
	void m2(double[] d)
	{
		System.out.println("m2 methd");
		for(double dd:d)
		{
			System.out.println(dd);
		}
	}
	public static void main(String[] args) 
	{
		ExampleArray ex=new ExampleArray();
		int[] x=ex.m1();
		for(int xx:x)
		{ System.out.println(xx);}

		double[] d={10.2,30.4,40.7};
		ex.m2(d);
	}
}
