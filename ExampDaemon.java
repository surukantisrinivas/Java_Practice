class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{ 
			System.out.println("Deamon functionality");
            try{Thread.sleep(1000);}
			catch(InterruptedException ie){ie.printStackTrace();}
		}
	}
}
class ThreadDemo
{
	public static void main(String[] args)//main Thread 
	{   
		MyThread t=new MyThread();
		t.setDaemon(true);
		t.start();

		for(int i=0;i<10;i++)
		{
			try{Thread.sleep(1000);}
			catch(InterruptedException ie){ie.printStackTrace();}
			System.out.println("main thread");
		}
	
	}
}