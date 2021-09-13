/**
 * @(#)ReadConsole.java
 *
 *
 * @author
 * @version 1.00 2021/5/13
 */

import java.io.*;
public class ReadConsole {

    public static void main(String args[]) throws IOException {
    	InputStreamReader cin = null;

    	try{
    		cin = new InputStreamReader(System.in);
    		System.out.println("Enter Characters, 'q' to quit.");
    		char c;
    		do{
    			c = (char) cin.read();
    			System.out.print(c);
    		}// end do

    		while(c != 'q');
    		}finally{
    			if (cin != null){
    				cin.close();
    				}//end if
    		}//end finally block


    }//end main


}//end class