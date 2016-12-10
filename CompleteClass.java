class CompleteClass 
{
	int a=10; //instance var
	static int b=20;
	void m1(int a)
	{
		System.out.println("instance method");
	}
	static void m2(String str)//static method
	{
		System.out.println("static method");
	}
	CompleteClass()
	{
		System.out.println("0--args cons");
	}
	CompleteClass(int a)
	{
		System.out.println("1--args cons");
	}
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) 
	{
		CompleteClass t=new CompleteClass(); //instance cons
        CompleteClass t1=new CompleteClass(10); //instance cons
        t.m1(10);//m1 method
		CompleteClass.m2("cnu"); //m2 method
}
}