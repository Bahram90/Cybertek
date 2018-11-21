package com.cybertek.package1;
//import com.cybertek.package2.*;//to import packages from different package
//import com.cybertek.package2.Class2;
//import com.cybertek.package2.Class3;

public class Class1 {

	public static void main(String[] args) {
		
		
		//There are 3 ways to acces package from outside the package 
		//1- import package.*;
		//2-import package.className;
		//3-fully qualified name
		
//		Class2 cl=new Class2();
//		Class3 c2=new Class3();
		
		com.cybertek.package2.Class2 cl=new com.cybertek.package2.Class2();
		com.cybertek.package2.Class3 cl1=new com.cybertek.package2.Class3();

	}

}
//For Mac users => go to Eclipse > Preferences > General > Appearance ; Select