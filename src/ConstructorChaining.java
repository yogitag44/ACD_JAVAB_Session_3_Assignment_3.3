import java.util.Scanner;
import java.io.*;

 public class ConstructorChaining {
//Within same class: It can be done using this() keyword for constructors in same class
	
	//within same class using this() keyword
	 
	//Constructor 1
	//Default constructor without any parameter
	public ConstructorChaining(){  
		
		
		
		System.out.println("This is the default constructor !! \n");  //Will print this message of default constructor
	}
	
	//Constructor 2
	 //Constructor with a single parameter
	 public ConstructorChaining(int num1){   
		 
		 //this() should be the first parameter in calling the current constructor
		 
	        this(); //this() is calling the default constructor defined above this
	        System.out.println("In single parameter constructor... \n");  //printing output from the second constructor
	        															//Single parameter constructor
	        System.out.println("Value received in second (Single parameter constructor) is: "+num1);  //Got value from the third constructor
	        
	    }
	
	 
	//Constructor 3
	//Constructor with two parameters
	    public ConstructorChaining(int num2,int num3){   
	    	
	        this(num3);    //Calling the single parameter constructor of the class and passing value of num3 of current constructor
	        System.out.println("\nIn double parameter constructor...\n"+"Value of i is "+num2 + " Value of j is: "+num3); //Printing the value of current 2 parameter constructor
	    }
	     
	    public static void main(String a[]){
	    	
	    	System.out.println("-----------------Within same class using this() keyword---------------\n\n");
	    	ConstructorChaining hd = new ConstructorChaining();
	    			
	    			
	    	ConstructorChaining consChain = new ConstructorChaining(10,20);
	    	
	    	//Above constructor will call constructor with two parameters and two parameter 
	    	//constructor will call one parameter constructor and than that will call the default constructor.
	    	
	    	System.out.println("\n\n-----------------Within Other class using Super() keyword---------------\n\n");
	    	 Derived derivedConst = new Derived(40);
	    }
	
}
 
 class Derived extends ConstructorChaining{   //inheriting properties of base class in child  class
	 
	 //constructor 4 (now from Derived class)
	 //No parameter constructor
	 Derived(){
		 
		 System.out.println("This is the default constructor of Derived Class extending from Base class");
	 }
	 
	 //Constructor 5
	 //one parameter constructor and this will call one parameter constructor of ConstructorChaining class
	 Derived(int num4){
		 
		 //invoking base class constructor i.e constructor of ConstructorChaining class
		 super(num4);
		 
		 //Calling one parameter constructor
		 System.out.println("Calling parameterised constructor with Derived constructor\n");
		 
		 //get value from main method i.e 40
		 System.out.println("Value received in the costructor is: "+ num4);
		 
	 }
	 
	 
 }
