package com.flp.ems.view;
import java.util.HashMap;
import java.util.Scanner;

public class UserInteraction {

	
	/**
	 * 
	 */
	void AddEmployee(){
		int empid,kinid,phoneno,doj,did,pid,rid;
		String name,emailid,address,value;
		
		 Scanner sc = new Scanner(System.in); 
		HashMap<String,String> user = new HashMap<>();
		 
		
		  System.out.println("enter empid ");
		    empid=sc.nextInt();
		    System.out.println("enter name  ");
		    name =sc.next();
		    System.out.println("enter kinid");
		    kinid=sc.nextInt();
		    System.out.println("enter emailid");
		    emailid=sc.next();
		    System.out.println("enter ur phone no");
		    phoneno=sc.nextInt();
		    System.out.println("enter doj");
		    doj=sc.nextInt();
		    System.out.println("enter did");
		    did=sc.nextInt();
		    System.out.println("enter pid");
		    pid=sc.nextInt();
		    System.out.println("enter rid");
		    rid=sc.nextInt();
		    System.out.println("enter adderss");
		    address=sc.next();
		    
		    
		    value=user.put("name", name);
		    if(value==null){
		    	System.out.println(name);
		    }
		
		
		     
			  

}}
