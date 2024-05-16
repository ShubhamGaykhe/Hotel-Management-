package com.Try.Hibernate;

import java.util.Scanner;
import com.Try.Hibernate.dao.DAO;
import com.Try.Hibernate.entity.Hotel;

public class App 
{
	Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
        
    	App obj=new App();
    	obj.Online_product_operation();
        
        
    }
    
    public void Online_product_operation()
    {
    	Hotel hotel=new Hotel();
        DAO dao=new DAO();
        String name;
        System.out.println("Enter your choice");
        System.out.println("1:Save Customer");
        System.out.println("2:Delete Customer");
        System.out.println("3:Update Customer");
        System.out.println("4:Get Customer By Name");
        int choice=sc.nextInt();
        
        switch(choice)
        {
        case 1:
	        System.out.println("Enter first name:");
	        hotel.setFirstName(sc.next());
	        
	        System.out.println("Enter middle name:");
	        hotel.setMiddleName(sc.next());
	        
	        System.out.println("Enter last name:");
	        hotel.setLastName(sc.next());
	        
	        System.out.println("Enter Aadhar No.:");
	        hotel.setAadharNo(sc.nextInt());
	        
	        System.out.println("Enter Phone No.:");
	        hotel.setPhoneNo(sc.nextInt());
	        
	        System.out.println("Enter Email.:");
	        hotel.setEmail(sc.next());
	        
	        dao.saveProduct(hotel);
	        
	        System.out.println(hotel);
	        
	        break;
        case 2:
        		System.out.println("Enter Product ID");
        		 name=sc.next();
        		 dao.deleteCustomer(name);
        		
        	break;
        case 3:
        	dao.updateCust();
        	break;
        case 4:
        	System.out.println("Enter Product ID");
    			 name=sc.next();
    			 dao.getCustByname(name);
        	break;
        	
        }
        
    }
    
}
