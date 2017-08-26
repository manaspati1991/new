package String;

import java.util.Scanner;

public class SwapOfTwoString {


	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the first String");
	    String firstString=scan.nextLine();
	
	    System.out.println("enter the second String");
	    String secondString=scan.nextLine();
	    
	    
	    //string value  manaspati
	     //               manas
	    firstString=firstString+secondString;
	    
	    secondString=firstString.substring(0,firstString.length()-secondString.length());
	    System.out.println(secondString);
	    
	    
	    firstString=firstString.substring(secondString.length());
	    System.out.println(firstString);
	    
	    
	    
	}
}
