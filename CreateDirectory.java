/**
 * @(#)CreateDirectory.java
 *
 *
 * @author
 * @version 1.00 2021/5/13
 */
//This program creates parent and all child directories in C drive.


import java.io.File;
public class CreateDirectory {

    public static void main(String args[]) {
    	String directoryName = "/first/second/third/fourth";
    	File d = new File(directoryName);

    	//Create Directories Now.
    	d.mkdirs();

    }//end main


}//end class