package com.dss.client;
import com.dss.helper.Helper;
public class  TestClient2 extends Helper
{
	public void morning(){System.out.println("good morning");}
	public void evening(){System.out.println("good evening");}
	public static void main(String[] args) 
	{
		TestClient2 t=new TestClient2();
		t.morning();
		t.evening();
		t.goodnight();
	}
}
