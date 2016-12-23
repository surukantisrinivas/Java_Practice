import java.util.*;
import java.io.*;

class PropertiesDemo 
{
	public static void main(String[] args) throws Exception
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("abc.Properties");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("venky");
		System.out.println(s);//9999
		p.setProperty("nag","8888");
		FileOutputStream fos=new FileOutputStream("abc.Properties");
		p.store(fos,"Upadated by cnu for SCJP Demo Class");
		System.out.println("Hello World!");
	}
}
