package com.dss.client;
import com.dss.declaration.Message;
public class TestClient1 implements Message 
{
	//must override 3 methods
	public void morning(){System.out.println("good morning");}
	public void evening(){System.out.println("good evening");}
	public void goodnight(){System.out.println("good goodnight");}
	public static void main(String[] args) 
	{
		TestClient1 t=new TestClient1();
		t.morning();
		t.evening();
		t.goodnight();
	}
}
