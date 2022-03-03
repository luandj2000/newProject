package newPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		
		// Create a file on your file system
		String testFile = "c:\\JavaInspiredTesting\\upload test.txt";
		// Create an object of the java file class
		File FC = new File(testFile);
		// Create the file
		FC.createNewFile();
		
		//Writing In to file/
		//Create Object of java FileWriter and BufferWriter class.
		FileWriter FW = new FileWriter(testFile);
		BufferedWriter BW = new BufferedWriter(FW);
		BW.write("This Is First line");
		BW.newLine();//To write next string on new line.
		BW.write("This Is Second Line");
		BW.close();
		// must close otherwise print won't work (apparently)
		
		//Reading from file.
		// Create Object of java FileReader and BufferedReader class.
		FileReader FR = new FileReader(testFile);
		BufferedReader BR = new BufferedReader(FR);
		String Content = "";
				//Loop to read all lines one by one from file and print It.
			while((Content = BR.readLine())!= null){
				System.out.println(Content);
		}
		
		BR.close();
	}

}
