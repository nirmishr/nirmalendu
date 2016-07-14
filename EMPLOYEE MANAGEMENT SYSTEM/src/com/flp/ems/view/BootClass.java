package com.flp.ems.view;
import  java.util.Scanner;

import com.flp.ems.domain.employee; 




public class BootClass {
	
	
	public static void main(String[]args){
		 int opt;
		 
		 System.out.println("addemployee");
		 System.out.println("modify employee");
		 System.out.println("remove employee");
		 System.out.println("remove employee");
		 System.out.println("search employee");
		 System.out.println("get all employee");
		    Scanner sc = new Scanner(System.in);
		   System.out.println("enter your opt:");
		    opt = sc.nextInt();
	
		
		menuSelection(opt);
		
	
	}
static void menuSelection(int no){
	UserInteraction u= new UserInteraction();
	
	    switch (no) {
	        case 1:
	        	//System.out.println(" add employee ");
	        	
	        	
	        	Scanner sc = new Scanner(System.in);
	             u.AddEmployee();
	             System.out.println("want to add another employee  (y/n)?");
	             String answer=sc.next();
	             if (answer.equals("y") || answer.equals("Y")) ;
	            	 
	         			
	            break;
	        case 2:
	            System.out.println(" modify employee ");
	   
	           
	        //    ModifyEmployee();
	             break;
	        case 3:
	            System.out.println(" remove employee ");
	            
	        //    RemoveEmployee();
	              break;
	        case 4:
	            System.out.println("search employee ");
	         
	       //     SearchEmployee();
	            
	            break;
	        case 5:
	        	System.out.println(" get all employee ");
	       
	      //  	getAllEmployee();
	        	break;
	        case 6:
	        	System.out.println(" ");
	        	
	        	
}
}}
