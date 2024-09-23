package com.fundamental;

class Newthread implements Runnable
{
	Thread t;
	public Newthread(){
		t=new Thread(this);
		t.start();
	}
	
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
			{
				e.printStackTrace();
			}
		
		System.out.println("child class");
		
	}
}

public class Pogram49 
{
	public static void main(String[] args)
	{
		new Newthread();
		Thread t=Thread.currentThread();
		try
		{
			for(int i=11;i<=20;i++)
			{
				System.out.println(t+"  :  "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("main class");
		
	}
	
	

}
