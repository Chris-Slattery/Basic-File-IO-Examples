/**
 * @(#)FileStreamTest.java
 *
 *
 * @author
 * @version 1.00 2021/5/13
 */

import java.io.*;
public class FileStreamTest {

    public static void main(String args[]) {

    	try{
    		byte bWrite [] = {11,21,3,40,5};
    		OutputStream os = new FileOutputStream("test.txt");
    		for (int x = 0; x < bWrite.length; x++){
    			os.write(bWrite[x]); //writes the bytes
    		}//end for
    		os.close();  //close stream to prevent memory leaks

    		InputStream is = new FileInputStream("test.txt");
    		int size = is.available();

    		for(int i = 0; i < size; i++){
    			System.out.print((char)is.read() + " ");
    		}//end for
    		is.close();   //close to prevent memory leakage
    	} catch (IOException e) {
    		System.out.print("Exception");
    	}//ene catch


    }//end main method


}//end class