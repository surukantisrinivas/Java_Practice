class ConstAdvantage2 
{  //instane variables
	int eid;      //0
	String ename;  //null
	float esal;   //0
	//user defined constructor executed during object creation
	ConstAdvantage2(int eid,String ename,float esal)//local variable
	{   //conversion of local values to instance values
	    this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		
	}
	void disp()
	{
		System.out.println("emp id="+eid);
		System.out.println("emp name="+ename);
		System.out.println("emp sal="+esal);
	}

	public static void main(String[] args) 
	{
		ConstAdvantage2 e1 = new ConstAdvantage2(111,"cnu",1000);
		e1.disp();
		ConstAdvantage2 e2 = new ConstAdvantage2(222,"ravi",5000);
		e2.disp();
	}
}
