package com.bridgelabz.designpatterns.creationalpatterns.singleton;

public class EagerInitializedSingleton 
{
	private static EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	  //private constructor to avoid client applications to use constructor
	
	private EagerInitializedSingleton()
	{
		
	}
	public static EagerInitializedSingleton getInstance()
	{
		return instance;
	}
}
