public class Addition
{
	int c;
	void addition(int x, int y)
	{
			c=x+y;
	}
	void display()
	{
		System.out.println(c);
	}
	public static void main(String[] args)
		{
       System.out.println("hi");
        System.out.println("this is my addition");
		Addition a = new Addition();
        a.addition(57,53);
        a.display();
		}
}