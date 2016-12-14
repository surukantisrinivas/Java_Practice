abstract class AbstractStatic
{
	AbstractStatic()
	{ System.out.println("abstrac class cons");}
	
	{System.out.println("istance Block ");}
	static{ System.out.println("static block");}
}
class AbstractStatic1 extends AbstractStatic
{
	AbstractStatic1()
	{
		super();
		System.out.println("normal class cons");
	}
	public static void main(String[] args) 
	{
		new AbstractStatic1();
	}
}
