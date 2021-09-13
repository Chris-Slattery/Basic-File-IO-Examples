/**
 * @(#)ReadDirectory.java
 *
 *
 * @author
 * @version 1.00 2021/5/13
 */
//This program is used to list all the files and directories in a certain directory.
//Choose which direcroty to print by changing create file object, paths are in C drive.


import java.io.File;
public class ReadDirectory {

    public static void main(String args[]) {
    	File file = null;
    	String[] paths;

    	try{
    		//create new file object
    		file = new File("/Users");

    		//array of files and directories
    		paths = file.list();

    		//for each name in the path array
    		for(String path:paths){
    			//print file name and directory name
    			System.out.println(path);
    		}//end for

    		//throw exception if any error occurs
    	} catch (Exception e) {
    		e.printStackTrace();
    	}//end catch


    }//end main


}//end class