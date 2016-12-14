class Emp
{  //instance var
	int eid;
	String ename;
	Emp(int eid,String ename)//local var
	{
		this.eid=eid;
		this.ename=ename;
	}
	//overriding toString()
	public String toString()
	{
		return "emp id="+eid+" emp name="+ename;
	}
	public static void main(String[] args) 
	{
		Emp e1=new Emp(111,"cnu");
		System.out.println(e1);
		System.out.println(e1.toString());
	}
}
