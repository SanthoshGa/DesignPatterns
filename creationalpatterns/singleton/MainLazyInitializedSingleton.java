package com.bridgelabz.designpatterns.creationalpatterns.singleton;

public class MainLazyInitializedSingleton 
{
	public static void main(String[] args) 
	{
		LazyInitializedSingleton  laz = LazyInitializedSingleton .getInstance();
		System.out.println(" "+laz.hashCode());
		LazyInitializedSingleton  laz1 = LazyInitializedSingleton.getInstance();
		System.out.println(" "+laz1.hashCode());
	}

}
