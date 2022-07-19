package com.cg.default1;

public class constructor { 
	int num;
    String name;
    constructor()
    
    	{ System.out.println("Constructor called"); }
    

}
class B{
	public static void main(String[] args) {
   
		 constructor a = new  constructor();

        { System.out.print(a.name);}
        {  System.out.print(a.num);}
   
}
}