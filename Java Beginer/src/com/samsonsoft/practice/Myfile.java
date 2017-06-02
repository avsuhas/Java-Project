package com.samsonsoft.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Myfile {
	
	 // The name of the file to open.
    String fileName = "temp.txt";

    // This will reference one line at a time
    String line = null;
    
    public void readFile() throws FileNotFoundException{
    
 // FileReader reads text files in the default encoding.
    FileReader fileReader;

		fileReader = new FileReader(fileName);
	

    // Always wrap FileReader in BufferedReader.
    BufferedReader bufferedReader = 
        new BufferedReader(fileReader);
    }
}
