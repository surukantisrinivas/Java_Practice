class Test 
{
	Test(String str){}
	public static void main(String[] args) 
	{
		Test t1=new Test("reddy");
		Test t2=new Test("reddy");
        System.out.println(t1.equals(t2));

		String s1="cnu";
		String s2="cnu";
		System.out.println(s1.equals(s2));

		StringBuffer sb1=new StringBuffer("srinu");
	    StringBuffer sb2=new StringBuffer("srinu");
		System.out.println(sb1.equals(sb2));
	}
}
