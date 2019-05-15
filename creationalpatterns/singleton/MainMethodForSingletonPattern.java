package com.bridgelabz.designpatterns.creationalpatterns.singleton;

public class MainMethodForSingletonPattern 
{
	public static void main(String[] args) 
	{
		System.out.println("*************************BillPughSingleton***********************");
		BillPughSingleton bps=BillPughSingleton.getInstance();
		System.out.println(" "+bps.hashCode());
		BillPughSingleton bps1=BillPughSingleton.getInstance();
		System.out.println(" "+bps1.hashCode());
		System.out.println("*************************EagerInitializationSingleton***********************");
		EagerInitializedSingleton es =  EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton es1 =  EagerInitializedSingleton.getInstance();
		System.out.println(" "+es.hashCode());
		System.out.println(" "+es1.hashCode());
		System.out.println("*************************EnumSingleton***********************");
		EnumSingleton enu=EnumSingleton.INSTANCE;
		System.out.println(" "+enu.hashCode());
		EnumSingleton enu1=EnumSingleton.INSTANCE;
		System.out.println(" "+enu1.hashCode());
		System.out.println("*************************LazyInitializationSingleton***********************");
		LazyInitializedSingleton  laz=LazyInitializedSingleton .getInstance();
		System.out.println(" "+laz.hashCode());
		LazyInitializedSingleton  laz1=LazyInitializedSingleton.getInstance();
		System.out.println(" "+laz1.hashCode());
		System.out.println("**************************StaticBlockInitializationSingleton*******************");
		StaticBlockSingleton sb = StaticBlockSingleton.getInstance();
		System.out.println(" "+sb.hashCode());
		StaticBlockSingleton sb1 =StaticBlockSingleton.getInstance();
		System.out.println(" "+sb1.hashCode());
		System.out.println("****************************ThreadSafeSingleton**********************");
		ThreadSafeSingleton thread=ThreadSafeSingleton.getInstance();
		System.out.println(" "+thread.hashCode());
		ThreadSafeSingleton thread1=ThreadSafeSingleton.getInstance();
		System.out.println(" "+thread1.hashCode());
	}


}
