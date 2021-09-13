/**
 * @(#)CopyFile.java
 *
 *
 * @author
 * @version 1.00 2021/5/12
 */

import java.io.*;

public class CopyFile {

    public static void main(String args[]) throws IOException{
    	//Byte Stream
    	FileInputStream in = null;
    	FileOutputStream out = null;

		//Character Stream
		FileReader inFile = null;
		FileWriter outFile = null;

		//Try Catch for Byte stream
    	try{
    		in = new FileInputStream("ByteInput.txt");
    		out = new FileOutputStream("ByteOutput.txt");

    		int b;
    		while((b = in.read()) != -1){
    			out.write(b);
    			}//end while
    		}finally{
    			if(in != null){
    				in.close();
    			}//end if
    			if(out != null){
    				out.close();
    				}//end if

    				}//end finally



    	System.out.println("File ByteOutput.txt created and contents from ByteInput.txt copied to new file");


    }//end main


}//end class