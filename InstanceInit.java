class Emp 
{
	int eid;
	//instance block initializing value to variables during object creation
	{
		eid=111;
	}
	void disp()
	{
		System.out.println(eid);
	}
	public static void main(String[] args) 
	{
		new Emp().disp();

	}
}
