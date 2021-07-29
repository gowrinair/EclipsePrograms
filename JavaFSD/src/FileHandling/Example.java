package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example {
	public static void main(String args[]) {  
        try {  
                // Creating an object of a file  
                File f0 = new File("D:newExample.doc");   
                if (f0.createNewFile()) {  
                           System.out.println("File " + f0.getName() + " is created successfully.");  
                } else {  
                           System.out.println("File is already exist in the directory.");  
                }  
                if (f0.exists()) {  
    	            // Getting file name  
    	            System.out.println("The name of the file is: " + f0.getName());  
    	   
    	            // Getting path of the file   
    	            System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());     
    	   
    	            // Checking whether the file is writable or not  
    	            System.out.println("Is file writeable?: " + f0.canWrite());    
    	   
    	            // Checking whether the file is readable or not  
    	            System.out.println("Is file readable " + f0.canRead());    
    	   
    	            // Getting the length of the file in bytes  
    	            System.out.println("The size of the file in bytes is: " + f0.length());    
    	        } else {  
    	            System.out.println("The file does not exist.");  
    	        }  
                FileWriter fwrite = new FileWriter("D:newExample.doc");  
    	        // writing the content into the Example.txt file  
    	        fwrite.write("A new doc called Example is created in the D folder!.");   
    	   
    	        // Closing the stream  
    	        fwrite.close();   
    	        System.out.println("Content is successfully wrote to the file."); 
    	        
    	        //Reading the file
    	        Scanner dataReader = new Scanner(f0);  
	            while (dataReader.hasNextLine()) {  
	                String fileData = dataReader.nextLine();  
	                System.out.println(fileData);  
	            }  
	            dataReader.close();  
              } catch (IOException exception) {  
                       System.out.println("An unexpected error is occurred.");  
                       exception.printStackTrace();  
           }  
        
 }  

}
