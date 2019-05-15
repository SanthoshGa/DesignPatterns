package com.bridgelabz.designpatterns.creationalpatterns.factorypattern;

public class MainFactoryPattern 
{
	public static void main(String[] args) 
	{
		Computer pc=ComputerFactory.getComputer("PC"," 4GB", "1TB", "2.5GHz");
		System.out.println("Factory PC Config: "+pc);
		Computer server=ComputerFactory.getComputer("SERVER"," 8GB", "1.5TB", "2.8GHz");
		System.out.println("Factory SERVER Config: "+server);	
	}

}
