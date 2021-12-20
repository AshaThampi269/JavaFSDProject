package com.step1project;

import java.util.*;
import java.io.*;

public class UserChoiceClass 
{
	
	int choice;
	Scanner sc = new Scanner(System.in);

	//function to sort the files in a directory in ascending order
	public String[] sortFile(String array[], int size)
    {       
       String temp = "";
		for(int i = 0; i < size; i++)
		{
			for(int j = i+1; j < size; j++)
			{
				if(array[i].compareToIgnoreCase(array[j])>0)
				{
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
    }
    
	//Function to list the files existing in the directory
	public void displayFiles() 
	{
		int fileCount = 0;
		
		//creating a collection of file names using arraylist
	    ArrayList<String> filenames = new ArrayList<String>();
		
		File directoryPath = new File(System.getProperty("user.dir"));
		File[] listOfFiles = directoryPath.listFiles();
		fileCount = listOfFiles.length;
					
	    System.out.println("\nDisplaying all the file names: ");
		for (int i = 0; i < fileCount; i++) 
		{
			if (listOfFiles[i].isFile()) 
			{
			    filenames.add(listOfFiles[i].getName());
			  } 
		}
			
		String[] str = new String[filenames.size()];
			 
		for (int i = 0; i < filenames.size(); i++) 
		{
			str[i] = filenames.get(i);
		}
			
		String[] sorted_filenames = sortFile(str, str.length);
			
		for(String currentFile: sorted_filenames) 
		{
			System.out.println(currentFile);
		}

	}
	
    public void userInterface()
    {
    	UserFunction uf = new UserFunction();
    	
    	while (true)
    	{
    		System.out.println("\n1. Add a file to the existing directory list "
    	       		+ "\n2. Delete a user specified file from the existing directory list "
    	       		+ "\n3. Search a user specified file from the main directory "
    	       		+ "\n4. Go back to main page "
    	       		+ "\nSelect an operation to continue: ");
    	        
    	       choice = sc.nextInt();
    	       
    	       switch(choice)
    	       {
    	           case 1: uf.createFile();
    	                   break;
    	                   
    	           case 2: uf.deleteFile();
    	                   break;
    	                   
    	           case 3: uf.searchFile();
    	                   break;
    	                   
    	           case 4: CompanyLockersApplication.chooseMethod();
    	           			break;
    	                                      
    	           default: System.out.println("Invalid choice !!");
    	                    break;
    	           
    	       }
    	}
       
    }
}