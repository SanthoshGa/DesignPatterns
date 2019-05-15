package com.bridgelabz.designpatterns.creationalpatterns.singleton;

public class MainStaticBlockSingleton 
{
	public static void main(String[] args)
	{
		StaticBlockSingleton sb = StaticBlockSingleton.getInstance();
		System.out.println(" "+sb.hashCode());
		StaticBlockSingleton sb1 =StaticBlockSingleton.getInstance();
		System.out.println(" "+sb1.hashCode());
	}

}
