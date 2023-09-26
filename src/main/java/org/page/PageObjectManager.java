package org.page;

public class PageObjectManager {

	private Pom1 p1;
	private Pom2 p2;
	public Pom1 getInstancePom1() {

		 return p1=new Pom1();
	}
	
	public Pom2 getInstance2() {

		 return p2=new Pom2();
	}
	
	
	
}
