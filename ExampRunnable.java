class MyRunnable implements Runnable 
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("user thread");
		}
	}
}
class ThreadDemo
{
	public static void main(String[] args) 
	{
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);//Predefine thread class 
		t.start();

		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}
}
