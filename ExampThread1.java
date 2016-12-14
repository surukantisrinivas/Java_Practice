class MyThread extends Thread
{
	public void run()
	{
	}
}
class ThreadDemo
{
	public static void main(String[] args)//main Thread 
	{   
		MyThread t1=new MyThread();
		t1.start();
		MyThread t2=new MyThread();
		t2.start();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.setName("cnu");
		
		System.out.println(t1.getName());
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setName("reddy");
		System.out.println(Thread.currentThread().getName());
        
        System.out.println(t1.getId());
		System.out.println(t2.getId());
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		System.out.println(Thread.activeCount());
		}
}
