interface It2
{
	void m1();
	void m2();
	void m3();
} 
abstract class ExampInterface implements It2
{
	public void m1(){ System.out.println("m1 method");}
}
abstract class ExampInterface1 extends ExampInterface
{

	public void m2(){ System.out.println("m2 method");}
}
class ExampInterface2 extends ExampInterface1
{
	public void m3(){ System.out.println("m3 method");}
	public static void main(String[] args) 
	{
		ExampInterface2 t=new ExampInterface2();
		t.m1();
		t.m2();
		t.m3();
	}
}
