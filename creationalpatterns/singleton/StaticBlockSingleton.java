package com.bridgelabz.designpatterns.creationalpatterns.singleton;

public class StaticBlockSingleton
{
	private static StaticBlockSingleton instance;
	private StaticBlockSingleton()
	{
		
	}
	static
	{
		try 
		{
			instance = new StaticBlockSingleton();
					
		}
		catch(Exception e)
		{
			throw new RuntimeException("exception occured in creating singleton object");
		}
	}
	public static StaticBlockSingleton getInstance()
	{
		return instance;
	}

}
