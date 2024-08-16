package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AssignmentFile {

	public static void main(String[] args) {
		File creatFile = new File("my_program/src/fileHandling/file.txt");
		
		  
        try {
            // Ensure parent directories exist
            creatFile.getParentFile().mkdirs();
            
            // Attempt to create the file
            if (creatFile.createNewFile()) {
                System.out.println("File created successfully: " + creatFile.getAbsolutePath());
            } else {
                System.out.println("File already exists: " + creatFile.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Failed to create the file");
            e.printStackTrace();
        }
        // to write the file
        try (FileWriter towrite = new FileWriter(creatFile)) {
            towrite.write("Hello World!");
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Failed to write data to the file.");
            e.printStackTrace();
        }
        // read the file
        File read = new File("my_program/src/fileHandling/file.txt");
        try {
        	Scanner sc = new Scanner(read);
        	while(sc.hasNextLine()) {
        		String string = sc.nextLine();
        		System.out.println(string);
        	}
		
		} catch (FileNotFoundException e) {
			System.out.println("nothing is there");
		}
        // to delete the file
        File todelete = new File("my_program/src/fileHandling/file.txt");
        if(todelete.delete()) {
        	System.out.println("My file is deleted:"+todelete.getName());
        	
        }
        else {
        	System.out.println("The file is not deleted");
        }
        
        
        
    }

	}


