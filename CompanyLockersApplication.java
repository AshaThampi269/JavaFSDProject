package com.step1project;

import java.util.*;

public class CompanyLockersApplication 
{
	static Scanner sc = new Scanner (System.in);
	static int choice;
	
	public static void main(String[] args) 
	{
        System.out.println("Welcome to  LockedMe.com !!");
        System.out.println("Developed by company Lockers Pvt Ltd.");
        System.out.println("Developer: Asha Thampi - Trivium eSolutions");
        
        chooseMethod(); 
	}
	
	static void chooseMethod()
	{
		UserChoiceClass uc = new UserChoiceClass();
        
		while (true)
		{
			System.out.println("\n1. Get the file names \n2. Get the details of user interface \n3. Exit the application \nSelect an operation to continue: ");
	        choice = sc.nextInt();
	        
	        switch(choice)
	        {
	            case 1: uc.displayFiles();	//to display files in ascending order
	                    break;
	                    
	            case 2: uc.userInterface();	//to display user interface options
	                    break;
	            
	            case 3: System.exit(0);	//close the application
	                    break;
	                    
	            default: System.out.println("Invalid choice !!");
	                    break;
	        }
		}
        
	}
}
