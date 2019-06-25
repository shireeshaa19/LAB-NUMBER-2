package gcdemos;

import java.util.Scanner;

public class labnumber2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String ans = "";
		do{
	    System.out.print("Enter Width:");
	     int width = scnr.nextInt();
	    System.out.print("Enter height:");
	    int height = scnr.nextInt();
	    
	    int Area = width * height;
	    System.out.println("Area : " + Area);
	    int perimeter = 2 * (width * height);
	    System.out.println("Perimeter : " + perimeter);
	    
	    
	    System.out.println("would you like to continue?(y/n)" );
	    ans = scnr.next();
		} while (ans.equals("y"));
	      
          
	}
   
}
