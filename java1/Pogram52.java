package com.fundamental;

class Threadtwice extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(Thread.currentThread()+"  :  "+i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("class complete");
	}
}


public class Pogram52 {
	public static void main(String[] args) {
		Threadtwice t1=new Threadtwice();
		
		t1.start();
		try
		{
			t1.start();
		}
		catch(IllegalThreadStateException i)
		{
			System.out.println(i);
		}
	}

}
