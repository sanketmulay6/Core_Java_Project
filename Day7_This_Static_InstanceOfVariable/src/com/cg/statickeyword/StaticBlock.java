package com.cg.statickeyword;
//using block as a static
public class StaticBlock { 
	static int num; 
	static String mystr;
	static   {    
		num = 97;   
		mystr = "Beautifull"; 
		}  
	public static void main(String args[])   { 
		System.out.println(num);
		System.out.println(mystr);
		}
	}