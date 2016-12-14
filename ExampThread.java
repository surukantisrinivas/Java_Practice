class MyThread extends Thread
{
}
class ThreadDemo
{
	public static void main(String[] args)//main Thread 
	{  //userdefined thread starting code 
		MyThread t=new MyThread();
		t.start();
		//logics of main thread
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}
}
