class Test implements Cloneable
{
	int a=10;
	int b=20;
	public static void main(String[] args) throws Exception 
	{
		Test t=new Test();
        System.out.println(t.a);
		System.out.println(t.b);
		t.a=999;
		t.b=888;
		System.out.println(t.a);
		System.out.println(t.b);
		;;;;;;;
		Test t1=(Test)t.clone();
		;;;;
		;;;
		;;
		t.a=777;
		t.b=666;
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t1.a);
		System.out.println(t1.b);

	}
}
