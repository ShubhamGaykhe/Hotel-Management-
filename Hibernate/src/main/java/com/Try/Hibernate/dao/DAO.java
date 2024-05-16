package com.Try.Hibernate.dao;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Try.Hibernate.entity.Hotel;
import com.Try.Hibernate.utility.HibernateUtility;
public class DAO 
{
	public void saveProduct(Hotel hotel)
	{
		Transaction transaction=null;
		try(Session session=HibernateUtility.getSessionFactory().openSession()) 
		{
			transaction=session.beginTransaction();
			session.save(hotel);
			transaction.commit();
			session.close();
		} 
		catch (Exception e) 
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
		
	}
	
	public void deleteCustomer(String FirstName)
	{
		Transaction transaction=null;
		try(Session session=HibernateUtility.getSessionFactory().openSession()) 
		{
			transaction=session.beginTransaction();
			Hotel hotel=session.get(Hotel.class, FirstName);
			session.delete(hotel);
			System.out.println("Customer First name "+FirstName+" is deleted");
			transaction.commit();
			session.close();
		} 
		catch (Exception e) 
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
		
	}
	
	public void getCustByname(String FirstName)
	{
		Transaction transaction=null;
		try(Session session=HibernateUtility.getSessionFactory().openSession()) 
		{
			transaction=session.beginTransaction();
			Hotel hotel=session.get(Hotel.class, FirstName);
			if(hotel!=null)
			{
				System.out.println(hotel);
				System.out.println("First Name:"+hotel.getFirstName());
				System.out.println("Middle Name:"+hotel.getMiddleName());
				System.out.println("Last Name:"+hotel.getLastName());
				System.out.println("Aadhar No:"+hotel.getAadharNo());
				System.out.println("Phone No:"+hotel.getPhoneNo());
				System.out.println("Email:"+hotel.getEmail());
			}
			else
			{
				System.out.println("Data not found of Name :"+FirstName);
			}
			transaction.commit();
			session.close();
		} 
		catch (Exception e) 
		{
			System.out.println("Error in fectching the data");
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
		
	}
	
	public void updateCust()
	{
		Transaction transaction=null;
		try(Session session=HibernateUtility.getSessionFactory().openSession()) 
		{
			Scanner sc=new Scanner(System.in);
			transaction=session.beginTransaction();
			System.out.println("Enter Cust Name:");
			String name=sc.next();
			
			Hotel hotel=session.get(Hotel.class, name);
			
			if(hotel!=null)
			{
				System.out.println("Enter the column no which you want to update");
				System.out.println("1:First Name\n2:Middle Name\n3:Last Name");
				System.out.println("4:Aadhar No\n5:Phone No\n6:Email");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter the first name which you want to change");
					hotel.setFirstName(sc.next());
					break;

				case 2:
					System.out.println("Enter the middle name which you want to change");
					hotel.setMiddleName(sc.next());
					break;

				case 3:
					System.out.println("Enter the last name which you want to change");
					hotel.setLastName(sc.next());
					break;

				case 4:
					System.out.println("Enter the Aadhar No. which you want to change");
					hotel.setAadharNo(sc.nextInt());
					break;

				case 5:
					System.out.println("Enter the phone No. which you want to change");
					hotel.setPhoneNo(sc.nextInt());
					break;
					
				case 6:
					System.out.println("Enter the email which you want to change");
					hotel.setEmail(sc.next());
					break;
					
				default:
					System.out.println("Enter valid choice\n");
					
				}
			}
			session.saveOrUpdate(hotel);
			System.out.println(hotel);
			transaction.commit();
			session.close();
		} 
		catch (Exception e) 
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
	}
	
	
	
}
