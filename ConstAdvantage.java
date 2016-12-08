class ConstAdvantage2 
{
	int eid;
	String ename;
	float esal;
	//user defined constructor executed during object creation
	ConstAdvantage2()
	{
		eid=111;
		ename="cnu";
		esal=1000.50f;
	}
	void disp()
	{
		System.out.println("emp id="+eid);
		System.out.println("emp name="+ename);
		System.out.println("emp sal="+esal);
	}

	public static void main(String[] args) 
	{
		ConstAdvantage2 e1 = new ConstAdvantage2();
		e1.disp();
		ConstAdvantage2 e2 = new ConstAdvantage2();
		e2.disp();
		System.out.println("Hello World!");
	}
}
