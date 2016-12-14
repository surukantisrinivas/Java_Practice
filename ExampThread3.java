class MyThread extends Thread
{
	public void run()
	{
		System.out.println("hook functionality");
	}
}
class ThreadDemo
{
	public static void main(String[] args)//main Thread 
	{   
		MyThread t=new MyThread();
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(t);

		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
			try{Thread.sleep(1000);}
			catch(InterruptedException ie){ie.printStackTrace();}
			if(i==5)
			{
				System.exit(0);
			}
		}
	}
}