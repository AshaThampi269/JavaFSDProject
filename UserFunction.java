package com.step1project;

import java.io.*;
import java.util.*;

public class UserFunction 
{
	static Scanner sc = new Scanner (System.in);
	
	//Function to create a file
		public void createFile () 
		{
			System.out.println("Enter the filename to be created: ");
			String fileCreate = sc.next();
			
			File file = new File( (System.getProperty("user.dir") ) + "\\" + fileCreate );
			
			//exception handling
			try 
			{
				//if file is created
				if (file.createNewFile() ) 
				{
					System.out.println("File is successfully created !!");
				} 
				else 
				{
					System.out.println("File already exists :");
				}
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
	//File delete function
	public void deleteFile() 
	{	
		System.out.print("Enter filename to be deleted: ");
		String fileDelete = sc.next();
		
		File file = new File( (System.getProperty("user.dir") ) + "\\" + fileDelete);
		
		//check if file exists
		if(file.exists()) 
		{
			//if file is deleted
			if ( file.delete() ) 
			{
				System.out.println("File has been deleted successfully !!");
			}
		} 
		else 
		{
			System.out.println("Error 404: File not found");
		}
	}
	
	//Function to search a file
	public void searchFile() 
	{
		System.out.println("Please enter filename to be searched: ");
		String fileSearch = sc.next();
		
		File file = new File( (System.getProperty("user.dir") ) + "\\" + fileSearch );
		
		//check if the file exists
		if(file.exists()) 
		{
			System.out.println("File exits!");
		} 
		else 
		{
			System.out.println("Error 404: File not found ");
		}
	}

}
