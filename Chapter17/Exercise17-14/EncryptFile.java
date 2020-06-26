/**
 * Date: 6/26/20
 * Author: Adam Grimshaw
 * Course: OOP
 * Description: Reads a source files and encrypts the data into a target file.
 */

import java.io.*;
import java.util.Scanner;

public class EncryptFile {
  public static void main(String[] args) throws IOException { 
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Please enter the name of your source file: ");
	  File sourceFile = new File(input.next());
	  
	  System.out.print("Please enter the name of your target file: ");
	  File targetFile = new File(input.next());

	  
	  
    // Check if source file exists
    if (!sourceFile.exists()) {
       System.out.println("Source file does not exist");
       System.exit(2);
    }

    // Check if target file exists
    if (targetFile.exists()) {
      System.out.println("Target file already exists");
      System.exit(3);
    }

    try (
      // Create an input stream
      BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile));
  
      // Create an output stream
      BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(targetFile));
    ) {
      // Continuously read a byte from input and write it to output
      int r, numberOfBytesCopied = 0;
      while ((r = inputStream.read()) != -1) {
        outputStream.write((byte)(r + 5));
        numberOfBytesCopied++;
      }

      // Display the file size
      System.out.println(numberOfBytesCopied + " bytes copied");
    }
  }
}
