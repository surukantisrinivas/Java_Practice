class Test 
{
	public static void main(String[] args) 
	{
		String s1="cnu";
        System.out.println(s1);
		System.out.println(s1.toString());
		StringBuffer sb1=new StringBuffer("reddy");
		System.out.println(sb1);
		System.out.println(sb1.toString());

	}
}
class Object
{
	public String toString()
	{
		return "class-name@hashcode";
	}
}
class String extends Object
{
	//overriding toString
	public String toString()
	{
		return "content of the string object";
	}
}
class StringBuffer extends Object
{
	//overriding toString
	public String toString()
	{
		return "content of the stringbuffer object";
	}
}