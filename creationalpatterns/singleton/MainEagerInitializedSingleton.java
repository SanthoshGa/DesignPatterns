package com.bridgelabz.designpatterns.creationalpatterns.singleton;

public class MainEagerInitializedSingleton 
{
	public static void main(String[] args)
	{
		 EagerInitializedSingleton es =  EagerInitializedSingleton.getInstance();
		 EagerInitializedSingleton es1 =  EagerInitializedSingleton.getInstance();
		 System.out.println(" "+es.hashCode());
		 System.out.println(" "+es1.hashCode());
	}
}
