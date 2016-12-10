class Parent 
{
final	void marry()
	{
		System.out.println("black girl");
	}
}
class Child extends Parent
{
	void marry()
	{
		System.out.println("white girl");
	}

	public static void main(String[] args) 
	{
        new Child().marry();
	}
}
